package ExceptionHandling;

//* We can create our own Unchecked Exception by extending RuntimeException class */
//& In case of Unchecked Exception, It not need to be handled. But the user of the program can face unexpected results if we don't handle it.

class NegativeAgeException extends RuntimeException {

    public NegativeAgeException() {
        super();
    }
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class CustomUncheckedException {
    
    public static void main(String[] args) {

        int age = -10;
        try {
            if (age < 0) {
                throw new NegativeAgeException("Invalid age!");
            }
            else 
                System.out.println("Age is " + age);
        }
        catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
