

/**
 * Design a bike factory with the following criteria:

 - The bike may have an engine that can be replaced easily.

You have 2 types of engines:

 - Petrol Engine

 - Electric Engine

The bike has four operations:

 - Start
 - Stop
 - Accelerate: Increases speed by 10 km/h up to 100 km/h
 - Brake: Decreases speed by 10 km/h

 - The installed engine should be notified when starting/stopping the bike.

 - When changing the speed, the bike should notify the installed engine about the current speed.

 - The bike factory should be able to create a bike based on the engine type or replace the engine for an existing bike.
 */









// define the bike engine interface that all types will implement
interface bikeEngine {
    void start();
    void stop();
    void accelerate(int speed);
   }
   
   
   class PetrolEngine implements bikeEngine {
     @Override
      public void start() {
          System.out.println("petrol engine started ... ");
      }
      @Override
      public void stop() {
          System.out.println("petrol engine stoped...");
      }
      @Override
      public void accelerate(int speed) {
          System.out.println("petrol  engine handling speed : " + speed + "km/h");
      } 
   }
   
   
   
   class ElectricEngine implements bikeEngine {
      @Override
       public void start() {
           System.out.println("electric engine started ... ");
       }
       @Override
       public void stop() {
           System.out.println("electric engine stoped...");
       }
       @Override
       public void accelerate(int speed) {
           System.out.println("electric  engine handling speed : " + speed + "km/h");
       } 
    }
  
  
    class Bike {
      private int speed = 0;
      private bikeEngine engine;
  
      public Bike(bikeEngine engine) {
              this.engine = engine;
              this.speed = 50;
          }
      
      
      
          public void start() {
              engine.start();
          }
          
          public void stop() {
              engine.stop();
          }
      
          public void accelerate() {
              if (this.speed < 100) {
                  speed += 10;
              }
              engine.accelerate(speed);
          }
          public void brake() {
              if (this.speed > 0) {
                  speed -= 10;
              } 
          }
          public void replaceEngine(bikeEngine engine) {
              this.engine = engine;
              System.out.println("engine replaced...");
          }
        }
      
       
       
      
       class bikeFactory {
          public static Bike createBike(String engineType) {
            bikeEngine engine;
            switch (engineType.toLowerCase()) {
              case "petrol":
                  engine = new PetrolEngine();
                  break;
              
              case "electric":
                  engine = new ElectricEngine();
              
              default:
              engine = new PetrolEngine();
                  break;
            }
      
              return new Bike(engine);
      } 
   }
  
  
  
    class Main {
      public static void main(String[] args) {
          Bike bike = bikeFactory.createBike("petrol");
          bike.start();
          bike.accelerate();
          bike.brake();
          bike.stop();
  
          bike.replaceEngine(new ElectricEngine());
          bike.start();
          bike.accelerate();
          bike.brake();
          bike.stop();
      }
      
   }