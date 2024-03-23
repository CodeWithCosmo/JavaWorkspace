package AccessModifiers.DefaultAccess;


//* We can access default members within the same package only */

public class DefautlAccessClass {
    
    int level = 1;
    void access(){
        System.out.println("This is Default Access.");

    }

    public static void main(String[] args) {
        
        DefautlAccessClass obj = new DefautlAccessClass();

        obj.access();
        System.out.println("Access Level: "+obj.level);
    }

}
