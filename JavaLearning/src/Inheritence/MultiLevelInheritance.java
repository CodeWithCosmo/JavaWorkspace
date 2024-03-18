package Inheritence;

class Parent
{
    void show()
    {
        System.out.println("Parent class");
    }

    void SayHi(){
        System.out.println("Hi");
    }
}
class Child extends Parent
{
    void show()
    {
        // super.show();
        System.out.println("Child class");
    }

    void SayHello(){
        System.out.println("Hello");
    }
}
class GrandChild extends Child
{
    void show() 
    {   
        // super.show();
        System.out.println("GrandChild class");
    }

    void SayBye(){
        System.out.println("Bye");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        Parent p = new Parent();            //^ Parent class reference and Parent class object
        Parent c = new Child();             //^ Parent class reference but Child class object
        Parent g = new GrandChild();        //^ Parent class reference but GrandChild class object
        Child cc = new Child();             //^ Child class reference and Child class object
        Child cd = new GrandChild();        //^ Child class reference but GrandChild class object
        GrandChild gg = new GrandChild();   //^ GrandChild class reference and GrandChild class object

        //* Allowed for Parent class object */
        p.show();
        p.SayHi();
        // p.SayHello(); //* Not allowed
        // p.SayBye();   //* Not allowed

        c.show();
        c.SayHi();
        // c.SayHello(); //* Not allowed
        // c.SayBye(); //* Not allowed

        g.show();
        g.SayHi();
        // g.SayHello(); //* Not allowed
        // g.SayBye(); //* Not allowed
        //* Allowed for Child class object */
        cc.show();
        cc.SayHi();
        cc.SayHello();
        // cc.SayBye(); //* Not allowed

        cd.show();
        cd.SayHi();
        cd.SayHello();
        // cd.SayBye(); //* Not allowed

        //* Allowed for GrandChild class object */
        gg.show();
        gg.SayHi();
        gg.SayHello();
        gg.SayBye();

    }
    
}
