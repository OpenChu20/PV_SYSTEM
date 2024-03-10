package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PjEnergySaving;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
public interface IPjEnergySavingService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PjEnergySaving selectPjEnergySavingByPjNo(String pjNo);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PjEnergySaving> selectPjEnergySavingList(PjEnergySaving pjEnergySaving);

    /**
     * 新增【请填写功能名称】
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 结果
     */
    public int insertPjEnergySaving(PjEnergySaving pjEnergySaving);

    /**
     * 修改【请填写功能名称】
     * 
     * @param pjEnergySaving 【请填写功能名称】
     * @return 结果
     */
    public int updatePjEnergySaving(PjEnergySaving pjEnergySaving);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pjNos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePjEnergySavingByPjNos(String[] pjNos);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePjEnergySavingByPjNo(String pjNo);
}
