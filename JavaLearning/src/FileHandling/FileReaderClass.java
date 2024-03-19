package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    
    public void ReadData() throws IOException {

        File f = new File("../JavaLearning/src/FileHandling/ReadData.txt");  
        FileReader fr = new FileReader(f);  
        
        int a;
        
        while((a = fr.read())!=-1) {
        	System.out.println((char) a);  //^ We can read data line by line by using .print() method also
        }

        fr.close();
    }

    public static void main(String[] args) throws IOException {

        FileReaderClass rd = new FileReaderClass();
        rd.ReadData();
    }
}
