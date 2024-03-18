package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingRangedRows {
    
    public void ReadData(int l, int u) throws IOException {

        File f = new File("../JavaLearning/src/Assignments/ReadingParticularRow.txt");
        FileReader fr = new FileReader(f);  
        BufferedReader br = new BufferedReader(fr);
        
        int rowno = 0;
        String data;
        
        while((data = br.readLine()) != null) {
        	rowno++;
        	if (rowno >= l && rowno <= u) {  
        		System.out.println(data);        		
        	}
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {

        ReadingRangedRows rd = new ReadingRangedRows();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lower end line number: ");
        int lower = s.nextInt();
        System.out.println("Enter upper end line number: ");
        int upper = s.nextInt();
        rd.ReadData(lower,upper);
        
        s.close();
    }
}
