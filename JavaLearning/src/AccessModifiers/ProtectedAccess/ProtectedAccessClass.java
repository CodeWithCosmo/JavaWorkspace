package AccessModifiers.ProtectedAccess;

//* We can access protected members out from the package only with the help of extended class objects.*/

public class ProtectedAccessClass {

    protected int level = 2;
    protected void access(){
        System.out.println("This is Protected Access.");

    }

    public static void main(String[] args) {
        
        ProtectedAccessClass obj = new ProtectedAccessClass();

        obj.access();
        System.out.println("Access Level: "+obj.level);
    }
    
}
