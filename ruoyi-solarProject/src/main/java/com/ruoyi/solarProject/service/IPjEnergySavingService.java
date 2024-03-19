package com.ruoyi.solarProject.service;

import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.domain.PjGenerProfitGather;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-03-10
 */
public interface IPjEnergySavingService
{


    public PjEnergySaving selectPjEnergySavingByPjNo(String pjNo);

    public void caculateSavingAmount(PjGenerProfitGather ProfitGather);

}
