package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingParticularRow {
    
    public void ReadData(int row) throws IOException {

        File f = new File("../JavaLearning/src/Assignments/ReadingParticularRow.txt");
        FileReader fr = new FileReader(f);  
        BufferedReader br = new BufferedReader(fr);
        
        int rowno = 0;
        String data;
        
        while((data = br.readLine()) != null) {
        	rowno++;
        	if (rowno == row) {
        		System.out.println(data);
        		break;
        	}
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {

        ReadingParticularRow rd = new ReadingParticularRow();
        Scanner s = new Scanner(System.in);
        System.out.println("Which line do you want to read ?");
        int n = s.nextInt();
        rd.ReadData(n);
        
        s.close();
    }
}
