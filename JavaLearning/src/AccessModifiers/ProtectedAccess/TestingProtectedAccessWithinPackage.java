package AccessModifiers.ProtectedAccess;


public class TestingProtectedAccessWithinPackage {
    
    public static void main(String[] args) {
        ProtectedAccessClass obj = new ProtectedAccessClass();
        obj.access();
        System.out.println("Acess Level: "+obj.level);

        //* In this case we are try to access protected members within the same package. */
    }
}
