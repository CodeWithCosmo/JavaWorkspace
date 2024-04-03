package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLSWritingUsingApache {
     public void writeXLS() throws IOException {

        String path = "../JavaLearning/src/FileHandling/XLSWriting.xls";
        FileOutputStream fo = new FileOutputStream(path);
        
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet xs = wb.createSheet("Sheet1");

        for (int i = 0; i < 2; i++) {

            HSSFRow xr = xs.createRow(i);
            for (int j = 0; j < 2; j++) {
                 
                HSSFCell xc = xr.createCell(j);
                xc.setCellValue("Java SE");            
            }
        }
        
        System.out.println("Data Writed Successfully!");

        wb.write(fo);
        wb.close();
        fo.close();
        
    }

    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
        
       XLSWritingUsingApache obj = new XLSWritingUsingApache();
       obj.writeXLS();
    }
}
