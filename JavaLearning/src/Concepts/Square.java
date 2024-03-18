package Concepts;

import java.util.Scanner;

class Square {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a no: ");
		int a = s.nextInt();
		System.out.println(a + " square is " + a * a);

		s.close();
	}
}