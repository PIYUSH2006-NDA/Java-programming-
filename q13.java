// 13. Palindrome Check: Write a program to check if a given string is a palindrome.
// Ignore case and spaces.
public class q13{
     public static void main(String args[]){
          int  n=12321;
          int rev=0;
          int  temp=n;
          while (temp > 0) {
               int d=temp%10;
               rev=rev*10+d;
               temp=temp/10;
          }
          if (n == rev) {
               System.out.println("The number is a palindrome.");
          } else {
               System.out.println("The number is not a palindrome.");
          }

     } 
}
