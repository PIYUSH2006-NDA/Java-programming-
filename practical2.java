package practical2;

public class practical2 {
    public static void main(String[] args) {
        int[] arr = {45, 67, 89, 34, 50, 76, 80, 90, 99, 100};
        int sum = 0;

        // Loop through the array properly
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Summing the marks
            
            // Check if the mark value is < 50
            if (arr[i] < 50) {
                System.out.println("average: " + arr[i]);
            } else {
                System.out.println("good marks: " + arr[i]);
            }
        }
        
        // Calculate and display average
        System.out.println("The average marks of the students is :- " + (sum / arr.length));
    }
}
