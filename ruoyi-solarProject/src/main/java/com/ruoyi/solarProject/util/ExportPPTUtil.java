package com.ruoyi.solarProject.util;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import com.ruoyi.solarProject.domain.PjEnergySaving;
import com.ruoyi.solarProject.domain.PjGenerProfitGather;
import com.ruoyi.solarProject.domain.PjGenerProfitTest;
import org.apache.poi.xslf.usermodel.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * 导出PPT相关代码处理相关处理
 * 
 * @author ruoyi
 */
public class ExportPPTUtil<T>
{

    //基于项目编号导出对应的PPT模板
    public static void exportPPT(String projectNumber) throws Exception{
        try{
            PjBaseInfo pjBaseInfo = null;

            FileInputStream fis = new FileInputStream("//projectInfo.pptx");
            XMLSlideShow srcShow = new XMLSlideShow(fis);
            //获取所有幻灯片
            List<XSLFSlide> slides = srcShow.getSlides();
            XSLFSlide slide = slides.get(5);
            setExcel0(slide,pjBaseInfo);
            //第12页
            XSLFSlide slide1 = slides.get(11);
            setExcel1(slide1,pjBaseInfo);
            //第13页
            XSLFSlide slide2 = slides.get(12);
            setExcel2(slide2,pjBaseInfo);
            //第19页
            XSLFSlide slide3 = slides.get(18);
            setExcel3(slide3,null,null);
            //第19页
            XSLFSlide slide4 = slides.get(19);
            setExcel4(slide4,null);
            //第19页
            XSLFSlide slide5 = slides.get(20);
            setExcel5(slide5,null,null);
            fis.close();
            try (FileOutputStream out = new FileOutputStream("D:\\test1\\p55.pptx")) {
                srcShow.write(out);
            }
            srcShow.close();
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("导出PPT错误，请联系管理员");
        }
    }



    //第六页PPT
    public static void setExcel0(XSLFSlide slide, PjBaseInfo pjBaseInfo){
        List<XSLFShape>   xslfShapes = slide.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("1111");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = table.getCell(0,0);
                //cell.setText("测试数据001");
                //第二行第二列
                cell = table.getCell(1,1);
                cell.setText(pjBaseInfo.getCusName());
                //第二行第四列
                cell = table.getCell(1,3);
                cell.setText(String.valueOf(pjBaseInfo.getTrancformerCapacity()));
                //第二行第二列
                //暂时设置项目名称
                cell = table.getCell(2,1);
                cell.setText(pjBaseInfo.getPjName());
                //第二行第四列
                cell = table.getCell(2,3);
                cell.setText(pjBaseInfo.getRoofMaterials());
                //第二行第二列
                cell = table.getCell(3,1);
                cell.setText(String.valueOf(pjBaseInfo.getRoofArea()));
                //第二行第四列
                cell = table.getCell(3,3);
                cell.setText(String.valueOf(pjBaseInfo.getSelfUseAmount()));
            }
        }
    }
    private static void setExcel1(XSLFSlide slide2, PjBaseInfo pjBaseInfo) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = table.getCell(0,0);
                //cell.setText("测试数据001");
                //第二行第二列
                cell = table.getCell(1,1);
                //安装数量
                cell.setText(String.valueOf(pjBaseInfo.getModulesNum()));
                //第二行第四列
                cell = table.getCell(1,3);
                //组件功率
                cell.setText(String.valueOf(pjBaseInfo.getPerModulesRate()));
                //第二行第二列
                cell = table.getCell(2,1);
                cell.setText(String.valueOf(pjBaseInfo.getTotalCapacity()));
                //第二行第四列
                cell = table.getCell(2,3);
                cell.setText("首年发电量");
                //第二行第二列
                cell = table.getCell(3,1);
                cell.setText(String.valueOf(pjBaseInfo.getPvArea()));
                //第二行第四列
                cell = table.getCell(3,3);
                cell.setText("25年总发电量");

                //安装方式
                cell = table.getCell(4,1);
                cell.setText(pjBaseInfo.getInstallStyle());
                //防水方式
                cell = table.getCell(4,3);
                cell.setText(pjBaseInfo.getWaterProofStyle());

            }
        }




    }

    private static void setExcel2(XSLFSlide slide2,PjBaseInfo pjBaseInfo) {
        PjGenerProfitGather pjGenerProfitGather = null;
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = table.getCell(0,0);
                //cell.setText("测试数据001");
                //用电方---客户名称
                cell = table.getCell(1,1);
                cell.setText(pjBaseInfo.getCusName());
                //投资金额

                //pjTotalPrice/1000
                cell = table.getCell(1,3);
                cell.setText(String.valueOf(pjBaseInfo.getPjTotalPrice()));
                //投资方
                cell = table.getCell(2,1);
                cell.setText(pjBaseInfo.getCusName());
                //25年发电收益
                cell = table.getCell(2,3);
                cell.setText(String.valueOf(pjGenerProfitGather.getSumAnnulIncome()));
                //装机容量
                cell = table.getCell(3,1);
                cell.setText(String.valueOf(pjBaseInfo.getTotalCapacity()));
                //回本周期
                cell = table.getCell(3,3);

                //实时计算
                cell.setText(String.valueOf("3.6"));

                //25年发电量
                cell = table.getCell(4,1);

                cell.setText(String.valueOf(pjGenerProfitGather.getTotalGenerate()));
                //25年年均收益率
                cell = table.getCell(4,3);
                cell.setText(String.valueOf(pjGenerProfitGather.getAvgIncomeRatioAnnul()));

            }
        }


    }
    private static void setExcel3(XSLFSlide slide2, List<PjGenerProfitTest> pjGenerProfitTests,PjGenerProfitGather pjGenerProfitGather) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        int i = 1 ;
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){

                if(i == 1){
                    XSLFTable table = (XSLFTable) xslfShape;
                    XSLFTableCell cell = null;
                    for(int g = 2 ; g < 15 ; g++){
                        PjGenerProfitTest pjGenerProfitTest = pjGenerProfitTests.get(g-2);
                        //发电量
                        cell = table.getCell(g,1);

                        cell.setText(String.valueOf(pjGenerProfitTest.getAnnulGenerate()));
                        //节省电费
                        cell = table.getCell(g,2);
                        cell.setText(String.valueOf(pjGenerProfitTest.getSaveElecPrice()));
                        //余电上网
                        cell = table.getCell(g,3);
                        cell.setText(String.valueOf(pjGenerProfitTest.getSendStateIncome()));
                        //年净收益
                        cell = table.getCell(g,4);
                        cell.setText(String.valueOf(pjGenerProfitTest.getAnnulIncome()));
                    }
                }else{
                    XSLFTable table = (XSLFTable) xslfShape;
                    XSLFTableCell cell = null;
                    for(int g = 2 ; g <= 15 ; g++){
                        //第二行第二列
                        cell = table.getCell(g,1);
                        if(cell == null){
                            continue;
                        }
                        PjGenerProfitTest pjGenerProfitTest = pjGenerProfitTests.get(g+11);
                        if(pjGenerProfitTest == null){
                            //设置合计的数量
                            //发电量
                            cell = table.getCell(g,1);

                            cell.setText(String.valueOf(pjGenerProfitGather.getTotalGenerate()));
                            //节省电费
                            cell = table.getCell(g,2);
                            cell.setText(String.valueOf(pjGenerProfitGather.getSumSavePrice()));
                            //余电上网
                            cell = table.getCell(g,3);
                            cell.setText(String.valueOf(pjGenerProfitGather.getSumSendStateIncome()));
                            //年净收益
                            cell = table.getCell(g,4);
                            cell.setText(String.valueOf(pjGenerProfitGather.getSumAnnulIncome()));





                        }else{
                            //发电量
                            cell = table.getCell(g,1);

                            cell.setText(String.valueOf(pjGenerProfitTest.getAnnulGenerate()));
                            //节省电费
                            cell = table.getCell(g,2);
                            cell.setText(String.valueOf(pjGenerProfitTest.getSaveElecPrice()));
                            //余电上网
                            cell = table.getCell(g,3);
                            cell.setText(String.valueOf(pjGenerProfitTest.getSendStateIncome()));
                            //年净收益
                            cell = table.getCell(g,4);
                            cell.setText(String.valueOf(pjGenerProfitTest.getAnnulIncome()));
                        }



                    }
                }
                if(i == 1){
                    i++;
                }
            }
        }


    }
    private static void setExcel4(XSLFSlide slide2, PjEnergySaving pjEnergySaving) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = null;
                //年平均发电量
                cell = table.getCell(1,2);
                cell.setText("11");
                //25年累计
                cell = table.getCell(2,2);
                cell.setText("11");
                //25年累计
                cell = table.getCell(3,2);
                long l1 = pjEnergySaving.getCoalSavingAverage();
                cell.setText(String.valueOf(l1));
                cell = table.getCell(4,2);
                cell.setText(String.valueOf(l1*25));
                //减排CO2

                long carbonSavingAverage = pjEnergySaving.getCarbonSavingAverage();

                cell = table.getCell(5,2);
                cell.setText(String.valueOf(carbonSavingAverage));
                cell = table.getCell(6,2);
                cell.setText(String.valueOf(carbonSavingAverage*25));
                //减排SO2
                long sulfurSavingAverage = pjEnergySaving.getSulfurSavingAverage();
                cell = table.getCell(7,2);
                cell.setText(String.valueOf(sulfurSavingAverage));
                cell = table.getCell(8,2);
                cell.setText(String.valueOf(sulfurSavingAverage*25));

                //nitricSavingAverage  减排氮氧化物

                long nitricSavingAverage = pjEnergySaving.getNitricSavingAverage();
                cell = table.getCell(9,2);
                cell.setText(String.valueOf(nitricSavingAverage));
                cell = table.getCell(10,2);
                cell.setText(String.valueOf(nitricSavingAverage*25));

                //nitricSavingAverage  减排氮氧化物
                long smokeSavingAverage = pjEnergySaving.getSmokeSavingAverage();
                cell = table.getCell(11,2);
                cell.setText(String.valueOf(smokeSavingAverage));
                cell = table.getCell(12,2);
                cell.setText(String.valueOf(smokeSavingAverage*25));
            }
        }


    }


    private static void setExcel5(XSLFSlide slide2,PjGenerProfitGather pjGenerProfitGather,PjBaseInfo pjBaseInfo) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = null;
                //节省电费
                cell = table.getCell(2,1);
                cell.setText(String.valueOf(pjGenerProfitGather.getSumSavePrice()));
                //节省变压器容量
                BigDecimal trancformerCapacity = pjBaseInfo.getTrancformerCapacity();
               // 42*12*25*0.05/10000 == 0.063
                BigDecimal b1 = new BigDecimal(0.063);
                cell = table.getCell(3,1);
                cell.setText(trancformerCapacity.divide(b1).toString());
                //温度节能
                BigDecimal bigDecimal = pjBaseInfo.getRoofArea();
                //客户国电网价格
                BigDecimal bigDecimal3 = new BigDecimal(160);
                BigDecimal electPrice = pjBaseInfo.getElectPrice();
                BigDecimal electPrice1 = bigDecimal.divide(electPrice).multiply(bigDecimal3);

                cell = table.getCell(4,1);
                cell.setText(electPrice1.toString());
                //修缮费用   屋顶面积*50*2/10000

                BigDecimal bigDecimal1 = new BigDecimal(100);
                BigDecimal bigDecimal2 = bigDecimal.divide(bigDecimal1);
                cell = table.getCell(5,1);
                cell.setText(bigDecimal2.toString());
                //double s2 = 25*2.5/10000;  ==160

                //碳交易收益
                cell = table.getCell(6,1);
                //
                cell.setText("22");
                //合计
                cell = table.getCell(7,1);
                cell.setText("11");
            }
        }


    }


}
