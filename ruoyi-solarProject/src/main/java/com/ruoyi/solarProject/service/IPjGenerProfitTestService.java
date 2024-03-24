package com.ruoyi.solarProject.service;

import java.util.List;

import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface IPjGenerProfitTestService
{
//    /**
//     * 查询【请填写功能名称】
//     *
//     * @param pjNo 【请填写功能名称】主键
//     * @return 【请填写功能名称】
//     */
//    public PjGenerProfitTest selectPjGenerProfitTestByPjNo(String pjNo);
//
//    /**
//     * 查询【请填写功能名称】列表
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 【请填写功能名称】集合
//     */
//    public List<PjGenerProfitTest> selectPjGenerProfitTestList(PjGenerProfitTest pjGenerProfitTest);
//
//    /**
//     * 新增【请填写功能名称】
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 结果
//     */
//    public int insertPjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest);
//
//    /**
//     * 修改【请填写功能名称】
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 结果
//     */
//    public int updatePjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest);
//
//    /**
//     * 批量删除【请填写功能名称】
//     *
//     * @param pjNos 需要删除的【请填写功能名称】主键集合
//     * @return 结果
//     */
//    public int deletePjGenerProfitTestByPjNos(String[] pjNos);
//
//    /**
//     * 删除【请填写功能名称】信息
//     *
//     * @param pjNo 【请填写功能名称】主键
//     * @return 结果
//     */
//    public int deletePjGenerProfitTestByPjNo(String pjNo);

    /**
     * @Desc  光伏项目，根据基本信息进行发电、收益测算
     * @Author Wyc
     * @change
     */
    public List<PjGenerProfitTest> pjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest);

    /**
     * @Desc  根据项目编号，获取发电收益测算列表
     * @Author
     * @change
     */
    public List<PjGenerProfitTest> getGenerProfits(String pjNo);


    /**
     * @Desc  根据项目编号，获取发电收益测算条数，判断是否已存在测算值
     * @Author
     * @change
     */
    public int countTheTests(String pjNo);

}
