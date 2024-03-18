package Inheritence;

class Mother{
    void look(){
        System.out.println("Charming");
    }
    
    void hobby(){
        System.out.println("Running");
    }

    void pernsonality(){
        System.out.println("Calm");
    }
    
}

class Son extends Mother{

    @Override
    void look(){
        System.out.println("Handsome");
    }
    void stream(){
        System.out.println("PCM");
    }
    void hobby(){
        System.out.println("Singing");
    }
    
}

class Daughter extends Mother{

    @Override
    void look(){
        System.out.println("Cute");
    }
    void stream(){
        System.out.println("PCB");
    }

    void hobby(){
        System.out.println("Swimming");
    }
}

public class HierarchicalInheritance {
    
    public static void main(String[] args) {
        Son s = new Son();
        s.pernsonality();
        s.look();
        s.stream();
        s.hobby();
        
        Daughter d = new Daughter();
        d.pernsonality();
        d.look();
        d.stream();
        d.hobby();
    }
}
