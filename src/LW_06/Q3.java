package LW_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // (Input code is same as Q2, usually you would reuse it, but here is the full code for the standalone file)
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet details (STOP to finish):");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("STOP")) break;
            System.out.print("Type (c/d): ");
            String type = scanner.next();

            Pet p;
            if (type.equalsIgnoreCase("c")) p = new Cat();
            else if (type.equalsIgnoreCase("d")) p = new Dog();
            else continue;

            p.setName(name);
            pets.add(p);
        }

        System.out.println("\n--- Cats ---");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                System.out.println(p.getName());
            }
        }

        System.out.println("\n--- Dogs ---");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                System.out.println(p.getName());
            }
        }
    }
}