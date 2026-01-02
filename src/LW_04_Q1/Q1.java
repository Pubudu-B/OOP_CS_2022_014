package LW_04_Q1;

public class Q1 {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        lib.addLibraryItem(b1);
        lib.addLibraryItem(b2);
        lib.addLibraryItem(b3);

        lib.displayLibraryInfo();
        lib.listAvailableItems();

        System.out.println("Checking out Island of a Thousand Mirrors...");
        lib.checkoutItem("Island of a Thousand Mirrors");

        lib.listAvailableItems();
    }
}