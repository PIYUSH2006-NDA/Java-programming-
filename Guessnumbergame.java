import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 7;   // fixed number for simplicity
        int guess;

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Guess a number between 1 to 10");

        while(true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == number) {
                System.out.println("Correct! You guessed the number.");
                break;
            }
            else if(guess > number) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Too low! Try again.");
            }
        }

        sc.close();
    }
}
