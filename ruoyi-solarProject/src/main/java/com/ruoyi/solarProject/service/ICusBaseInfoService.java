package com.ruoyi.solarProject.service;

import com.ruoyi.solarProject.domain.CusBaseInfo;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface ICusBaseInfoService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param cusNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public CusBaseInfo selectCusBaseInfoByCusNo(String cusNo);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param cusBaseInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CusBaseInfo> selectCusBaseInfoList(CusBaseInfo cusBaseInfo);

    /**
     * 新增【请填写功能名称】
     *
     * @param cusBaseInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertCusBaseInfo(CusBaseInfo cusBaseInfo);

    /**
     * 修改【请填写功能名称】
     *
     * @param cusBaseInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateCusBaseInfo(CusBaseInfo cusBaseInfo);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param cusNos 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteCusBaseInfoByCusNos(String[] cusNos);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param cusNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCusBaseInfoByCusNo(String cusNo);
}