package AdvancedConcepts;

class Shapes {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Traingle extends Shapes {
    
    @Override       //! This Annotation checks whether the method is overridden or not.
    void draw() {        
        System.out.println("Drawing a triangle");
    }
}

public class Annotations {
    
    public static void main(String[] args) {
        
        Traingle t = new Traingle();
        t.draw();
    }
}
