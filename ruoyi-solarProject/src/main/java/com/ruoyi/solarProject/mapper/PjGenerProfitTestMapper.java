package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.PjGenerProfitTest;

import java.util.List;

/**
 * 年Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-14
 */
public interface PjGenerProfitTestMapper
{
    /**
     * 查询年
     *
     * @param id 年主键
     * @return 年
     */
    public PjGenerProfitTest selectPjGenerProfitTestById(Long id);

    /**
     * 查询年列表
     *
     * @param pjGenerProfitTest 年
     * @return 年集合
     */
    public List<PjGenerProfitTest> selectPjGenerProfitTestList(PjGenerProfitTest pjGenerProfitTest);

    /**
     * 新增年
     *
     * @param pjGenerProfitTest 年
     * @return 结果
     */
    public int insertPjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest);

    /**
     * 修改年
     *
     * @param pjGenerProfitTest 年
     * @return 结果
     */
    public int updatePjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest);

    /**
     * 删除年
     *
     * @param id 年主键
     * @return 结果
     */
    public int deletePjGenerProfitTestById(Long id);

    /**
     * 批量删除年
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePjGenerProfitTestByIds(Long[] ids);
}
