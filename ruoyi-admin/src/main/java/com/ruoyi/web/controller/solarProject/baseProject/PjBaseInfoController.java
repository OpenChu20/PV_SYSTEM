package com.ruoyi.web.controller.solarProject.baseProject;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.service.IPjBaseInfoService;

import com.ruoyi.solarProject.service.IPjGenerProfitTestService;
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

import static com.ruoyi.common.constant.SolarProjectConstants.IS_NO;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/solarProject/baseInfo")
public class PjBaseInfoController extends BaseController
{
    @Autowired
    private IPjBaseInfoService pjBaseInfoService;
    @Autowired
    private IPjGenerProfitTestService pjGenerProfitTestService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(PjBaseInfo pjBaseInfo)
    {
        startPage();
        List<PjBaseInfo> list = pjBaseInfoService.selectPjBaseInfoList(pjBaseInfo);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PjBaseInfo pjBaseInfo)
    {
        List<PjBaseInfo> list = pjBaseInfoService.selectPjBaseInfoList(pjBaseInfo);
        ExcelUtil<PjBaseInfo> util = new ExcelUtil<PjBaseInfo>(PjBaseInfo.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:info:query')")
    @GetMapping(value = "/{pjNo}")
    public AjaxResult getInfo(@PathVariable("pjNo") String pjNo)
    {
        return success(pjBaseInfoService.selectPjBaseInfoByPjNo(pjNo));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:info:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PjBaseInfo pjBaseInfo)
    {
        pjBaseInfo.setIsDelete(IS_NO);
        return toAjax(pjBaseInfoService.insertPjBaseInfo(pjBaseInfo));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:info:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping(value = "/update")
    public AjaxResult edit(@RequestBody PjBaseInfo pjBaseInfo)
    {
        System.out.println(pjBaseInfo);
        pjGenerProfitTestService.pjGenerProfitTest(pjBaseInfo);
        return toAjax(pjBaseInfoService.updatePjBaseInfo(pjBaseInfo));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:info:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{pjNos}")
    public AjaxResult remove(@PathVariable String[] pjNos)
    {
        return toAjax(pjBaseInfoService.deletePjBaseInfoByPjNos(pjNos));
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:info:getGenerProfits')")
    @GetMapping("/getGenerProfits")
    public TableDataInfo getGenerProfits(PjBaseInfo pjBaseInfo)
    {
        String pjNo = pjBaseInfo.getPjNo();
        List<PjGenerProfitTest> list = pjBaseInfoService.getGenerProfits(pjNo);
        return getDataTable(list);
    }

}
