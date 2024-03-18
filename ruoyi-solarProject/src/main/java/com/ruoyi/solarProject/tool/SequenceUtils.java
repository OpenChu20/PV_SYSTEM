package com.ruoyi.solarProject.tool;

import com.ruoyi.common.utils.uuid.Seq;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceUtils {

    // 上传序列类型
    public static final String solarPjType = "SLPJ";


    /**
     * 获取通用序列号
     *
     * @return 序列值
     */
    public static String getSolarPjId(String type)
    {
        return solarPjType + Seq.getId(solarPjType);
    }
}
