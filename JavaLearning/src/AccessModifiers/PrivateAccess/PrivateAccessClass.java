package AccessModifiers.PrivateAccess;

//* We can access private members within the same class only */

public class PrivateAccessClass {
    
    private int level = 0;
    private void access(){
        System.out.println("This is Private Access.");

    }
    public static void main(String[] args) {
        
        PrivateAccessClass obj = new PrivateAccessClass();

        obj.access();
        System.out.println("Access Level: "+obj.level);
    }
}
