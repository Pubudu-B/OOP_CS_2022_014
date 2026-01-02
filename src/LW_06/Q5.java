package LW_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dog> dogList = new ArrayList<>(); // Separate array for dogs as requested

        System.out.println("Enter Dog details (STOP to finish):");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("STOP")) break;

            Dog d = new Dog();
            d.setName(name);
            System.out.print("Weight: ");
            d.setWeight(scanner.nextDouble());
            dogList.add(d);
        }

        if (dogList.isEmpty()) {
            System.out.println("No dogs entered.");
            return;
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;

        for (Dog d : dogList) {
            double w = d.getWeight();
            if (w < min) min = w;
            if (w > max) max = w;
            sum += w;
        }

        System.out.println("\n--- Dog Stats ---");
        System.out.println("Average Weight: " + (sum / dogList.size()));
        System.out.println("Min Weight: " + min);
        System.out.println("Max Weight: " + max);
    }
}