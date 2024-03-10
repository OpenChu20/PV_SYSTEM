package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PjEnergySavingMapper;
import com.ruoyi.system.domain.PjEnergySaving;
import com.ruoyi.system.service.IPjEnergySavingService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjEnergySavingServiceImpl implements IPjEnergySavingService 
{
    @Autowired
    private PjEnergySavingMapper pjEnergySavingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PjEnergySaving selectPjEnergySavingByPjNo(String pjNo)
    {
        return pjEnergySavingMapper.selectPjEnergySavingByPjNo(pjNo);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PjEnergySaving> selectPjEnergySavingList(PjEnergySaving pjEnergySaving)
    {
        return pjEnergySavingMapper.selectPjEnergySavingList(pjEnergySaving);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPjEnergySaving(PjEnergySaving pjEnergySaving)
    {
        pjEnergySaving.setCreateTime(DateUtils.getNowDate());
        return pjEnergySavingMapper.insertPjEnergySaving(pjEnergySaving);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePjEnergySaving(PjEnergySaving pjEnergySaving)
    {
        return pjEnergySavingMapper.updatePjEnergySaving(pjEnergySaving);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pjNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjEnergySavingByPjNos(String[] pjNos)
    {
        return pjEnergySavingMapper.deletePjEnergySavingByPjNos(pjNos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjEnergySavingByPjNo(String pjNo)
    {
        return pjEnergySavingMapper.deletePjEnergySavingByPjNo(pjNo);
    }
}
