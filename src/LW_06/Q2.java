package LW_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet details (Type 'STOP' as name to finish):");

        while (true) {
            System.out.print("Enter Name: ");
            String name = scanner.next();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (c for Cat, d for Dog): ");
            String type = scanner.next();

            Pet p;
            if (type.equalsIgnoreCase("c")) {
                p = new Cat();
            } else if (type.equalsIgnoreCase("d")) {
                p = new Dog();
            } else {
                System.out.println("Invalid type. Skipping.");
                continue;
            }

            p.setName(name);
            pets.add(p);
        }

        System.out.println("\n--- All Pets ---");
        for (Pet p : pets) {
            // Using instanceof to check the type for display
            String type = (p instanceof Cat) ? "Cat" : "Dog";
            System.out.println("Name: " + p.getName() + " | Type: " + type);
        }
    }
}