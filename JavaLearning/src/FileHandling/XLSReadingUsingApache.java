package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLSReadingUsingApache {
    
    public void readXLS() throws IOException {

        String path = "../JavaLearning/src/FileHandling/XLSReading.xls";
        FileInputStream fi = new FileInputStream(path);

        HSSFWorkbook wb = new HSSFWorkbook(fi);
        HSSFSheet xs = wb.getSheetAt(0);
        int r = xs.getPhysicalNumberOfRows();
        
        for (int i = 0; i < r; i++) {

            HSSFRow xr = xs.getRow(i);
            int c = xr.getPhysicalNumberOfCells();

            for (int j = 0; j < c; j++) {
               
                HSSFCell xc = xr.getCell(j);
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

    public static void main(String[] args) throws IOException {
        XLSReadingUsingApache obj = new XLSReadingUsingApache();
        obj.readXLS();
    }
}
