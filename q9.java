// 9. Using this to Resolve Conflicts: Create a Car class with fields brand, model, and price. Use
// the this keyword in the constructor to differentiate between instance variables and
// parameters with the same name.
class Car{
     String brand;
     String model;
     int price;
     Car(String brand, String model, int price){
          this.brand = brand;
          this.model = model;
          this.price = price;
     }
     void display(){
          System.out.println("Brand is :- "+brand+"\nModel is :- "+model+"\nPrice is :- "+price);
     }
}
public class q9{
     public static void main(String args[]){
          Car c = new Car("Toyota", "Camry", 25000);
          c.display();
     }
}