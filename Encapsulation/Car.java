/*
 
  In programming when we combine variables and methods in one unit, this is called encapsulation, But weak encapsulation, Recall the real-life example above when I said “do not keep your bag open”, The same concept applied here, we should make a strong encapsulation by hiding our variables so no one messes with it.

  So how to hide the variables?

  Data hiding using access modifiers
  By using access modifiers like: private, public, and protected(you will see it in the inheritance section) we can hide our variables , We also can use them with the methods.

  Note1: When we make a variable or a method public, It can be accessed anywhere in the application.

  Note2: When we make a variable or a method private, It can be accessed only inside the class who creates it.

  So how the user of the class can access the variables after hiding them?


  By using functions called setters and getters, the user of the class can access the variables, So before assigning value to hidden variables, we make some validations on these data, so we make sure that values the client pass will not mess with our variables.

 */





package Encapsulation;


class Car {
   private String engine;
   private int speed; 
   Car(){};
   
   Car (String engine, int speed) {
    setEngine(engine);
    setSpeed(speed);
   }

   public void setEngine(String engine) {
    this.engine = engine;
   }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getEngine () { return this.engine; }
  public int getSpeed () { return this.speed; }

  public String toString() {
    return "The engine of this car is " + engine + " and speed is " + speed;
  }
    
  public static void main(String[] args) {
    Car BMW = new Car();
    BMW.setEngine("BMW ENGINE GTEX FORCE");
    BMW.setSpeed(130);
  
     Car car1 = new Car("ferrari", 90);

    System.out.println(car1.toString());
    System.out.println(BMW.toString());

  }
}

 