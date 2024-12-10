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



   // example 2

   abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
     System.out.println(name + " Eating food!");
    }
    abstract protected void makeSound();
}

  class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
     @Override
    protected void makeSound() {
        System.out.println(name + " barks");
    }
    protected void dogBehaviour() {
     System.out.println("anything dog does!");
    }
}

class Cat extends Animal {
 protected Cat(String name) {
        super(name);
    }
     
    @Override
    protected void makeSound() {
        System.out.println(name + " meows");
    }
    protected void catBehaviour() {
     System.out.println("anything cat does!");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog("Rufus");
        Animal cat = new Cat("Mittens");

        dog.makeSound();
        dog.eat();
        cat.makeSound();
        cat.eat();
    }
}
 
  /*
   * In this example, the Animal class is an abstract class that cannot be instantiated on its own. It has an abstract method makeSound() that must be implemented by its concrete subclasses Dog and Cat. The Dog and Cat classes extend the Animal class and provide an implementation for the makeSound() method.
    

   * What are the implementation details of the concrete classes that are hidden in the client?
   
   The implementation details of the concrete classes refer to the specific behavior and characteristics that make each class unique. In the example code, the concrete classes Dog and Cat have their unique implementations of the makeSound method, as well as their additional methods (dogBehaviour and catBehaviour).
   */





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