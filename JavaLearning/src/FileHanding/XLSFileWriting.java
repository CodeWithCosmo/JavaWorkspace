package FileHanding;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XLSFileWriting {

    public void writeXLS() throws IOException, RowsExceededException, WriteException {
     
        File f = new File("../JavaLearning/src/FileHanding/XLSWriting.xls");
        WritableWorkbook wb = Workbook.createWorkbook(f);
        WritableSheet s = wb.createSheet("Sheet1", 0);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                s.addCell(new Label(j, i, "Java Learning"));
            }
        }
        System.out.println("Data Writed Successfully!");
        wb.write();
        wb.close();
    }	

    public static void main(String[] args) throws IOException, RowsExceededException, WriteException {

        XLSFileWriting xw = new XLSFileWriting();
        xw.writeXLS();
    }

}
