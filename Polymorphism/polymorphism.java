/*
  Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.
  
  Advantages of polymorphism :
  1. Code reusability
   polymorphism allows methods in subclasses to override methods in their supers classes
   enabling code to reuse and maintaining a consistent interface across related classes.

  2. Flexibility and Extensibility
  polymorphism allows subclasses to provide their own implementations of methods defined in the superclass, making it easier to extend and customize behavior without modifying existing code.

  3.Dynamic method invocation
  polymorphism enables dynamic methods invocation, where the method called is determined by the actual object type at runtime, providing flexibility in method dispatch.
  
  4.Interface Implementation
  Interfaces in Java allow multiple classes to implement the same interface with their own implementations, facilitating polymorphic behavior and enabling objects of different classes to be treated interchangeably based on a common interface.

  5.Method Overloading
  Polymorphism is also achieved through method overloading, where multiple methods with the same name but different parameter lists can be defined within a class or its subclasses, enhancing code readability and allowing flexibility in method invocation based on parameter types.
  
  6. Reduced Code Complexity
  Polymorphism helps reduce code complexity by promoting a modular and hierarchical class structure, making it easier to understand, maintain, and extend large-scale software systems.


  There are two types of polymorphism in Java:

  1. compile-time polymorphism
  2. runtime polymorphism.
  - We can perform polymorphism in Java by method overloading and method overriding.

 */

 package Polymorphism;


/*
 compile-time/static polymorphism :

  In Java, method overloading is used to achieve compile-time polymorphism. A class can have numerous methods with the same name but distinct parameter lists thanks to method overloading. The compiler uses the amount and kind of parameters provided to it during compilation to decide which method to call. This choice is made during compilation, which is why it's called "compile-time polymorphism."

  The methods in method overloading must have the same name but differ in the quantity or kind of parameters. Based on the inputs passed in during the method call, the compiler chooses the suitable overloaded method when a method is called.

 */

class Sum {
    int add (int a, int b) {
        return a + b;
    } 

    double add (double a, double b, double c) {
        return a + b + c;
    }
}

class ComileTimePolymorphism {
    public static void main(String[] args) {
        Sum s = new Sum();
       System.out.println(s.add(5, 5));
       System.out.println(s.add(4.5, 5.5, 3.3));  
    }
}

/*
 In this example, the Sum class has two add methods-one accepting two integers and the other allowing two doubles. The types of arguments given in the method  decide which add method the compiler calls during compilation. This choice is made at compile time, proving polymorphism.
 */



 /*
  Runtime/Dynamic polymorphism : is a process i which a call to an overriden method is resolved at runtime rether than compile-time.
 
  in this process an overriden method i called through the reference variable of a superclass. 
  the determination of the method to be called is based on the object being referred to by the refernce variable.
  
  Upcasting : when the refernce variable of parent class refers to the object child class,
  it is known as upcasting.
  */

  class A {}
  class B extends A {
    public static void main(String[] args) {
        A a = new B(); // upcasting
    }
  }


  /*
    Example of Java Runtime Polymorphism :
    In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.

    Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
 */

 class Bike {
    void run() { System.out.println("running ....");};
 }

 class Splendor extends Bike {
    void run() {
        System.out.println(" running with 60Km ...");
    }

    public static void main(String[] args) {
       Bike splendor = new Splendor();
       splendor.run();    
    }
 }

 /*
  Explanation

  This Java sample uses method overriding to illustrate runtime polymorphism. While the Splendor class extends Bike and overrides the run() method to output "running with 60km..." the Bike class provides a method called run() that prints "running..." Because of upcasting, a Bike reference variable called b is generated in the main method that points to a Splendour object. Runtime polymorphism is demonstrated by the overridden method from the Splendour class, which is called when the run() method is called using this reference variable. The JVM determines which method to call based on the actual object type at runtime.
 */