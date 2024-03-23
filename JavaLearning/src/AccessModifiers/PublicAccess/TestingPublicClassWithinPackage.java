package AccessModifiers.PublicAccess;

public class TestingPublicClassWithinPackage {

    public static void main(String[] args) {
        
        PublicAccessClass obj = new PublicAccessClass();
        obj.access();
        System.out.println("Acess Level: "+obj.level);
    }

    //* In this case we are trying to access public members from same package */
    
}
