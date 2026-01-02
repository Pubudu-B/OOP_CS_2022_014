package LW_04;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Replacement word: ");
        String newWord = scanner.next();

        String result = sentence.replace(oldWord, newWord);
        System.out.println("New sentence: " + result);
    }
}