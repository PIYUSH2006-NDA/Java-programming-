// 11. Sum of Digits: Write a recursive program to calculate the sum of digits of a given number.
public class q11{
     public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }
     public static void main(String[] args) {
        int number = 12345; // Example number
        int sum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + sum);
}
}
