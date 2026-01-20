import java.util.*;
public class recc{
    public static int fact(int num){
        if (num==1 || num==0){
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int result=fact(a);
        System.out.print("the factorial of this number is :- " +result);
    }
}
