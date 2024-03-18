package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingSpecificExcelRow {

    public void readXLS(int r) throws BiffException, IOException {
        File f = new File("../JavaLearning/src/Assignments/ReadingXLS.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);

        int cols = s.getColumns();      
        
        try {
                for (int i = r, j = 0; j < cols; j++) {
                        System.out.print(s.getCell(j, i-1).getContents() + " ");                        
                    } 
        }
        catch (Exception e) {
        	System.out.println("Row doesn't exist!");
        }

        wb.close();
    }

    public static void main(String[] args) throws BiffException, IOException {

        ReadingSpecificExcelRow xr = new ReadingSpecificExcelRow();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row index to read:");
        int row = s.nextInt();
        
        
        xr.readXLS(row);
        
        s.close();
    }
}