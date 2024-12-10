/**
 * Abstraction in java : is a process of hiding the implementation details and showing only functionality to the user.
 Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

 Abstraction lets you focus on what the object does instead of how it does it.


  - there are two ways to achieve abstraction in java :
  1. using abstract class
  2. using Interface

  Abstract class in java :

  An abstract class in Java acts as a partially implemented class that itself cannot be instantiated. It exists only for subclassing purposes, and provides a template for its subcategories to follow. Abstract classes can have implementations with abstract methods. Abstract methods are declared to have no body, leaving their implementation to subclasses.

  Points to Remember :
  - An abstract class must be declared with an abstract keyword.
  - It can have abstract and non-abstract methods.
  - It cannot be instantiated --> Abstract classes cannot be instantiated directly. They serve as a blueprint for other classes and must be extended to be used.
  - It can have constructors and static methods also.
  - It can have final methods which will force the subclass not to change the body of the method.
  - Can have concrete methods: An abstract class can also have concrete methods,
    which are methods that have an implementation and can be called directly by objects of the abstract class or its subclasses.
  - Can be extended: An abstract class can be extended by another class, 
    which is known as a concrete subclass. The concrete subclass must implement the abstract methods defined in the abstract class.


    when to use it ?

    - Code Reusability: Abstract classes facilitate code reuse by allowing common methods to be implemented once and inherited by multiple subclasses.

    - Defining a Common Interface: Abstract classes can define a common interface for a group of related classes, ensuring consistency in their structure and behavior.

    - Enforcing Method Implementation: Abstract classes can enforce the implementation of certain methods by declaring them as abstract, thereby ensuring that subclasses provide necessary functionality.


 */
 
   package Abstraction;

  // example 1

  abstract class Shape{  
      abstract void draw();  
    }  
   
    class Rectangle extends Shape{  
       void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle1 extends Shape{  
       void draw(){System.out.println("drawing circle");}  
    }  
   
    class TestAbstraction1{  
    public static void main(String args[]){  
      Shape s = new Circle1();
       s.draw();  
    }  
  }  


  // example 2

  abstract class Bank {
    abstract int getRateOfInterest();
  }

  class SBI extends Bank {
     int getRateOfInterest() {return 4; }
  }

  class PNB extends Bank {
    int getRateOfInterest() { return 9; }
  }


  class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest : " + b.getRateOfInterest() + "%");

        b = new PNB();
        System.out.println("Rate of interest : " + b.getRateOfInterest() + "%");

    }
  }


    // note : look at the interface section first before reading this ex.
  /*
   Another Real Scenario of Abstract Class :

    The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface. 
 */


 interface A{  
    void a();  
    void b();  
    void c();  
    void d();  
    }  
      
    abstract class B implements A{  
    public void c(){System.out.println("I am c");}  
    }  
      
    class M extends B{  
    public void a(){System.out.println("I am a");}  
    public void b(){System.out.println("I am b");}  
    public void d(){System.out.println("I am d");}  
    }  
      
    class Test5{  
    public static void main(String args[]){  
    A a=new M();  
    a.a();  
    a.b();  
    a.c();  
    a.d();  
    }}  