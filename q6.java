// 6. Track Object Count: Create a Product class with a static field productCount to track
// the number of objects created. Use a static method to display the total count.
class product{
     int id;
     static int productCount=0;
     product(int id){
          this.id=id;
          productCount++;
     }
     static void displayCount(){
          System.out.println("Total number of products created: " + productCount);
     }
}
public class q6 {
     public static void main(String[] args) {
          product p1 = new product(101);
          product p2 = new product(102);
          product p3 = new product(103);
          
          product.displayCount(); // Display total count of products created
     }
}