import java.util.Scanner;
import java.util.Random;

public class EvenOddGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Even Odd Game");
        System.out.println("Enter 1 for Even");
        System.out.println("Enter 2 for Odd");

        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        int number = r.nextInt(10); // computer generates number

        System.out.println("Generated number: " + number);

        if(number % 2 == 0 && choice == 1) {
            System.out.println("You Win! Number is Even");
        }
        else if(number % 2 != 0 && choice == 2) {
            System.out.println("You Win! Number is Odd");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
