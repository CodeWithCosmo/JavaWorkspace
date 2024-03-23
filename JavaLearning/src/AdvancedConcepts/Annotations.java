package AdvancedConcepts;

class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    
    @Override       //! This Annotation checks whether the method is overridden or not.
    void draw() {        
        System.out.println("Drawing a circle");
    }
}

public class Annotations {
    
    public static void main(String[] args) {
        
        Circle obj = new Circle();
        obj.draw();
    }
}
