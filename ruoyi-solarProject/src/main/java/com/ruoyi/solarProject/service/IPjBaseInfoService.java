package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PjBaseInfo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
public interface IPjBaseInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PjBaseInfo selectPjBaseInfoByPjNo(String pjNo);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pjBaseInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PjBaseInfo> selectPjBaseInfoList(PjBaseInfo pjBaseInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param pjBaseInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertPjBaseInfo(PjBaseInfo pjBaseInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param pjBaseInfo 【请填写功能名称】
     * @return 结果
     */
    public int updatePjBaseInfo(PjBaseInfo pjBaseInfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pjNos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deletePjBaseInfoByPjNos(String[] pjNos);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePjBaseInfoByPjNo(String pjNo);
}
