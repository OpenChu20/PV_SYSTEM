package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.PjGenerProfitTest;
import com.ruoyi.system.service.IPjGenerProfitTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/system/test")
public class PjGenerProfitTestController extends BaseController
{
    @Autowired
    private IPjGenerProfitTestService pjGenerProfitTestService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(PjGenerProfitTest pjGenerProfitTest)
    {
        startPage();
        List<PjGenerProfitTest> list = pjGenerProfitTestService.selectPjGenerProfitTestList(pjGenerProfitTest);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:test:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PjGenerProfitTest pjGenerProfitTest)
    {
        List<PjGenerProfitTest> list = pjGenerProfitTestService.selectPjGenerProfitTestList(pjGenerProfitTest);
        ExcelUtil<PjGenerProfitTest> util = new ExcelUtil<PjGenerProfitTest>(PjGenerProfitTest.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:test:query')")
    @GetMapping(value = "/{pjNo}")
    public AjaxResult getInfo(@PathVariable("pjNo") String pjNo)
    {
        return success(pjGenerProfitTestService.selectPjGenerProfitTestByPjNo(pjNo));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:test:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PjGenerProfitTest pjGenerProfitTest)
    {
        return toAjax(pjGenerProfitTestService.insertPjGenerProfitTest(pjGenerProfitTest));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:test:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PjGenerProfitTest pjGenerProfitTest)
    {
        return toAjax(pjGenerProfitTestService.updatePjGenerProfitTest(pjGenerProfitTest));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:test:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{pjNos}")
    public AjaxResult remove(@PathVariable String[] pjNos)
    {
        return toAjax(pjGenerProfitTestService.deletePjGenerProfitTestByPjNos(pjNos));
    }
}
