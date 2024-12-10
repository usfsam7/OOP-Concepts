/*
  Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

Why use inheritance in java ?
For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.

Terms used in Inheritance:
Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.
Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.
Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

- types of inheritance :
 1. single inheritance -> when a class inherits another class.
 2. multilevel inhertince -> When there is a chain of inheritance, it is known as multilevel inheritance.
 3. hierarchical inheritance -> When two or more classes inherits a single class.
 4. multiple inheritance -> when a single class inherits two or more class (not supported in java).
 5. Hybrid inheritance -> combination of single and multiple inheritance (not supported on java).
 */


package Inheritance;

// single inheritance
public class Animal {
    void eating(){ System.out.println("eating...");}
}

class Dog extends Animal {
    void barking(){System.out.println("barking...");}
}

class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.barking();
        dog.eating();
    }
  }

  // multilevel inheritance
class SmallDog extends Dog {
 void palying() {System.out.println("playing....");}
}

 class TestInheritance2 {
  public static void main(String[] args) {
   SmallDog dog2 = new SmallDog();
    dog2.palying();
    dog2.barking();
    dog2.eating();
  }
}
   
  // hierarchical inheritance
class Cat extends Animal {
  void meow(){System.out.println("meow...");}
}

class TestInheritance3 {
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.meow();
    cat.eating();
  }
}

  // Multiple inhertiance 

 /*
   Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

   Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

 .ex
   class A {  
    void msg(){System.out.println("Hello");}  
   }  
   class B {  
     void msg(){System.out.println("Welcome");}  
   }  
  class C extends A,B {    -> if this was true
   
  public static void main(String args[]){  
    C obj=new C();  
    obj.msg();   -> Now which msg() method would be invoked?  
   }  
 }  


  Composition :
  -  Composition allows you to create complex objects by combining simple objects.
  - It applies to has-a relationship.

  More on Has-A relationship
  - A car has-an engine and has 4-wheels.
  - A building has floors. A floor has apartments.

  Benefits of using composition :
   With composition, you can create complex objects made up of multiple simpler objects, and you can easily swap out components of a composite object without affecting the other parts of the system.

   So This allows for greater flexibility.
 */