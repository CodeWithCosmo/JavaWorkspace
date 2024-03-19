package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass {
    
    public void ReadData() throws IOException {

        File f = new File("../JavaLearning/src/FileHandling/ReadData.txt");  
        FileReader fr = new FileReader(f);  
        BufferedReader br = new BufferedReader(fr);
        
        String s;
        
        while((s = br.readLine()) != null) {
        	System.out.println(s);
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {

        BufferReaderClass br = new BufferReaderClass();
        br.ReadData();
    }
}
