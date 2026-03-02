// 1. Student Management System: Create a Student class with fields like id, name, and
// marks. Add methods to display details and calculate grades based on marks. Write
// a program to create multiple student objects and display their details and grades.
class Student {

    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "D";
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + calculateGrade());
        System.out.println();
    }
}

public class q1{

    public static void main(String[] args) {

        Student s1 = new Student(1, "piyush", 85);
        Student s2 = new Student(2, "priyanshu", 90);

        s1.display();
        s2.display();
    }
}