package Prerequisites;


/*
 Objects and Classes in Java
 
 In object oriented programming, object and class plays vital role in programming. These are the two main pillars of OOP. Without object and class, we cannot create a program in Java. So, we are going to discuss about objects and classes in Java.
 
 - what is an object in java? 
  An object is a real-word entity that has state and behaviour. In other words, an object is a tangible thing that can be touch and feel, like a car or chair, etc. are the example of objects. The banking system is an example of an intangible object. Every object has a distinct identity, which is usually implemented by a unique ID that the JVM uses internally for identification. 

  Characteristics of an Object:
 
  State: It represents the data (value) of an object.
  Behavior: It represents the behavior (functionality) of an object.
  Identity: An object's identity is typically implemented via a unique ID. The ID's value is not visible to the external user; however, it is used internally by the JVM to identify each object uniquely.

  For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.

  Object Definitions:

  An object is a real-world entity.
  An object is a runtime entity.
  The object is an entity which has state and behavior.
  The object is an instance of a class.

  - what is a class in java ?
   A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.

   A class in java can contain : 

   1. Fields
   Variables stated inside a class that indicate the status of objects formed from that class are called fields, sometimes referred to as instance variables. They specify the data that will be stored in each class object. Different access modifiers, such as public, private, and protected, can be applied to fields to regulate their visibility and usability.

   2. Methods
   Methods are functions defined inside a class that includes the actions or behaviors that objects of that class are capable of performing. These techniques allow the outside world to function and change the object's state (fields). Additionally, methods can be void (that is, they return nothing) or have different access modifiers. They can also return values.

   3. Constructors
   Constructors are unique methods that are used to initialize class objects. When an object of the class is created using the new keyword, they are called with the same name as the class. Constructors can initialize the fields of an object or carry out any additional setup that's required when an object is created.


   - Instance Variable in Java :
   A variable created inside the class but outside the method is known as an instance variable. An instance variable does not get memory at compile time; it gets memory at runtime when an object or instance is created.

   Each class instance has its own copy of instance variables, which means that changes made to instance variables of one object do not affect the values of instance variables in other objects of the same class. Moreover, setter methods and constructors can be used to initialize them. In object-oriented programming, instance variables are crucial for encapsulating data within objects since they are frequently used to represent the state or properties of objects.

   - Method in Java :
   In Java method is a block of code inside a class that's intended to carry out a certain function. To provide a mechanism to interact with the state of an object and to encapsulate behaviour within objects, methods are requir
   
   - Advantages of Methods
   Code Reusability: Methods encourage code reusability by permitting the same block of code to be used repeatedly inside a program. Once defined, a method can be called from any area of the program where it is available.

   Code Optimisation: Methods allow for code optimization by enclosing intricate or repetitive functionality into reusable components. The modularization of logic facilitates readability and simplifies code maintenance.

   - new keyword in Java :
   The new keyword is used to allocate memory at runtime. All objects get memory in the Heap memory area.

   In Java, an instance of a class-also referred to as an object-is created using the new keyword. The new keyword dynamically allocates memory for an object of that class and returns a reference to it when it is followed by the class name and brackets with optional arguments.

 */

  // Class example

 class MyClass {
    int myField;

    MyClass (int value) {
        myField = value;
    }
    public static void main(String[] args) {
            // Using the new keyword to create an instance of MyClass  
        MyClass myObject = new MyClass(55);
        // Accessing the instance variable of the object 
        System.out.println("the value of myField = " + myObject.myField);
    }
 } 