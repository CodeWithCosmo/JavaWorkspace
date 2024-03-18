package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadingSpecificCell {
    
   public void readXLS(int i, int j) throws BiffException, IOException {
        File f = new File("../JavaLearning/src/Assignments/ReadingXLS.xls");
        Workbook wb = Workbook.getWorkbook(f);
        Sheet s = wb.getSheet(0);
        
        try {
        	System.out.print(s.getCell(j-1, i-1).getContents());
        }
        catch (Exception e) {
        	System.out.println("Cell doesn't exist!");
        }

        wb.close();
    }

    public static void main(String[] args) throws BiffException, IOException {

        ReadingSpecificCell xr = new ReadingSpecificCell();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter row index:");
        int r = s.nextInt();
        System.out.println("Enter column index:");
        int c = s.nextInt();
        
        xr.readXLS(r,c);
        
        s.close();
    }
}
