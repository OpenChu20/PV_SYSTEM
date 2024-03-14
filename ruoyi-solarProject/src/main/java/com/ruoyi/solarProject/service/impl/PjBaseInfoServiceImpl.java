package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.Random;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.PjGenerProfitTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PjBaseInfoMapper;
import com.ruoyi.system.domain.PjBaseInfo;
import com.ruoyi.system.service.IPjBaseInfoService;

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
        Random random = new Random();
        pjBaseInfo.setPjNo("PP"+random.nextInt(90)+10);
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

    @Override
    public List<PjGenerProfitTest> getGenerProfits(String pjNo) {
        return pjBaseInfoMapper.getGenerProfits(pjNo);
    }
}
