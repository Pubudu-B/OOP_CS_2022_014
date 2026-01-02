package LW_04;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int smallest = n1;

        if (n2 < smallest) {
            smallest = n2;
        }
        if (n3 < smallest) {
            smallest = n3;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}