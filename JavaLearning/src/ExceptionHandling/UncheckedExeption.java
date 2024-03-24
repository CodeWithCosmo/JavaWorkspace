package ExceptionHandling;


//* Unchecked Exception (Runtime Exception) are those which are checked by developer */
//* In case of Unchecked Exception, we can compile our code without handling them. */
//* But the user of the program can face unexpected results if we don't handle it. */
//* We can use throws keyword as well in case of Unchecked Exception to tell the developer that exception will be thrown and you have to handle it */

public class UncheckedExeption {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}