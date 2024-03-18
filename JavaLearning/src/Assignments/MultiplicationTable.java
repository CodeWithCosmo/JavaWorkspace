package Assignments;

import java.util.Scanner;

public class MultiplicationTable {
	
	// We can define function as static so that it doesn't need class object to be called
	
	public void multiplication_table(int n) {
		for (int i = 1; i<=10; i++) {
			System.out.println(n +" x "+i+" = "+n*i);
		}
	}
	
	public static void main(String[] args) {
		
		MultiplicationTable mt = new MultiplicationTable();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Which number multiplicaiton table you want ?");
		int no = s.nextInt();
		mt.multiplication_table(no);
		
		s.close();
		
	}

}
