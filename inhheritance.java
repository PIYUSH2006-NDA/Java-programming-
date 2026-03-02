class stu{
     void display(){
          System.out.println("This is a student class:- A");
     }
}
class teacher extends stu{
     void display2(){
          System.out.println("This is a teacher class:- B");
     }
}
public class inhheritance{
     public static void main(String[] args){
          teacher t1= new teacher();
          t1.display();
          t1.display2();
     }
}