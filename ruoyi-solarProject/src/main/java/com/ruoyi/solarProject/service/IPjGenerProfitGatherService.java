package com.ruoyi.solarProject.service;

import com.ruoyi.solarProject.domain.PjGenerProfitGather;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.domain.vo.ProfitGatherVo;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface IPjGenerProfitGatherService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public ProfitGatherVo selectPjGenerProfitGatherByPjNo(String pjNo);

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
     * 批量删除【请填写功能名称】
     *
     * @param pjNos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePjGenerProfitGatherByPjNos(String[] pjNos);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePjGenerProfitGatherByPjNo(String pjNo);

    /**
     * @desc 计算收益汇总相关值
     * @date 2024-03-18
     * @author 王渊超
     * @param
     * @change   修改原因   修改时间   修改人员
     */
    public PjGenerProfitGather caculateProfitAmount(List<PjGenerProfitTest> pjGenerProfitTestList);
}
