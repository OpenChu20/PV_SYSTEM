package com.ruoyi.solarProject.mapper;

import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface PjBaseInfoMapper
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
     * 删除【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePjBaseInfoByPjNo(String pjNo);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param pjNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePjBaseInfoByPjNos(String[] pjNos);


}
