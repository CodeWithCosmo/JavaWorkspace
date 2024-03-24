package AccessModifiers.PrivateAccess;

public class TestingPrivateAccess {
    
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        
        PrivateAccessClass obj = new PrivateAccessClass();
        // obj.access();
        // System.out.println(obj.level);

        //* In this case the we are trying to access private members from other class. that's why we got an error. */
    }
}
