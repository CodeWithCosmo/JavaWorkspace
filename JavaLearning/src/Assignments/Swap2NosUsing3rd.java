package Assignments;

import java.util.Scanner;

public class Swap2NosUsing3rd {
    
	public static int[] swap(int a, int b) {
	    int temp = a;
	    a = b;
	    b = temp;
	    
	    int[] swappedValues = {a, b};

	    return swappedValues;
	}

	    
	    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter x: ");
        int x = s.nextInt();
        System.out.println("Enter y: ");
        int y = s.nextInt();
        
        int[] swapped = swap(x, y);

	    System.out.println("Swapped values: x = " + swapped[0] + ", y = " + swapped[1]);
	    
	    s.close();
	}

}
