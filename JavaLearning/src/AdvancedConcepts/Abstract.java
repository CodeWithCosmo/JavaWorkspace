package AdvancedConcepts;
abstract class shape {
  public final float pi = 3.147f;
  abstract public void area(float dimension);
}

class square extends shape {

  public void area(float side) {
    System.out.println("The area of Square is " + side * side);
  }
}

class circle extends shape {

  public void area(float radius) {
    System.out.println("The area of Circle is " + pi * radius * radius);

  }
}

public class Abstract {
  public static void main(String[] args) {
    square sq = new square();
    circle ci = new circle();
    sq.area(4);
    ci.area(5);
  }
}