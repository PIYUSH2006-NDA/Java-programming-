import java.util.Scanner;
import java.util.Random;

public class MathQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10);

        int correctAnswer = num1 + num2;

        System.out.println("Math Quiz Game");
        System.out.println("Solve the following question:");

        System.out.println(num1 + " + " + num2 + " = ?");
        System.out.print("Enter your answer: ");

        int userAnswer = sc.nextInt();

        if(userAnswer == correctAnswer) {
            System.out.println("Correct Answer! You Win!");
        } else {
            System.out.println("Wrong Answer.");
            System.out.println("Correct Answer is: " + correctAnswer);
        }

        sc.close();
    }
}
