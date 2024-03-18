package Assignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WritingXLSRowsColumns {
	public void writeXLS(int r, int c) throws IOException, RowsExceededException, WriteException {
	     
		File f = new File("../JavaLearning/src/Assignments/WritingXLS.xls");
        WritableWorkbook wb = Workbook.createWorkbook(f);
        WritableSheet ws = wb.createSheet("Sheet1", 0);
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.println("Enter data for row " + i + " and column " + j);
                String data = s.next();
                ws.addCell(new Label(j - 1, i - 1, data));
            }
        }
        System.out.println("Data Writed Successfully!");
        wb.write();
        wb.close();
        s.close();
    }	

    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {

        WritingXLSRowsColumns xw = new WritingXLSRowsColumns();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows count:");
        int row = s.nextInt();
        System.out.println("Enter columns count:");
        int col = s.nextInt();       
        
        xw.writeXLS(row,col);
        
        s.close();
    }
}
