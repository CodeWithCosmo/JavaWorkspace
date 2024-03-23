package AccessModifiers.PublicAccess.TestingPublicClass;

import AccessModifiers.PublicAccess.PublicAccessClass;

public class TestingPublicClassOtherPackage {
    
    public static void main(String[] args) {
        
        PublicAccessClass obj = new PublicAccessClass();
        obj.access();
        System.out.println("Acess Level: "+obj.level);
    }

    //* In this case we are trying to access public members from same package */
    
}
