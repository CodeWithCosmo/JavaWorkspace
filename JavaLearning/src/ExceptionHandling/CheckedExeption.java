package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  


//* Checked Exception (Compile Time Exception) are those which are checked by compiler */
//* "throws" keyword tell only that exception will be thrown, so you have to handle it. */
//* We can't compile our code without handling the checked exception or we can use thorow keyword to tell the developer that exception will be thrown 
//* and you have to handle it */


public class CheckedExeption {

    public static void main(String[] args)  {
        
        File file = new File("sample.txt");
        try (Scanner s = new Scanner(file)) {
            System.out.println("File is found");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }        
    }
}