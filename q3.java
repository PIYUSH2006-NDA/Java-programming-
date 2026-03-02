// Default Constructor for Book Details: Create a Book class with fields title, author,
// and price. Use a default constructor to initialize default values and display them.
class books{
     String title;
     String author;
     double price;
     books(){
          title="Jungle Book";
          author="Rudyard Kipling";
          price=9.99;
     }
}
public class q3 {
     public static void main(String[] args) {
          books b1=new books();
          System.out.println("Title: "+b1.title);
          System.out.println("Author: "+b1.author);
          System.out.println("Price: $"+b1.price);
     }
}