package Concepts;

//* In this case we override a method using different return type (subtype of super class).So, It is not
//* necessary to have same return type in method overriding.

class Animal {
    Animal reproduce() {
        System.out.println("Reproducing...");
        return new Animal();
    }
}

class Dog extends Animal {

    @Override
    public Dog reproduce() {
        System.out.println("Dog is reproducing...");
        return new Dog();
    }

}

public class UserDefinedDataType {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
            Animal animal = new Dog();
            Dog dog = (Dog) animal.reproduce();
    }
}
