package com.ruoyi.web.controller.solarProject.export;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.domain.vo.ProfitGatherVo;
import com.ruoyi.solarProject.service.IPjBaseInfoService;
import com.ruoyi.solarProject.service.IPjEnergySavingService;
import com.ruoyi.solarProject.service.IPjGenerProfitGatherService;
import com.ruoyi.solarProject.service.IPjGenerProfitTestService;
import com.ruoyi.system.domain.SysLogininfor;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@RestController
@RequestMapping("/solarProject/export")
public class PjExportController extends BaseController
{

    @Autowired
    private IPjBaseInfoService pjBaseInfoService;
    @Autowired
    private IPjGenerProfitTestService pjGenerProfitTestService;
    @Autowired
    private IPjEnergySavingService pjEnergySavingService;
    @Autowired
    private IPjGenerProfitGatherService pjGenerProfitGatherService;

//    @Autowired
//    private ExportPPTUtil exportPPTUtil;

    @PreAuthorize("@ss.hasPermi('system:info:export')")
    @GetMapping("/exportPPT/{pjNo}")
    public HttpServletResponse export(HttpServletResponse response,@PathVariable(value = "pjNo") String pjNo)
    {
        //获取项目
        List<PjGenerProfitTest> pjGenerProfitTestServices = pjGenerProfitTestService.getGenerProfits(pjNo);
        PjBaseInfo pjBaseInfo = pjBaseInfoService.selectPjBaseInfoByPjNo(pjNo);
        PjEnergySaving pjEnergySaving = pjEnergySavingService.selectPjEnergySavingByPjNo(pjNo);
        ProfitGatherVo profitGatherVo = pjGenerProfitGatherService.selectPjGenerProfitGatherByPjNo(pjNo);
        //List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        //util.exportExcel(response, list, "登录日志");
        pjBaseInfoService.exportPPT(response,pjBaseInfo,pjEnergySaving,profitGatherVo,pjGenerProfitTestServices);
        return null;

    }
}
