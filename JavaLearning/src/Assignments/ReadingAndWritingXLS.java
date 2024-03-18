package Assignments;

import java.io.File;
import java.io.IOException;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ReadingAndWritingXLS {
    
    public void CopyPaste() throws IOException, RowsExceededException, WriteException {
        
        File source = new File("../JavaLearning/src/Assignments/Source.xls");
        File destination = new File("../JavaLearning/src/Assignments/Destination.xls");
    }
}
