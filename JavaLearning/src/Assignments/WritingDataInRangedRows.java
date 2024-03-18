package Assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataInRangedRows {
    
    public void WriteData(int lower, int upper) throws IOException {

        File f = new File("../JavaLearning/src/Assignments/WritingDataInRangedRows.txt");
        FileWriter fw = new FileWriter(f);   
        Scanner s = new Scanner(System.in);
        String data = null;    
        for (int i = 1; i <= upper; i++) {
            if (i >= lower) {
                data = s.nextLine();
                fw.write(data + "\n");
            }
            else {
                fw.write("\n");
            }
        }
        System.out.println("Data Writed Successfully!");
        s.close();
        fw.close();
    }

    public static void main(String[] args) throws IOException {

        WritingDataInRangedRows wd = new WritingDataInRangedRows();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter initial line number: ");
        int i = s.nextInt();
        System.out.println("Enter final line number: ");
        int f = s.nextInt();
        System.out.println("Enter data which you want to write: ");
        wd.WriteData(i,f);       
        s.close();
    }
}
