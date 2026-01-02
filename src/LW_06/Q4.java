package LW_06;
import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter details (STOP to finish):");
        while (true) {
            System.out.print("Name: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("STOP")) break;
            System.out.print("Type (c/d): ");
            String type = scanner.next();

            if (type.equalsIgnoreCase("c")) {
                Cat c = new Cat();
                c.setName(name);
                System.out.print("Coat Color: ");
                c.setCoatColor(scanner.next());
                pets.add(c);
            } else if (type.equalsIgnoreCase("d")) {
                Dog d = new Dog();
                d.setName(name);
                System.out.print("Weight: ");
                d.setWeight(scanner.nextDouble());
                pets.add(d);
            }
        }

        System.out.println("\n--- Cats ---");
        for (Pet p : pets) {
            if (p instanceof Cat) {
                System.out.println("Name: " + p.getName() + " | Color: " + ((Cat) p).getCoatColor());
            }
        }

        System.out.println("\n--- Dogs ---");
        for (Pet p : pets) {
            if (p instanceof Dog) {
                System.out.println("Name: " + p.getName() + " | Weight: " + ((Dog) p).getWeight());
            }
        }
    }
}