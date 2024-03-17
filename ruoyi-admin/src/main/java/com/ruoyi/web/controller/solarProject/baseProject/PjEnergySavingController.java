package com.ruoyi.web.controller.solarProject.baseProject;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.service.IPjEnergySavingService;
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
@RequestMapping("/solarProject/saving")
public class PjEnergySavingController extends BaseController
{
    @Autowired
    private IPjEnergySavingService pjEnergySavingService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:saving:list')")
    @GetMapping("/list")
    public TableDataInfo list(PjEnergySaving pjEnergySaving)
    {
        startPage();
        List<PjEnergySaving> list = pjEnergySavingService.selectPjEnergySavingList(pjEnergySaving);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:saving:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PjEnergySaving pjEnergySaving)
    {
        List<PjEnergySaving> list = pjEnergySavingService.selectPjEnergySavingList(pjEnergySaving);
        ExcelUtil<PjEnergySaving> util = new ExcelUtil<PjEnergySaving>(PjEnergySaving.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:saving:query')")
    @GetMapping(value = "/{pjNo}")
    public AjaxResult getInfo(@PathVariable("pjNo") String pjNo)
    {
        return success(pjEnergySavingService.selectPjEnergySavingByPjNo(pjNo));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:saving:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PjEnergySaving pjEnergySaving)
    {
        return toAjax(pjEnergySavingService.insertPjEnergySaving(pjEnergySaving));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:saving:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PjEnergySaving pjEnergySaving)
    {
        return toAjax(pjEnergySavingService.updatePjEnergySaving(pjEnergySaving));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:saving:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pjNos}")
    public AjaxResult remove(@PathVariable String[] pjNos)
    {
        return toAjax(pjEnergySavingService.deletePjEnergySavingByPjNos(pjNos));
    }
}
