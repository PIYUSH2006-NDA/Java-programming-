// 5. Constructor Overloading for Shapes: Create a Shape class with overloaded
// constructors:
// a. Default constructor initializes a circle with a default radius.
// b. A constructor with parameters initializes a rectangle with length and
// breadth.
// c. Write a program to calculate the area based on the constructor invoked.
class shapes{
     int radius ;
     int l;
     int b;
     shapes(){
          radius=5; // Default radius for circle
     }
     shapes(int l, int b){
          this.l=l;
          this.b=b;
     }
     public void display(){
          if(radius!=0){
               double areaCircle = Math.PI * radius * radius;
               System.out.println("Area of Circle: " + areaCircle);
          } else {
               int areaRectangle = l * b;
               System.out.println("Area of Rectangle: " + areaRectangle);
          }
     }
}
public class q5 {
     public static void main(String[] args) {
          shapes s1 = new shapes(); // Circle
          s1.display();
          
          shapes s2 = new shapes(4, 6); // Rectangle
          s2.display();
     }
}