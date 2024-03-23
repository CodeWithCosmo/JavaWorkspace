package AccessModifiers.DefaultAccess;

public class TestingDefaultAccessWithinPackage {

    public static void main(String[] args) {
        
        DefautlAccessClass obj = new DefautlAccessClass();
        obj.access();
        System.out.println("Acess Level: "+obj.level);
    }
    
}
