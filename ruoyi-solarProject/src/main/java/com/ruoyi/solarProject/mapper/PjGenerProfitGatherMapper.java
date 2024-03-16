package com.ruoyi.solarProject.mapper;

import com.ruoyi.solarProject.domain.PjGenerProfitGather;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface PjGenerProfitGatherMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PjGenerProfitGather selectPjGenerProfitGatherByPjNo(String pjNo);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PjGenerProfitGather> selectPjGenerProfitGatherList(PjGenerProfitGather pjGenerProfitGather);

    /**
     * 新增【请填写功能名称】
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    public int insertPjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather);

    /**
     * 修改【请填写功能名称】
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    public int updatePjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather);

    /**
     * 删除【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePjGenerProfitGatherByPjNo(String pjNo);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param pjNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePjGenerProfitGatherByPjNos(String[] pjNos);
}
