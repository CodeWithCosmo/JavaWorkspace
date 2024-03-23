package AdvancedConcepts;

abstract class shape {
	
  final float pi = 3.147f;
  abstract void area(float dimension);
}

class square extends shape {

  void area(float side) {
	  System.out.println("The area of Square is " + side * side + " unit-sq");
  }
}

class circle extends shape {

  void area(float radius) {
	  System.out.println("The area of Circle is " + pi * radius * radius + " unit-sq");
  }
}

public class AbstractClass {
	
  public static void main(String[] args) {
    square sq = new square();
    circle ci = new circle();
    sq.area(5);
    ci.area(6);
  }
}