import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"Stone", "Paper", "Scissors"};

        System.out.println("Stone Paper Scissors Game");
        System.out.println("Enter 0 for Stone");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissors");

        System.out.print("Your choice: ");
        int user = sc.nextInt();

        int computer = r.nextInt(3);

        System.out.println("Computer choice: " + choices[computer]);

        if(user == computer) {
            System.out.println("Match Draw");
        }
        else if((user == 0 && computer == 2) ||
                (user == 1 && computer == 0) ||
                (user == 2 && computer == 1)) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
}
