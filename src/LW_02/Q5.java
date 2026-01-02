package LW_02;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input, " ,.!;?");
        StringBuilder cleanInput = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            cleanInput.append(tokenizer.nextToken());
        }

        String original = cleanInput.toString().toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is NOT a palindrome.");
        }
    }
}