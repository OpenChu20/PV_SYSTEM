package com.ruoyi.solarProject.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.Seq;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.domain.vo.ProfitGatherVo;
import com.ruoyi.solarProject.mapper.PjBaseInfoMapper;
import com.ruoyi.solarProject.service.IPjBaseInfoService;
import com.ruoyi.solarProject.tool.SequenceUtils;
import com.ruoyi.solarProject.tool.util.ExportPPTUtil;
import com.ruoyi.system.service.ISysDictTypeService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

import static com.ruoyi.solarProject.tool.SequenceUtils.solarPjType;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjBaseInfoServiceImpl implements IPjBaseInfoService
{
    @Autowired
    private PjBaseInfoMapper pjBaseInfoMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PjBaseInfo selectPjBaseInfoByPjNo(String pjNo)
    {
        return pjBaseInfoMapper.selectPjBaseInfoByPjNo(pjNo);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param pjBaseInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PjBaseInfo> selectPjBaseInfoList(PjBaseInfo pjBaseInfo)
    {
        return pjBaseInfoMapper.selectPjBaseInfoList(pjBaseInfo);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param pjBaseInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPjBaseInfo(PjBaseInfo pjBaseInfo)
    {
        pjBaseInfo.setPjNo(SequenceUtils.getSolarPjId(solarPjType));
        pjBaseInfo.setCreateTime(DateUtils.getNowDate());
        return pjBaseInfoMapper.insertPjBaseInfo(pjBaseInfo);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param pjBaseInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePjBaseInfo(PjBaseInfo pjBaseInfo)
    {
        pjBaseInfoMapper.updatePjBaseInfo(pjBaseInfo);

        return pjBaseInfoMapper.updatePjBaseInfo(pjBaseInfo);
    }
    @Autowired
    private ISysDictTypeService dictTypeService;



    /**
     * 批量删除【请填写功能名称】
     *
     * @param pjNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjBaseInfoByPjNos(String[] pjNos)
    {
        return pjBaseInfoMapper.deletePjBaseInfoByPjNos(pjNos);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjBaseInfoByPjNo(String pjNo)
    {
        return pjBaseInfoMapper.deletePjBaseInfoByPjNo(pjNo);
    }

    @Override
    public Response exportPPT(HttpServletResponse response, PjBaseInfo pjBaseInfo, PjEnergySaving pjEnergySaving, ProfitGatherVo profitGatherVo, List<PjGenerProfitTest> pjGenerProfitTestServices) {
        ExportPPTUtil exportPPTUtil = new ExportPPTUtil();
        //安装材料
        List<SysDictData> roof_materials = dictTypeService.selectDictDataByType("roof_materials");
        //安装方式
        List<SysDictData> install_style = dictTypeService.selectDictDataByType("install_style");
        //防水方式
        List<SysDictData> water_proof_style = dictTypeService.selectDictDataByType("water_proof_style");
        Map<String,String> materials = new HashMap<>();
        //安装材料
        for(SysDictData sysDictData : roof_materials){
            materials.put(sysDictData.getDictValue()+"_roof_materials",sysDictData.getDictLabel());
        }
        for(SysDictData sysDictData : install_style){
            materials.put(sysDictData.getDictValue()+"_install_style",sysDictData.getDictLabel());
        }
        for(SysDictData sysDictData : water_proof_style){
            materials.put(sysDictData.getDictValue()+"_water_proof_style",sysDictData.getDictLabel());
        }


        try {
            ExportPPTUtil.exportPPT(response,pjBaseInfo,pjEnergySaving,profitGatherVo,pjGenerProfitTestServices,materials);
        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }


}
