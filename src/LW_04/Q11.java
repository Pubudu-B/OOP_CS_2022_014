package LW_04;
import java.util.Scanner;
import java.util.Random;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;

        System.out.println("Guess the number between 1 and 100");

        while (guess != target) {
            System.out.print("Enter guess: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Higher");
            } else if (guess > target) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct!");
            }
        }
    }
}