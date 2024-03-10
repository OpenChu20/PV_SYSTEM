package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PjGenerProfitGatherMapper;
import com.ruoyi.system.domain.PjGenerProfitGather;
import com.ruoyi.system.service.IPjGenerProfitGatherService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjGenerProfitGatherServiceImpl implements IPjGenerProfitGatherService 
{
    @Autowired
    private PjGenerProfitGatherMapper pjGenerProfitGatherMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PjGenerProfitGather selectPjGenerProfitGatherByPjNo(String pjNo)
    {
        return pjGenerProfitGatherMapper.selectPjGenerProfitGatherByPjNo(pjNo);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PjGenerProfitGather> selectPjGenerProfitGatherList(PjGenerProfitGather pjGenerProfitGather)
    {
        return pjGenerProfitGatherMapper.selectPjGenerProfitGatherList(pjGenerProfitGather);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather)
    {
        pjGenerProfitGather.setCreateTime(DateUtils.getNowDate());
        return pjGenerProfitGatherMapper.insertPjGenerProfitGather(pjGenerProfitGather);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather)
    {
        return pjGenerProfitGatherMapper.updatePjGenerProfitGather(pjGenerProfitGather);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pjNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitGatherByPjNos(String[] pjNos)
    {
        return pjGenerProfitGatherMapper.deletePjGenerProfitGatherByPjNos(pjNos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitGatherByPjNo(String pjNo)
    {
        return pjGenerProfitGatherMapper.deletePjGenerProfitGatherByPjNo(pjNo);
    }
}
