package Assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataTillRowCount {
    
    public void WriteData(int n) throws IOException {

        File f = new File("../JavaLearning/src/Assignments/WritingDataTillRowCount.txt");
        FileWriter fw = new FileWriter(f);   
        Scanner s = new Scanner(System.in);
        String data = null;    
        for (int i = 1; i <= n; i++) {
            data = s.nextLine();
            fw.write(data + "\n");
        }
        System.out.println("Data Writed Successfully!");
        s.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        WritingDataTillRowCount wd = new WritingDataTillRowCount();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of lines to write data: ");
        int n = s.nextInt();
        System.out.println("Enter data which you want to write: ");
        wd.WriteData(n);       
        s.close();
    }
}
