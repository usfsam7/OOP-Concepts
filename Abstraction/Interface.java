
 /*
  Interface in Java 

  An interface in Java is a blueprint of a class. It has static constants and abstract methods.

  the interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

  properties of the interface :

  - Cannot be instantiated: Interfaces cannot be instantiated on their own, they must be implemented by a class.
  - Only method declarations: Interfaces only contain method signatures, without any implementation. The implementing class must provide the implementation for these methods.
  - Multiple inheritance: Interfaces provide a way for a class to inherit the properties and methods from multiple sources since a class can implement multiple interfaces.
  - No instance variables: Interfaces cannot have instance variables, only constant variables are allowed.
  - Public methods and variables: By convention, all methods and variables in an interface are public.


  when to use it ?

  You use interfaces when you want to define a blueprint or contract for classes to follow, without providing any implementation. Interfaces are used to provide a common set of methods that multiple classes can implement.

     example -->
  */

  package Abstraction;

  interface Shape {
    double getArea();
    double getPerimeter();
}


class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

  class InterfaceTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(5);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}
