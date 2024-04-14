package Concepts;

import java.util.Scanner;

public class RegexDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("[\\s,]+");
        System.out.print("Enter two numbers separated by a space or a comma: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("You entered " + num1 + " and " + num2);
        scanner.close();
    }
}
