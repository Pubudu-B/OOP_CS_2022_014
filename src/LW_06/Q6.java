package LW_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Cat\n2. Add Dog\n3. Remove Cat\n4. Remove Dog\n0. Quit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) break;

            if (choice == 1) { // Add Cat
                Cat c = new Cat();
                System.out.print("Name: ");
                c.setName(scanner.next());
                System.out.print("Coat Color: ");
                c.setCoatColor(scanner.next());
                cats.add(c);
            }
            else if (choice == 2) { // Add Dog
                Dog d = new Dog();
                System.out.print("Name: ");
                d.setName(scanner.next());
                System.out.print("Weight: ");
                d.setWeight(scanner.nextDouble());
                dogs.add(d);
            }
            else if (choice == 3) { // Remove Cat
                System.out.print("Enter Cat name to remove: ");
                String name = scanner.next();
                cats.removeIf(c -> c.getName().equalsIgnoreCase(name));
                System.out.println("Removed (if existed).");
            }
            else if (choice == 4) { // Remove Dog
                System.out.print("Enter Dog name to remove: ");
                String name = scanner.next();
                dogs.removeIf(d -> d.getName().equalsIgnoreCase(name));
                System.out.println("Removed (if existed).");
            }

            // Optional: Show lists to verify
            System.out.println("Current Cats: " + cats.size() + " | Current Dogs: " + dogs.size());
        }
    }
}