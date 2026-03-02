import java.util.Scanner;
public class DataTypesAndIO {
 public static void main(String[] args) {                                                        //Name= piyush varule  
 Scanner scanner = new Scanner(System.in);                                                      //class= "C"
 System.out.print("Enter an integer: ");                                                     //roll no= 21
 int integerValue = scanner.nextInt();
 System.out.print("Enter a floating-point number: ");
 float floatValue = scanner.nextFloat();
 System.out.print("Enter a character: ");
 char charValue = scanner.next().charAt(0);
 System.out.print("Enter a boolean value (true/false): ");
 boolean booleanValue = scanner.nextBoolean();
 System.out.println("\nYou entered the following values:");
 System.out.println("Integer: " + integerValue);
 System.out.println("Floating-point: " + floatValue);
 System.out.println("Character: " + charValue);
 System.out.println("Boolean: " + booleanValue);
 scanner.close();
 }
}