package serviceImpl;

import dao.ShequDao;
import entity.ShequEntity;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShequService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

/**
 * Created by dingyunxiang on 16/4/17.
 */


@Service("shequService")
class ShequServiceImpl implements ShequService {
    @Autowired
    ShequDao dao;


    @Override
    public boolean addShequ(ShequEntity shequ) {
       dao.save(shequ);
        return true;
    }

    @Override
    public boolean delShequ(String id) {
        dao.delete(ShequEntity.class,id);
        return true;
    }

    @Override
    public boolean updateShequ(ShequEntity shequ){
        dao.update(shequ);
        return true;
    }

    @Override
    public List<ShequEntity> getAll() {
        return dao.getAll(ShequEntity.class);
    }


    @Override
    public File listToExcel() {

        List<ShequEntity> list = dao.getAll(ShequEntity.class);

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
        //创建第一行
        cell.setCellValue("编号");
        cell = row.createCell(1);
        cell.setCellValue("地名");
        int i =1;
        for(ShequEntity shequ:list){
            row = sheet.createRow(i++);
            cell = row.createCell(0);
            cell.setCellValue(i-1);
            cell = row.createCell(1);
            cell.setCellValue(shequ.getCommunity());
        }
        // 合并单元格(startRow，endRow，startColumn，endColumn)
        //sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 2));

        // 给Excel的单元格设置样式和赋值
//        cell.setCellStyle(style);
//        cell.setCellValue("hello world");

        // 设置单元格内容格式
//        HSSFCellStyle style1 = wb.createCellStyle();
//        style1.setDataFormat(HSSFDataFormat.getBuiltinFormat("h:mm:ss"));

//        style1.setWrapText(true);// 自动换行

//        row = sheet.createRow(1);
//
//        // 设置单元格的样式格式
//
//        cell = row.createCell(0);
//        cell.setCellStyle(style1);
//        cell.setCellValue(new Date());
//
//        // 创建超链接
//        HSSFHyperlink link = new HSSFHyperlink(HSSFHyperlink.LINK_URL);
//        link.setAddress("http://www.baidu.com");
//        cell = row.createCell(1);
//        cell.setCellValue("百度");
//        cell.setHyperlink(link);// 设定单元格的链接

        try (FileOutputStream os = new FileOutputStream("/Users/dingyunxiang/Documents/workbook.xls")) {
            wb.write(os);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        File f = new File("/Users/dingyunxiang/Documents/workbook.xls");
        System.out.println(f);
        return f;
    }

    @Override
    public String excelToList(File file) {
        FileInputStream input = null;
        HSSFWorkbook hssfWorkbook = null;
        try {
            input = new FileInputStream(file);
            hssfWorkbook= new HSSFWorkbook(input);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Read the Sheet
        for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null) {
                continue;
            }
            // Read the Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                HSSFRow hssfRow = hssfSheet.getRow(rowNum);
                if (hssfRow != null) {

                    ShequEntity shequ = new ShequEntity();
                    HSSFCell number = hssfRow.getCell(0);
                    HSSFCell county = hssfRow.getCell(1);
                    shequ.setCommunity(county.getStringCellValue());
                    System.out.println("上传省市Service:"+shequ.getCommunity());
                    dao.save(shequ);
                }
            }
        }
        return "succ";
    }


    @Override
    public ShequEntity getShequById(String id) {
        return dao.getEntityById(ShequEntity.class,id);
    }
}
