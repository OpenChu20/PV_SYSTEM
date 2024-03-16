package com.ruoyi.solarProject.service.impl;


import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.mapper.PjGenerProfitTestMapper;
import com.ruoyi.solarProject.service.IPjGenerProfitTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.ruoyi.common.constant.SolarProjectConstants.*;
import static java.math.BigDecimal.ROUND_HALF_UP;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjGenerProfitTestServiceImpl implements IPjGenerProfitTestService {
    @Autowired
    private PjGenerProfitTestMapper pjGenerProfitTestMapper;

//    /**
//     * 查询【请填写功能名称】
//     *
//     * @param pjNo 【请填写功能名称】主键
//     * @return 【请填写功能名称】
//     */
//    @Override
//    public PjGenerProfitTest selectPjGenerProfitTestByPjNo(String pjNo)
//    {
//        return pjGenerProfitTestMapper.(pjNo);
//    }
//
//    /**
//     * 查询【请填写功能名称】列表
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 【请填写功能名称】
//     */
//    @Override
//    public List<PjGenerProfitTest> selectPjGenerProfitTestList(PjGenerProfitTest pjGenerProfitTest)
//    {
//        return pjGenerProfitTestMapper.selectPjGenerProfitTestList(pjGenerProfitTest);
//    }
//
//    /**
//     * 新增【请填写功能名称】
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 结果
//     */
//    @Override
//    public int insertPjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest)
//    {
//        pjGenerProfitTest.setCreateTime(DateUtils.getNowDate());
//        return pjGenerProfitTestMapper.insertPjGenerProfitTest(pjGenerProfitTest);
//    }
//
//    /**
//     * 修改【请填写功能名称】
//     *
//     * @param pjGenerProfitTest 【请填写功能名称】
//     * @return 结果
//     */
//    @Override
//    public int updatePjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest)
//    {
//        return pjGenerProfitTestMapper.updatePjGenerProfitTest(pjGenerProfitTest);
//    }
//
//    /**
//     * 批量删除【请填写功能名称】
//     *
//     * @param pjNos 需要删除的【请填写功能名称】主键
//     * @return 结果
//     */
//    @Override
//    public int deletePjGenerProfitTestByPjNos(String[] pjNos)
//    {
//        return pjGenerProfitTestMapper.deletePjGenerProfitTestByPjNos(pjNos);
//    }
//
//    /**
//     * 删除【请填写功能名称】信息
//     *
//     * @param pjNo 【请填写功能名称】主键
//     * @return 结果
//     */
//    @Override
//    public int deletePjGenerProfitTestByPjNo(String pjNo)
//    {
//        return pjGenerProfitTestMapper.deletePjGenerProfitTestByPjNo(pjNo);
//    }
    /**
     * 查询【请填写功能名称】
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
   /* @Override
    public PjGenerProfitTest selectPjGenerProfitTestByPjNo(String pjNo)
    {
        //return pjGenerProfitTestMapper.selectPjGenerProfitTestByPjNo(pjNo);
        return null;
    }*/

    @Override
    public void pjGenerProfitTest(PjBaseInfo pjBaseInfo) {
        int i;
        PjGenerProfitTest pjGenerProfit = new PjGenerProfitTest();
        List<PjGenerProfitTest> pjGenerProfitList = new ArrayList<>();
        //        首年发电
        //        单位发电量（kW·h/m²）x组件数量（片）x单块组件功率（W）/ 1000
        PjGenerProfitTest firstGenerTest = new PjGenerProfitTest();
        BigDecimal firstGener = new BigDecimal(pjBaseInfo.getPerPvGenr())
                .multiply(new BigDecimal(pjBaseInfo.getModulesNum()))
                .multiply(new BigDecimal(pjBaseInfo.getPerModulesRate()))
                .divide(new BigDecimal(1000))
                .divide(new BigDecimal(10000)).setScale(4, ROUND_HALF_UP);
        BigDecimal firstGenerC = firstGener.multiply(new BigDecimal(0.8)).setScale(4, ROUND_HALF_UP);
        firstGenerTest.setYear("1");
        firstGenerTest.setAnnulGenerate(firstGener);
        firstGenerTest.setAnnulGenerateC(firstGenerC);
        pjGenerProfitList.add(firstGenerTest);
        // 节省电费
        pjGenerProfitList.stream().forEach(item -> item.setSaveElecPrice(
                item.getAnnulGenerate().multiply(pjBaseInfo.getSelfUsePart())
                        .multiply(new BigDecimal(0.01)).multiply(pjBaseInfo.getElectPrice())
                        .setScale(2, ROUND_HALF_UP)));
        // 余电上网
        pjGenerProfitList.stream().forEach(item -> item.setSendStateIncome(
                item.getAnnulGenerate().multiply(BigDecimal.ONE.subtract(pjBaseInfo.getSelfUsePart()))
                        .multiply(new BigDecimal(0.01)).multiply(pjBaseInfo.getSendStatePrice())
                        .setScale(2, ROUND_HALF_UP)));
        //年净收益
        pjGenerProfitList.stream().forEach(item -> item.setAnnulIncome(
                item.getSaveElecPrice().add(item.getSendStateIncome()).setScale(2, ROUND_HALF_UP)));
        // 年投资回报率
        pjGenerProfitList.stream().forEach(item -> item.setIncomeRatioAnnul(
                item.getAnnulIncome().divide(pjBaseInfo.getPjTotalPrice()).setScale(2, ROUND_HALF_UP)));


        // 总投资回报率
        pjGenerProfitList.forEach(item -> {
            if (FIRST_YEAR.equals(item.getYear())) {
                item.setIncomeRatioTotal(item.getIncomeRatioAnnul());
            }
        });
        for (i = 2; i <= 25; i++) {
            final int m =i;
            final int n = i-1;
            PjGenerProfitTest before = pjGenerProfitList.stream().filter(body -> String.valueOf(n).equals(body.getYear())).findAny().get();
            PjGenerProfitTest after =  pjGenerProfitList.stream().filter(body -> String.valueOf(m).equals(body.getYear())).findAny().get();
            after.setIncomeRatioTotal(before.getIncomeRatioTotal().add(after.getIncomeRatioAnnul()));
        }


        //第二年
        BigDecimal secondGener = firstGener.multiply(new BigDecimal(1).subtract(pjGenerProfit.getFirstDecreaseValue()));
        BigDecimal secondGenerC = firstGenerC.multiply(new BigDecimal(1).subtract(pjGenerProfit.getFirstDecreaseValue()));
        PjGenerProfitTest secondGenerTest = new PjGenerProfitTest();
        secondGenerTest.setYear("2");
        secondGenerTest.setAnnulGenerate(secondGener);
        secondGenerTest.setAnnulGenerateC(secondGenerC);
        pjGenerProfitList.add(secondGenerTest);

        for (i = 3; i <= 25; i++) {
            PjGenerProfitTest otherGenerTest = new PjGenerProfitTest();
            String yearSequence = String.valueOf(i);
            BigDecimal solarGener = firstGener.multiply(new BigDecimal(1).subtract(pjGenerProfit.getOtherDecreaseValue()));
            otherGenerTest.setYear(yearSequence);
            otherGenerTest.setAnnulGenerate(solarGener);
            pjGenerProfitList.add(otherGenerTest);
        }
//        for (PjGenerProfitTest item : pjGenerProfitList) {
//            pjGenerProfitTestMapper.insertPjGenerProfitTest(item);
//        }
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param pjNo 【请填写功能名称】主键
     * @return 结果
     */
    /*@Override
    public int deletePjGenerProfitTestByPjNo(String pjNo)
    {
        return 0;
    }*/
    private void fixUpTest(PjGenerProfitTest firstGenerTest, List<PjGenerProfitTest> pjGenerProfitList) {
//        List<PjGenerProfitTest> pjGenerProfitList = new ArrayList<>();
//        //        首年发电
//        //        单位发电量（kW·h/m²）x组件数量（片）x单块组件功率（W）/ 1000
//        BigDecimal firstGenerC = firstGenerTest.getAnnulGenerate().multiply(new BigDecimal(0.8));
//        PjGenerProfitTest firstGenerTestC = new PjGenerProfitTest();
//        firstGenerTestC.setYear("1");
//        firstGenerTestC.setAnnulGenerate(firstGenerC);
//        pjGenerProfitList.add(firstGenerTest);


    }
}
