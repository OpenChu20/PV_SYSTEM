package com.ruoyi.solarProject.service.impl;

import java.util.List;
import java.util.Random;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.Seq;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.mapper.PjBaseInfoMapper;
import com.ruoyi.solarProject.service.IPjBaseInfoService;
import com.ruoyi.solarProject.tool.SequenceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
