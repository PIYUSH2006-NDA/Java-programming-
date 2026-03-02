import java.util.Scanner;

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 10;
        
        System.out.println("Enter details for " + num + " employees:");

        for (int i = 0; i < num; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
    
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            int salary = scanner.nextInt();

            Employee e = new Employee(id, name, salary);

            System.out.println("\nDetails Entered:");
            e.display();
        }
    }
}
