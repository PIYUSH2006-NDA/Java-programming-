import java.util.*;
class throwuse {
     int age ;
     throwuse(){
          System.out.println("Enter your age");
          Scanner sc = new Scanner(System.in);
          age = sc.nextInt();
          if (age>=18){
               System.out.println("You are eligible to vote");
          }
          else{
               throw new ArithmeticException("You are not eligible to vote");
          }
     }
          public static void main(String[] args) {
               throwuse obj = new throwuse();
          }
     }
