package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CusBaseInfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
public interface CusBaseInfoMapper 
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
     * 删除【请填写功能名称】
     * 
     * @param cusNo 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteCusBaseInfoByCusNo(String cusNo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param cusNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCusBaseInfoByCusNos(String[] cusNos);
}
