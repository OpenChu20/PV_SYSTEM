package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PjGenerProfitTestMapper;
import com.ruoyi.system.domain.PjGenerProfitTest;
import com.ruoyi.system.service.IPjGenerProfitTestService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjGenerProfitTestServiceImpl implements IPjGenerProfitTestService 
{
    @Autowired
    private PjGenerProfitTestMapper pjGenerProfitTestMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PjGenerProfitTest selectPjGenerProfitTestByPjNo(String pjNo)
    {
        return pjGenerProfitTestMapper.selectPjGenerProfitTestByPjNo(pjNo);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param pjGenerProfitTest 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PjGenerProfitTest> selectPjGenerProfitTestList(PjGenerProfitTest pjGenerProfitTest)
    {
        return pjGenerProfitTestMapper.selectPjGenerProfitTestList(pjGenerProfitTest);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param pjGenerProfitTest 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest)
    {
        pjGenerProfitTest.setCreateTime(DateUtils.getNowDate());
        return pjGenerProfitTestMapper.insertPjGenerProfitTest(pjGenerProfitTest);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param pjGenerProfitTest 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest)
    {
        return pjGenerProfitTestMapper.updatePjGenerProfitTest(pjGenerProfitTest);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param pjNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitTestByPjNos(String[] pjNos)
    {
        return pjGenerProfitTestMapper.deletePjGenerProfitTestByPjNos(pjNos);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitTestByPjNo(String pjNo)
    {
        return pjGenerProfitTestMapper.deletePjGenerProfitTestByPjNo(pjNo);
    }
}
