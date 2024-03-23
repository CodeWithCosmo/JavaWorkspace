package AccessModifiers.ProtectedAccess.TestingProtectedAccess;

import AccessModifiers.ProtectedAccess.ProtectedAccessClass;


// public class TestingProtectedAccessOtherPackage {
//     public static void main(String[] args) {
//         ProtectedAccess obj = new ProtectedAccess();
//         obj.access();
//         System.out.println("Acess Level: "+obj.level);

//         //* In this case we are try to access the protected members from other package.
//     }
    
// }

public class TestingProtectedAccessOtherPackage extends ProtectedAccessClass {
    public static void main(String[] args) {
        TestingProtectedAccessOtherPackage obj = new TestingProtectedAccessOtherPackage();
        obj.access();
        System.out.println("Acess Level: "+obj.level);

        //* In this case we are try to access the protected members from other package using inheritance (extended class object). */
    }
    
}
