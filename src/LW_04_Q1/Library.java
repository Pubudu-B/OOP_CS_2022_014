package LW_04_Q1;
import java.util.ArrayList;

public class Library {

    private ArrayList<BorrowableItems> list;

    public Library() {
        this.list = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        list.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : list) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equals(title)) {
                    if (book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Checked out: " + title);
                    } else {
                        System.out.println("Already checked out.");
                    }
                    return;
                }
            }
        }
        System.out.println("Item not found.");
    }

    public void listAvailableItems() {
        System.out.println("Available Items:");
        for (BorrowableItems item : list) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                    System.out.println("----------------");
                }
            }
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Total items: " + list.size());
    }
}