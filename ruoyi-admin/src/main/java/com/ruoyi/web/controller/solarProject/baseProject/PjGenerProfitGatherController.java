package com.ruoyi.web.controller.solarProject.baseProject;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.solarProject.domain.PjGenerProfitGather;
import com.ruoyi.solarProject.service.IPjGenerProfitGatherService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/solarProject/gather")
public class PjGenerProfitGatherController extends BaseController
{
    @Autowired
    private IPjGenerProfitGatherService pjGenerProfitGatherService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:gather:list')")
    @GetMapping("/list")
    public TableDataInfo list(PjGenerProfitGather pjGenerProfitGather)
    {
        startPage();
        List<PjGenerProfitGather> list = pjGenerProfitGatherService.selectPjGenerProfitGatherList(pjGenerProfitGather);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:gather:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PjGenerProfitGather pjGenerProfitGather)
    {
        List<PjGenerProfitGather> list = pjGenerProfitGatherService.selectPjGenerProfitGatherList(pjGenerProfitGather);
        ExcelUtil<PjGenerProfitGather> util = new ExcelUtil<PjGenerProfitGather>(PjGenerProfitGather.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gather:query')")
    @GetMapping(value = "/{pjNo}")
    public AjaxResult getInfo(@PathVariable("pjNo") String pjNo)
    {
        return success(pjGenerProfitGatherService.selectPjGenerProfitGatherByPjNo(pjNo));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gather:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PjGenerProfitGather pjGenerProfitGather)
    {
        return toAjax(pjGenerProfitGatherService.insertPjGenerProfitGather(pjGenerProfitGather));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gather:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PjGenerProfitGather pjGenerProfitGather)
    {
        return toAjax(pjGenerProfitGatherService.updatePjGenerProfitGather(pjGenerProfitGather));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gather:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pjNos}")
    public AjaxResult remove(@PathVariable String[] pjNos)
    {
        return toAjax(pjGenerProfitGatherService.deletePjGenerProfitGatherByPjNos(pjNos));
    }
}
