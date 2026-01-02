package LW_04;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative to quit): ");
            int num = scanner.nextInt();
            if (num < 0) break;

            // Converting to string is the easiest way to count digits
            String s = Integer.toString(num);
            System.out.println("Number of digits: " + s.length());
        }
    }
}