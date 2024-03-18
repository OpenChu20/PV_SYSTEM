package com.ruoyi.web.controller.solarProject.export;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
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
//    @Autowired
//    private ExportPPTUtil exportPPTUtil;

    @PostMapping("/exportPpt")
    public void export(HttpServletResponse response, SysUser user)
    {
//        List<SysUser> list = userIdsService.selectUserList(user);
        ExcelUtil<SysUser> util = new ExcelUtil<SysUser>(SysUser.class);
//        util.exportExcel(response, list, "用户数据");
    }
}
