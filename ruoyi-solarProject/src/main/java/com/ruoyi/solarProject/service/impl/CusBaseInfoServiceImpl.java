package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CusBaseInfoMapper;
import com.ruoyi.system.domain.CusBaseInfo;
import com.ruoyi.system.service.ICusBaseInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class CusBaseInfoServiceImpl implements ICusBaseInfoService 
{
    @Autowired
    private CusBaseInfoMapper cusBaseInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param cusNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public CusBaseInfo selectCusBaseInfoByCusNo(String cusNo)
    {
        return cusBaseInfoMapper.selectCusBaseInfoByCusNo(cusNo);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param cusBaseInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CusBaseInfo> selectCusBaseInfoList(CusBaseInfo cusBaseInfo)
    {
        return cusBaseInfoMapper.selectCusBaseInfoList(cusBaseInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param cusBaseInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCusBaseInfo(CusBaseInfo cusBaseInfo)
    {
        cusBaseInfo.setCreateTime(DateUtils.getNowDate());
        return cusBaseInfoMapper.insertCusBaseInfo(cusBaseInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param cusBaseInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCusBaseInfo(CusBaseInfo cusBaseInfo)
    {
        return cusBaseInfoMapper.updateCusBaseInfo(cusBaseInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param cusNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCusBaseInfoByCusNos(String[] cusNos)
    {
        return cusBaseInfoMapper.deleteCusBaseInfoByCusNos(cusNos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param cusNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteCusBaseInfoByCusNo(String cusNo)
    {
        return cusBaseInfoMapper.deleteCusBaseInfoByCusNo(cusNo);
    }
}
