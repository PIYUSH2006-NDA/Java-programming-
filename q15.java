// 15. Vehicle Inheritance: Create a base class Vehicle with a method move(). Create
// subclasses Car and Bike that override the move() method with specific
// implementations. Demonstrate runtime polymorphism by calling the move()
// method on different object types.
class vehicle{
     void move (){
            System.out.println("Vehicle is moving");
     }
}
class car extends vehicle{
     @Override
     void move (){
            System.out.println("Car is moving");
     }
}
class bike extends vehicle{
     @Override
     void move (){
            System.out.println("Bike is moving");
     }
}
public class q15{
     public static void main(String[] args){
          vehicle v1=new vehicle();
          vehicle v2=new car();
          vehicle v3=new bike();
          v1.move(); // Output: Vehicle is moving
          v2.move(); // Output: Car is moving
          v3.move(); // Output: Bike is moving
     }
}