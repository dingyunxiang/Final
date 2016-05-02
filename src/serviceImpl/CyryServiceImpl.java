package serviceImpl;

import dao.CyryDao;
import entity.CyryEntity;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CyryService;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by dingyunxiang on 16/4/23.
 */
@Service("cyryService")
public class CyryServiceImpl implements CyryService {
    @Autowired
    CyryDao dao;

    @Override
    public void addCyry(CyryEntity cyry) {
        dao.save(cyry);
    }

    @Override
    public void delCyry(String id) {
        dao.delete(CyryEntity.class, id);
    }

    @Override
    public void updateCyry(CyryEntity cyry) {
        dao.update(cyry);
    }

    @Override
    public List<CyryEntity> getAllCyry() {
        return dao.getAll(CyryEntity.class);
    }

    @Override
    public void delShejuByShequ(String shequ) {
        dao.delCyryByShequ(shequ);
    }

    @Override
    public CyryEntity getCyryById(String id) {
        return dao.getEntityById(CyryEntity.class, id);
    }

    @Override
    public File listToExcel() {
        List<CyryEntity> list = dao.getAll(CyryEntity.class);

        // 创建Excel的工作书册 Workbook,对应到一个excel文档
        HSSFWorkbook wb = new HSSFWorkbook();

        // 创建Excel的工作sheet,对应到一个excel文档的tab
        HSSFSheet sheet = wb.createSheet("sheet1");

        // 设置excel每列宽度
        sheet.setColumnWidth(0, 4000);
        sheet.setColumnWidth(1, 3500);

        // 创建字体样式
        HSSFFont font = wb.createFont();
        font.setFontName("Verdana");
        font.setBoldweight((short) 100);
        font.setFontHeight((short) 300);
        font.setColor(HSSFColor.BLUE.index);

        // 创建单元格样式
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        // 设置边框
        style.setBottomBorderColor(HSSFColor.RED.index);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);

        style.setFont(font);// 设置字体


        // 创建Excel的sheet的一行
        HSSFRow row = sheet.createRow(0);
        row.setHeight((short) 500);// 设定行的高度
        // 创建一个Excel的单元格
        HSSFCell cell = row.createCell(0);
        int j = 1;
        //创建第一行
        cell.setCellValue("编号");
        Class a = null;
        try {
            a = Class.forName("entity.CyryEntity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Field[] fields = a.getDeclaredFields();
        for (Field f : fields) {
            cell = row.createCell(j++);
            cell.setCellValue(f.getName());
        }
        int i = 1;
        for (CyryEntity shengshi : list) {
            row = sheet.createRow(i);
            cell = row.createCell(0);
            cell.setCellValue(i++);
            int q = 1;
            try {

                Class clazz = shengshi.getClass();
                Field[] fields1 = shengshi.getClass().getDeclaredFields();//获得属性
                for (Field field : fields1) {
                    cell = row.createCell(q++);
                    PropertyDescriptor pd = new PropertyDescriptor(field.getName(),
                            clazz);
                    Method getMethod = pd.getReadMethod();//获得get方法
                    Object o = getMethod.invoke(shengshi);//执行get方法返回一个Object
                  //  System.out.println(o);
                    cell.setCellValue(o + "");
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        try (FileOutputStream os = new FileOutputStream("/Users/dingyunxiang/Documents/workbook.xls")) {
            wb.write(os);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File f = new File("/Users/dingyunxiang/Documents/workbook.xls");
        // System.out.println(f);
        return f;
    }

    @Override
    public File listToExcelByDiy(String[] arr) {
        List<CyryEntity> list = dao.getAll(CyryEntity.class);

        // 创建Excel的工作书册 Workbook,对应到一个excel文档
        HSSFWorkbook wb = new HSSFWorkbook();

        // 创建Excel的工作sheet,对应到一个excel文档的tab
        HSSFSheet sheet = wb.createSheet("sheet1");

        // 设置excel每列宽度
        sheet.setColumnWidth(0, 4000);
        sheet.setColumnWidth(1, 3500);

        // 创建字体样式
        HSSFFont font = wb.createFont();
        font.setFontName("Verdana");
        font.setBoldweight((short) 100);
        font.setFontHeight((short) 300);
        font.setColor(HSSFColor.BLUE.index);

        // 创建单元格样式
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setFillForegroundColor(HSSFColor.LIGHT_TURQUOISE.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        // 设置边框
        style.setBottomBorderColor(HSSFColor.RED.index);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);

        style.setFont(font);// 设置字体

        HSSFCell[][] cellArr = new HSSFCell[list.size()+1][arr.length+1];

        for(int i=0;i<list.size()+1;i++){
                HSSFRow row = sheet.createRow(i);
                for(int j=0;j<arr.length+1;j++){
                    HSSFCell cell = row.createCell(j);
                    cellArr[i][j] = cell;
                }
        }


        for(int i=0;i<list.size()+1;i++){
            if( i == 0) cellArr[i][0].setCellValue("编号");
            else
                cellArr[i][0].setCellValue(i);
        }


        int index = 1;
        for(int i=0;i<arr.length;i++){
            index  = 1;
            cellArr[0][i+1].setCellValue(arr[i]);
            for(CyryEntity shengshi:list){
                try {
                    Class clazz = shengshi.getClass();
                    PropertyDescriptor pd = new PropertyDescriptor(arr[i],
                    clazz);
                    Method getMethod = pd.getReadMethod();//获得get方法
                    Object o = getMethod.invoke(shengshi);//执行get方法返回一个Object
                    System.out.println("index:"+index+" i"+i);
                    cellArr[index++][i+1].setCellValue(o + "");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

        try (FileOutputStream os = new FileOutputStream("/Users/dingyunxiang/Documents/workbook.xls")) {
            wb.write(os);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        File f = new File("/Users/dingyunxiang/Documents/workbook.xls");
        // System.out.println(f);
        return f;
    }

    @Override
    public String excelToList(File file) {
        return null;
    }
}
