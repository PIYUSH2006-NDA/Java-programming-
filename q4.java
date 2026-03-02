// 4. Parameterized Constructor for Employee Details: Create an Employee class with
// fields id, name, and salary. Use a parameterized constructor to initialize the fields
// and display the employee details.
class Employee{
     int id;
     String name;
     int salary;
     Employee(int id, String name, int salary){
          this .id=id;
          this.name=name;
          this.salary=salary;
     }
     public void display(){
          System.out.println("ID: "+id);
          System.out.println("Name: "+name);
          System.out.println("Salary: $"+salary);
     }
}
public class q4{
     public static void main(String[] args) {
          Employee e1=new Employee(101, "Alice", 50000);
          e1.display();
     }
}