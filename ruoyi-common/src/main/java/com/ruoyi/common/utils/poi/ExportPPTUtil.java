package com.ruoyi.common.utils.poi;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Excel.ColumnType;
import com.ruoyi.common.annotation.Excel.Type;
import com.ruoyi.common.annotation.Excels;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.exception.UtilException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.DictUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileTypeUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.common.utils.file.ImageUtils;
import com.ruoyi.common.utils.reflect.ReflectUtils;
import com.ruoyi.solarProject.domain.PjBaseInfo;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xslf.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

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
            setExcel2(slide2);
            //第19页
            XSLFSlide slide3 = slides.get(18);
            setExcel3(slide3);
            //第19页
            XSLFSlide slide4 = slides.get(19);
            setExcel4(slide4);
            //第19页
            XSLFSlide slide5 = slides.get(20);
            setExcel5(slide5);
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

    private static void setExcel2(XSLFSlide slide2) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = table.getCell(0,0);
                //cell.setText("测试数据001");
                //第二行第二列
                cell = table.getCell(1,1);
                cell.setText("11");
                //第二行第四列
                cell = table.getCell(1,3);
                cell.setText("13");
                //第二行第二列
                cell = table.getCell(2,1);
                cell.setText("21");
                //第二行第四列
                cell = table.getCell(2,3);
                cell.setText("23");
                //第二行第二列
                cell = table.getCell(3,1);
                cell.setText("31");
                //第二行第四列
                cell = table.getCell(3,3);
                cell.setText("33");

                //第二行第二列
                cell = table.getCell(4,1);
                cell.setText("41");
                //第二行第四列
                cell = table.getCell(4,3);
                cell.setText("43");

            }
        }


    }
    private static void setExcel3(XSLFSlide slide2) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        int i = 1 ;
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){

                if(i == 1){
                    System.out.println("77777");
                    XSLFTable table = (XSLFTable) xslfShape;
                    XSLFTableCell cell = null;
                    cell = table.getCell(2,1);
                    System.out.println(cell);
                    cell.setText("发电量"+11);

                    for(int g = 2 ; g < 15 ; g++){
                        //第二行第二列
                        cell = table.getCell(g,1);
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,2);
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,3);
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,4);
                        cell.setText("发电量"+g);
                    }
                }else{
                    System.out.println("3333");
                    XSLFTable table = (XSLFTable) xslfShape;
                    XSLFTableCell cell = null;
                    for(int g = 2 ; g <= 15 ; g++){

                        //第二行第二列
                        cell = table.getCell(g,1);
                        if(cell == null){
                            continue;
                        }
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,2);
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,3);
                        cell.setText("发电量"+g);
                        cell = table.getCell(g,4);
                        cell.setText("发电量"+g);
                    }
                }
                if(i == 1){
                    i++;
                }



            }
        }


    }
    private static void setExcel4(XSLFSlide slide2) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = null;
                //第二行第二列
                cell = table.getCell(1,2);
                cell.setText("11");

                cell = table.getCell(2,2);
                cell.setText("11");
                cell = table.getCell(3,2);
                cell.setText("11");
                cell = table.getCell(4,2);
                cell.setText("11");
                cell = table.getCell(5,2);
                cell.setText("11");
                cell = table.getCell(6,2);
                cell.setText("11");
                cell = table.getCell(7,2);
                cell.setText("11");
                cell = table.getCell(8,2);
                cell.setText("11");
                cell = table.getCell(9,2);
                cell.setText("11");
                cell = table.getCell(10,2);
                cell.setText("11");
                cell = table.getCell(11,2);
                cell.setText("11");
                cell = table.getCell(12,2);
                cell.setText("11");
            }
        }


    }


    private static void setExcel5(XSLFSlide slide2) {
        List<XSLFShape>   xslfShapes = slide2.getShapes();
        for (XSLFShape xslfShape : xslfShapes) {
            if(xslfShape instanceof XSLFTable){
                System.out.println("2222");
                XSLFTable table = (XSLFTable) xslfShape;
                XSLFTableCell cell = null;
                //第二行第二列
                cell = table.getCell(2,1);
                cell.setText("11");
                cell = table.getCell(3,1);
                cell.setText("11");
                cell = table.getCell(4,1);
                cell.setText("11");
                cell = table.getCell(5,1);
                cell.setText("11");
                cell = table.getCell(6,1);
                cell.setText("11");
                cell = table.getCell(7,1);
                cell.setText("11");
            }
        }


    }


}
