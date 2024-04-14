package Concepts;

class OuterClass {
    
    private int outerField;
    
    // Constructor for the outer class
    public OuterClass(int value) {
        this.outerField = value;
    }
    
    // Method to display the value of the outer field
    public void displayOuterField() {
        System.out.println("Outer field value: " + outerField);
    }
    
    // Nested class
    class InnerClass {
        
        private int innerField;
        
        // Constructor for the inner class
        public InnerClass(int value) {
            this.innerField = value;
        }
        
        // Method to display the value of the inner field
        public void displayInnerField() {
            System.out.println("Inner field value: " + innerField);
        }
    }
}
public class NestedClasses {
    
    // Main method
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outer = new OuterClass(100);
        
        // Calling the outer class method
        outer.displayOuterField();
        
        // Creating an instance of the inner class using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass(50);
        
        // Calling the inner class method
        inner.displayInnerField();
    }
}