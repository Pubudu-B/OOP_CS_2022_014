package LW_02;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }

            int temp = number;
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while (temp != 0) {
                    temp = temp / 10;
                    count++;
                }
            }
            System.out.println(number + " has " + count + " digits.");
        }
    }
}