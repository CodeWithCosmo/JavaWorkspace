package AccessModifiers.PublicAccess;


public class PublicAccessClass {
    
    public int level = 3;
    public void access(){
        System.out.println("This is Public Access.");

    }

    public static void main(String[] args) {
        
        PublicAccessClass obj = new PublicAccessClass();

        obj.access();
        System.out.println("Access Level: "+obj.level);
    }
}
