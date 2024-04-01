package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLSXFileWriting {

    public void writeXLSX() throws IOException, RowsExceededException, WriteException {

        File f = new File("../JavaLearning/src/FileHandling/XLSXWriting.xlsx");
        FileOutputStream fo = new FileOutputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet xs = wb.createSheet("Sheet1");

        for (int i = 0; i < 2; i++) {

            XSSFRow xr = xs.createRow(i);
            for (int j = 0; j < 2; j++) {
                 
                XSSFCell xc = xr.createCell(j);
                xc.setCellValue("Java");            
            }
        }
        
        System.out.println("Data Writed Successfully!");

        wb.write(fo);
        wb.close();
        fo.close();
        
    }

    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
        
       XLSXFileWriting obj = new XLSXFileWriting();
       obj.writeXLSX();
    }
}
