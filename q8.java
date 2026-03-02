// Access Control in Employee Details: Create an Employee class with fields id
// (private), name (protected), and department (public). Use appropriate access
// modifiers and demonstrate access in another class within the same package and a
// subclass.
class emp{
     private int id =123;
     protected String name = "John Doe";
     public String department = "HR";
     void display(){
         System.out.println("ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Department: " + department);
     }
}
public class q8{
     public static void main(String args[]){
          emp e= new emp();
          e.display();
     }
}