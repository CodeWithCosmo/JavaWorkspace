package LiveAssignments;

class Student {
    int rollNo;
    int age;

    void display1(){
        System.out.println("Welcome to all of you.");
    }
    void display2() {
        System.out.println("Automation is very easy.");
    }
}


public class March_30
{
    public static void main(String[] args) {
        Student Lalit = new Student();
        Lalit.rollNo = 12;
        Lalit.age = 24;
        
        System.out.println("Lalit Roll No: " + Lalit.rollNo);
        System.out.println("Lalit Age: " + Lalit.age);
        
        Lalit.display1();
        Lalit.display2();
    }
}