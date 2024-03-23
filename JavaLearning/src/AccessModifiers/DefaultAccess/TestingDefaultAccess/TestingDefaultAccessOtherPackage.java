package AccessModifiers.DefaultAccess.TestingDefaultAccess;

import AccessModifiers.DefaultAccess.DefautlAccessClass;

public class TestingDefaultAccessOtherPackage {
    
 public static void main(String[] args) {
        
    @SuppressWarnings("unused")
        DefautlAccessClass obj = new DefautlAccessClass();
        // obj.access();
        // System.out.println("Acess Level: "+obj.level);

        //* In this case we are trying to access default members from outer packages.
        //* Outer packages for a class are all packages in which the existing class not present even the package is the sub-package of the parent package of current class. */
    }
}
