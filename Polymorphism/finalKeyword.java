package Polymorphism;


/*
 Final Keyword in java :

 The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:

  - variable
  - method
  - class
 The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.

 1. Java final variable 
  --> stop value change
  --> stop Method overridding 
  --> stop Inheritance

  If you make any variable as final, you cannot change the value of final variable(It will be constant).


 
   Example.
  There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.
  */


  class Bike {
    final int speedlimit = 100; // final variable
    void run() {
        // speedlimit = 300; // Compile Time Error
    }

     public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
     }
  }

  /*
    java final method : if you make a method as final, you cannot oreride it.
    example -->
 */

 class Moto {
    final void run() {System.out.println("running ...");};
 }

 class Halawa extends Moto {
    // void run() { System.out.println("sunning with 100Km/h ...");}
    // compile-time error

    public static void main(String args[]) {  
        Moto h = new Moto();   
        h.run();  
     }  
 }


   /*
    java final class : if you make a class as final, you cannot extend it.
    example -->
 */


 final class Moto22 { }

 class Halawa2 extends Moto22 { // compile-time error
    void run() { System.out.println("sunning with 100Km/h ...");}
   

    public static void main(String args[]) {  
        Moto22 h = new Moto22();    
     }  
 }


 /*
   Q) Is final method inherited?

   Ans) Yes, final method is inherited but you cannot override it. For Example:
*/

class Bike45{  
    final void run(){System.out.println("running...");}  
  }  
  class Honda2 extends Bike45{  
     public static void main(String args[]){  
      new Honda2().run();  
     }  
  }  

  /*
    Q) Can we declare a constructor final?

    No, because constructor is never inherited.  
 */