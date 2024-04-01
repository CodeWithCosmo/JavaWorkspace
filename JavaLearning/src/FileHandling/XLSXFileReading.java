package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.read.biff.BiffException;

public class XLSXFileReading {
    
    public void readXLSX() throws BiffException, IOException {
        File f = new File("../JavaLearning/src/FileHandling/XLSXReading.xlsx");        
        FileInputStream fi = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet xs = wb.getSheetAt(0);

        int r = xs.getPhysicalNumberOfRows();
        
        for (int i = 0; i < r; i++) {

            XSSFRow xr = xs.getRow(i);
            int c = xr.getPhysicalNumberOfCells();

            for (int j = 0; j < c; j++) {
               
                XSSFCell xc = xr.getCell(j);
                switch(xc.getCellType()) {
                
            	case STRING: System.out.print(xc.getStringCellValue()); break;
            	case NUMERIC: System.out.print(xc.getNumericCellValue()); break;
            	case BOOLEAN: System.out.print(xc.getBooleanCellValue()); break;
				default:
					break;
                }
                System.out.print("  ");
            }
            System.out.println();
        }

        fi.close();
        wb.close();
    }

    public static void main(String[] args) throws BiffException, IOException {
        
        XLSXFileReading obj = new XLSXFileReading();
        obj.readXLSX();
    }
}
