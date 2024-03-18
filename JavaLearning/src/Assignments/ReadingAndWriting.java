package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingAndWriting {
    
    public void CopyPaste() throws IOException {

        File source = new File("../JavaLearning/src/Assignments/Source.txt");
        File destination = new File("../JavaLearning/src/Assignments/Destination.txt");
        FileReader fr = new FileReader(source);  
        FileWriter fw = new FileWriter(destination);   
        BufferedReader br = new BufferedReader(fr);       
               
        String s;
        
        while((s = br.readLine()) != null) {
        	fw.write(s+"\n");
        }
        System.out.println("Data Copied Successfully!");

        br.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        ReadingAndWriting rw = new ReadingAndWriting();
        rw.CopyPaste();
    }
}
