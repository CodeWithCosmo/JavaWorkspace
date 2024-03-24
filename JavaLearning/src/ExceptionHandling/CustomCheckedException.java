package ExceptionHandling;

//* We can create our own Checked Exception by extending Exception class */
//& In case of Checked Exception, we have to handle it. Or else we can't compile our code.

class NegativeRadiusException extends Exception {

    public NegativeRadiusException() {
        super();
    }
    public NegativeRadiusException(String message) {
        super(message);
    }
}

public class CustomCheckedException {
    
    public static void main(String[] args) {

        final float pi = 3.14f;
        float radius = -5f;
        try {
            if (radius < 0)
                throw new NegativeRadiusException("Invalid radius!");
            else 
                System.out.println(pi*radius*radius);
        }
        catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
    }
}
