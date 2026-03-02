// 10. Fibonacci Series: Write a program to calculate the nth Fibonacci number using recursion.
public class q10{
     public static void main(String args[]){
          int n = 10;
          int a=0;
          int b=1;
          for (int i=2;i<n;i++){
               int c=a+b;
               a=b;
               b=c;
          }
          System.out.println("The "+n+"th Fibonacci number is: "+b);
     }
}