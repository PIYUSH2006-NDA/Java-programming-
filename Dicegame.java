import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {

        Random r = new Random();

        int player = r.nextInt(6) + 1;
        int computer = r.nextInt(6) + 1;

        System.out.println("Dice Rolling Game");

        System.out.println("Player rolled: " + player);
        System.out.println("Computer rolled: " + computer);

        if(player > computer) {
            System.out.println("Player Wins!");
        }
        else if(player < computer) {
            System.out.println("Computer Wins!");
        }
        else {
            System.out.println("Match Draw!");
        }
    }
}
