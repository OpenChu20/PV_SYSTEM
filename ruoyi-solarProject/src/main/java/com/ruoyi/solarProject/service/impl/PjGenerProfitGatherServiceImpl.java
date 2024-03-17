package com.ruoyi.solarProject.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitGather;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.domain.vo.ProfitGatherVo;
import com.ruoyi.solarProject.mapper.PjBaseInfoMapper;
import com.ruoyi.solarProject.mapper.PjGenerProfitGatherMapper;
import com.ruoyi.solarProject.service.IPjGenerProfitGatherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ruoyi.common.constant.SolarProjectConstants.IS_NO;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigDecimal.ZERO;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjGenerProfitGatherServiceImpl implements IPjGenerProfitGatherService
{
    @Autowired
    private PjGenerProfitGatherMapper pjGenerProfitGatherMapper;
    @Autowired
    private PjBaseInfoMapper pjBaseInfoMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public ProfitGatherVo selectPjGenerProfitGatherByPjNo(String pjNo)
    {
        ProfitGatherVo profitGatherVo = new ProfitGatherVo();
        pjGenerProfitGatherMapper.selectPjGenerProfitGatherByPjNo(pjNo);
        BeanUtils.copyProperties( pjGenerProfitGatherMapper.selectPjGenerProfitGatherByPjNo(pjNo), profitGatherVo);

        PjBaseInfo pjBaseInfo = pjBaseInfoMapper.selectPjBaseInfoByPjNo(pjNo);
        profitGatherVo.setPjTotalPrice(pjBaseInfo.getPjTotalPrice());

        return profitGatherVo;
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PjGenerProfitGather> selectPjGenerProfitGatherList(PjGenerProfitGather pjGenerProfitGather)
    {
        return pjGenerProfitGatherMapper.selectPjGenerProfitGatherList(pjGenerProfitGather);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather)
    {
        pjGenerProfitGather.setCreateTime(DateUtils.getNowDate());
        return pjGenerProfitGatherMapper.insertPjGenerProfitGather(pjGenerProfitGather);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param pjGenerProfitGather 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePjGenerProfitGather(PjGenerProfitGather pjGenerProfitGather)
    {
        return pjGenerProfitGatherMapper.updatePjGenerProfitGather(pjGenerProfitGather);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param pjNos 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitGatherByPjNos(String[] pjNos)
    {
        return pjGenerProfitGatherMapper.deletePjGenerProfitGatherByPjNos(pjNos);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePjGenerProfitGatherByPjNo(String pjNo)
    {
        return pjGenerProfitGatherMapper.deletePjGenerProfitGatherByPjNo(pjNo);
    }

    @Override
    public void caculateProfitAmount(List<PjGenerProfitTest> pjGenerProfitTestList) {
        PjGenerProfitGather profitGather = new PjGenerProfitGather();
        BigDecimal totalGener = pjGenerProfitTestList.stream().map(PjGenerProfitTest :: getAnnulGenerate)
                .reduce(ZERO,BigDecimal::add).setScale(2, ROUND_HALF_UP);
        BigDecimal totalSavePrice = pjGenerProfitTestList.stream().map(PjGenerProfitTest :: getSaveElecPrice)
                .reduce(ZERO,BigDecimal::add).setScale(2, ROUND_HALF_UP);
        BigDecimal totalSendState = pjGenerProfitTestList.stream().map(PjGenerProfitTest :: getSendStateIncome)
                .reduce(ZERO,BigDecimal::add).setScale(2, ROUND_HALF_UP);
        BigDecimal totalIncomme = pjGenerProfitTestList.stream().map(PjGenerProfitTest :: getAnnulIncome)
                .reduce(ZERO,BigDecimal::add).setScale(2, ROUND_HALF_UP);
        BigDecimal totalIncommeRatio = pjGenerProfitTestList.stream().map(PjGenerProfitTest :: getIncomeRatioAnnul)
                .reduce(ZERO,BigDecimal::add).setScale(4, ROUND_HALF_UP);
        profitGather.setPjNo(pjGenerProfitTestList.get(0).getPjNo());
        profitGather.setTotalGenerate(totalGener);
        profitGather.setAvgGenerate(totalGener.divide(BigDecimal.valueOf(25)).setScale(2, ROUND_HALF_UP));
        profitGather.setSumSavePrice(totalSavePrice);
        profitGather.setSumSendStateIncome(totalSendState);
        profitGather.setSumAnnulIncome(totalIncomme);
        profitGather.setAvgIncomeRatioAnnul(totalIncommeRatio.divide(new BigDecimal(25)).setScale(4, ROUND_HALF_UP));
        profitGather.setSumIncomeRatioAnnul(totalIncommeRatio);
        profitGather.setSumIncomeRatioTotal(totalIncommeRatio);
        profitGather.setIsDelete(IS_NO);

        pjGenerProfitGatherMapper.caculateProfitGather(profitGather);
    }
}
