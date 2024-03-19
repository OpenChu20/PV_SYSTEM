package com.ruoyi.solarProject.service.impl;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.domain.PjGenerProfitGather;
import com.ruoyi.solarProject.mapper.PjEnergySavingMapper;
import com.ruoyi.solarProject.service.IPjEnergySavingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.ruoyi.common.constant.SolarProjectConstants.*;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-10
 */
@Service
public class PjEnergySavingServiceImpl implements IPjEnergySavingService
{
    @Autowired
    private PjEnergySavingMapper pjEnergySavingMapper;


    @Override
    public void caculateSavingAmount(PjGenerProfitGather profitGather) {
        PjEnergySaving pjEnergySaving = new PjEnergySaving();
        BigDecimal avgGener = profitGather.getAvgGenerate();
        pjEnergySaving.setCoalSavingAverage(this.dealDifferentType(COAL,avgGener));
        pjEnergySaving.setCarbonSavingAverage(this.dealDifferentType(CARBON,avgGener));
        pjEnergySaving.setSulfurSavingAverage(this.dealDifferentType(SULFUR,avgGener));
        pjEnergySaving.setNitricSavingAverage(this.dealDifferentType(NITUIC,avgGener));
        pjEnergySaving.setSmokeSavingAverage(this.dealDifferentType(SMOKE,avgGener));
        pjEnergySaving.setPjNo(profitGather.getPjNo());
        pjEnergySaving.setIsDelete(IS_NO);
        pjEnergySavingMapper.insetOrUpdateEnergySaving(pjEnergySaving);
    }

    private int dealDifferentType(String savingType, BigDecimal avgGener){
        BigDecimal param;
        switch (savingType){
            case COAL:
                param = new BigDecimal(0.335);
                break;
            case CARBON:
                param = new BigDecimal(0.997);
                break;
            case SULFUR:
                param = new BigDecimal(0.03);
                break;
            case NITUIC:
                param = new BigDecimal(0.015);
                break;
            default:
                param = new BigDecimal(0.272);
        }

        return avgGener.multiply(param).multiply(new BigDecimal(10)).intValue();
    }
}

