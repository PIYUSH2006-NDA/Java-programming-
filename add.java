import java.util.*;
public class add{
     public static int calc(int a,int b){
          int sum=a+b;
          return sum;

     }
     public static void main(String args[]){
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter two numbers:");
          int a=sc.nextInt();
          int b=sc.nextInt();
          int result=calc(a,b);
          System.out.println("The sum is:"+result);
     }
}
