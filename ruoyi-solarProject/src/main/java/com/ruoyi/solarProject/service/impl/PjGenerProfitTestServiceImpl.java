package com.ruoyi.solarProject.service.impl;


import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import com.ruoyi.solarProject.mapper.PjBaseInfoMapper;
import com.ruoyi.solarProject.mapper.PjGenerProfitTestMapper;
import com.ruoyi.solarProject.service.IPjGenerProfitGatherService;
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
    @Autowired
    private PjBaseInfoMapper pjBaseInfoMapper;
    @Autowired
    private IPjGenerProfitGatherService pjGenerProfitGatherService;

    @Override
    public List<PjGenerProfitTest> pjGenerProfitTest(PjGenerProfitTest pjGenerProfitTest) {
        int i;
        BigDecimal firstDecreasePoint = pjGenerProfitTest.getFirstDecreaseValue().divide(new BigDecimal(100));
        BigDecimal otherDecreasePoint = pjGenerProfitTest.getOtherDecreaseValue().divide(new BigDecimal(100));
        String pjNo = pjGenerProfitTest.getPjNo();
        PjBaseInfo pjBaseInfo = pjBaseInfoMapper.selectPjBaseInfoByPjNo(pjGenerProfitTest.getPjNo());
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
        BigDecimal firstGenerC = firstGener.multiply(new BigDecimal(0.9)).setScale(4, ROUND_HALF_UP);
        firstGenerTest.setId(IdUtils.randomId());
        firstGenerTest.setPjNo(pjNo);
        firstGenerTest.setYear("1");
        firstGenerTest.setFirstDecreaseValue(firstDecreasePoint);
        firstGenerTest.setOtherDecreaseValue(otherDecreasePoint);
        firstGenerTest.setAnnulGenerate(firstGener);
        firstGenerTest.setAnnulGenerateC(firstGenerC);
        // 节省电费
        firstGenerTest.setSaveElecPrice(firstGenerTest.getAnnulGenerate().multiply(pjBaseInfo.getSelfUsePart())
                .multiply(pjBaseInfo.getElectPrice()).setScale(2, ROUND_HALF_UP));

        // 余电上网
        firstGenerTest.setSendStateIncome(firstGenerTest.getAnnulGenerate()
                .multiply(BigDecimal.ONE.subtract(pjBaseInfo.getSelfUsePart()))
                .multiply(pjBaseInfo.getSendStatePrice())
                .setScale(2, ROUND_HALF_UP));

        //年净收益
        firstGenerTest.setAnnulIncome(firstGenerTest.getSaveElecPrice()
                .add(firstGenerTest.getSendStateIncome()).setScale(2, ROUND_HALF_UP));

        // 年投资回报率
        firstGenerTest.setIncomeRatioAnnul( firstGenerTest.getAnnulIncome()
                .divide(pjBaseInfo.getPjTotalPrice(), 4, ROUND_HALF_UP));

        // 总投资回报率
        firstGenerTest.setIncomeRatioTotal(firstGenerTest.getIncomeRatioAnnul());
        firstGenerTest.setIsDelete(IS_NO);
        pjGenerProfitList.add(firstGenerTest);

        //第二年
        BigDecimal secondGener = firstGener.multiply(new BigDecimal(1).subtract(firstDecreasePoint)).setScale(4, ROUND_HALF_UP);
        BigDecimal secondGenerC = firstGenerC.multiply(new BigDecimal(1).subtract(firstDecreasePoint)).setScale(4, ROUND_HALF_UP);
        PjGenerProfitTest secondGenerTest = new PjGenerProfitTest();
        firstGenerTest.setId(IdUtils.randomId());

        secondGenerTest.setPjNo(pjNo);
        secondGenerTest.setYear(SECOND_YEAR);
        secondGenerTest.setAnnulGenerate(secondGener);
        secondGenerTest.setAnnulGenerateC(secondGenerC);
        // 节省电费
        secondGenerTest.setSaveElecPrice(secondGenerTest.getAnnulGenerate()
                .multiply(pjBaseInfo.getSelfUsePart())
                .multiply(pjBaseInfo.getElectPrice()).setScale(2, ROUND_HALF_UP));
        // 余电上网
        secondGenerTest.setSendStateIncome(secondGenerTest.getAnnulGenerate()
                .multiply(BigDecimal.ONE.subtract(pjBaseInfo.getSelfUsePart()))
                .multiply(pjBaseInfo.getSendStatePrice())
                .setScale(2, ROUND_HALF_UP));
        //年净收益
        secondGenerTest.setAnnulIncome(secondGenerTest.getSaveElecPrice()
                .add(secondGenerTest.getSendStateIncome()).setScale(2, ROUND_HALF_UP));
        // 年投资回报率
        secondGenerTest.setIncomeRatioAnnul( secondGenerTest.getAnnulIncome()
                .divide(pjBaseInfo.getPjTotalPrice(),4, ROUND_HALF_UP));
        // 总投资回报率
        secondGenerTest.setIncomeRatioTotal(secondGenerTest.getIncomeRatioAnnul()
                .add(firstGenerTest.getIncomeRatioTotal()));
        secondGenerTest.setIsDelete(IS_NO);
        pjGenerProfitList.add(secondGenerTest);

        for (i = 3; i <= 25; i++) {
            final int n = i-1;
            PjGenerProfitTest otherGenerTest = new PjGenerProfitTest();
            String yearSequence = String.valueOf(i);
            PjGenerProfitTest before = pjGenerProfitList.stream().filter(body -> String.valueOf(n).equals(body.getYear())).findAny().get();
            BigDecimal solarGener = before.getAnnulGenerate().multiply(new BigDecimal(1).subtract(otherDecreasePoint)).setScale(4, ROUND_HALF_UP);
            BigDecimal solarGenerC = before.getAnnulGenerateC().multiply(new BigDecimal(1).subtract(otherDecreasePoint)).setScale(4, ROUND_HALF_UP);
            firstGenerTest.setId(IdUtils.randomId());

            otherGenerTest.setPjNo(pjNo);
            otherGenerTest.setYear(yearSequence);
            otherGenerTest.setAnnulGenerate(solarGener);
            otherGenerTest.setAnnulGenerateC(solarGenerC);
            // 节省电费
            otherGenerTest.setSaveElecPrice(otherGenerTest.getAnnulGenerate().multiply(pjBaseInfo.getSelfUsePart())
                    .multiply(pjBaseInfo.getElectPrice())
                    .setScale(2, ROUND_HALF_UP));
            // 余电上网
            otherGenerTest.setSendStateIncome(otherGenerTest.getAnnulGenerate()
                    .multiply(BigDecimal.ONE.subtract(pjBaseInfo.getSelfUsePart()))
                    .multiply(pjBaseInfo.getSendStatePrice()).setScale(2, ROUND_HALF_UP));
            //年净收益
            otherGenerTest.setAnnulIncome(otherGenerTest.getSaveElecPrice()
                    .add(otherGenerTest.getSendStateIncome()).setScale(2, ROUND_HALF_UP));
            // 年投资回报率
            otherGenerTest.setIncomeRatioAnnul( otherGenerTest.getAnnulIncome()
                    .divide(pjBaseInfo.getPjTotalPrice(), 4,ROUND_HALF_UP));
            // 总投资回报率
            otherGenerTest.setIncomeRatioTotal(otherGenerTest.getIncomeRatioAnnul()
                    .add(before.getIncomeRatioTotal()));
            otherGenerTest.setIsDelete(IS_NO);

            pjGenerProfitList.add(otherGenerTest);
        }

        if (pjGenerProfitTestMapper.getGenerProfits(pjNo).isEmpty()){
            for (PjGenerProfitTest item : pjGenerProfitList) {
                pjGenerProfitTestMapper.insertPjGenerProfitTest(item);
            }
        }else {
            for (PjGenerProfitTest item : pjGenerProfitList) {
                pjGenerProfitTestMapper.updatePjGenerProfitTest(item);
            }
        }
        pjGenerProfitGatherService.caculateProfitAmount(pjGenerProfitList);
        return pjGenerProfitList;
    }


    @Override
    public List<PjGenerProfitTest> getGenerProfits(String pjNo) {
        return pjGenerProfitTestMapper.getGenerProfits(pjNo);
    }
}
