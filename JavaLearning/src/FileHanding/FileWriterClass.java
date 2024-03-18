package FileHanding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    
    public void WriteData() throws IOException {

        File f = new File("../JavaLearning/src/FileHanding/WriteData.txt");  //^ This will create a new file if it doesn't exist
        FileWriter fw = new FileWriter(f);  //^ It will Overwrite the data if the file already exists     
        //^ To append data to the file, use FileWriter fw = new FileWriter(f, true);
        fw.write("Welcome to QA Training Sessions!\n");
        fw.write("Today, We will discuss about File Handling.");
        
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        FileWriterClass fw = new FileWriterClass();
        fw.WriteData();
    }
}
