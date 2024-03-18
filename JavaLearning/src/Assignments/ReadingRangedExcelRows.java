package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingRangedExcelRows {

	public void readXLS(int first, int last) throws BiffException, IOException {
        File f = new File("../JavaLearning/src/Assignments/ReadingXLS.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);
        
        int cols = s.getColumns();      
        
        try {
            for (int i = first; i <= last; i++) {
               for (int j = 0; j < cols; j++) {
                        System.out.print(s.getCell(j, i-1).getContents() + " ");
                    }
               System.out.println();
            }
        }
        catch (Exception e) {
        	System.out.println("Row doesn't exist!");
        }

        wb.close();
    }

    public static void main(String[] args) throws BiffException, IOException {

        ReadingRangedExcelRows xr = new ReadingRangedExcelRows();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter intial row index:");
        int row_initial = s.nextInt();
        System.out.println("Enter final row index:");
        int row_final = s.nextInt();       
        
        xr.readXLS(row_initial, row_final);
        
        s.close();
    }
    
}
