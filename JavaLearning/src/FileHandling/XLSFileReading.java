package FileHandling;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLSFileReading {

    public void readXLS() throws BiffException, IOException {
        File f = new File("../JavaLearning/src/FileHandling/XLSReading.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);

        int r = s.getRows();
        int c = s.getColumns();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(s.getCell(j, i).getContents() + " ");                
            }
            System.out.println();
        }

        wb.close();
    }

    public static void main(String[] args) throws BiffException, IOException {

        XLSFileReading xr = new XLSFileReading();
        xr.readXLS();
    }

}
