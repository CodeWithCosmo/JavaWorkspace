package Assignments;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadingAndWritingXLS {
    
    public void CopyPaste() throws BiffException, IOException, RowsExceededException, WriteException {
        
        File source = new File("../JavaLearning/src/Assignments/Source.xls");
        File destination = new File("../JavaLearning/src/Assignments/Destination.xls");

        Workbook w = Workbook.getWorkbook(source);
        Sheet s = w.getSheet(0);

        WritableWorkbook wb = Workbook.createWorkbook(destination);
        WritableSheet ws = wb.createSheet("SalesOrders", 0);

        int r = s.getRows();
        int c = s.getColumns();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ws.addCell(new Label(j,i,s.getCell(j, i).getContents()));
            }
        }
        System.out.println("Data Copied Successfully!");
        wb.write();
        w.close();
        wb.close();

    }

    public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {

        ReadingAndWritingXLS rwx = new ReadingAndWritingXLS();
        rwx.CopyPaste();
    }
}
