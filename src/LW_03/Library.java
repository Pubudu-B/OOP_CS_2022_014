package LW_03;

public class Library {
    private BorrowableItems[] borrowableItemsList;
    private int count;

    public Library() {
        borrowableItemsList = new BorrowableItems[100];
        count = 0;
    }

    public void addLibraryItem(BorrowableItems item) {
        if (count < 100) {
            borrowableItemsList[count] = item;
            count++;
        }
    }

    public void checkoutItem(String title) {
        for (int i = 0; i < count; i++) {
            Book book = (Book) borrowableItemsList[i];
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Successfully checked out: " + title);
                } else {
                    System.out.println("Book is already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listAvailableItems() {
        System.out.println("--- Available Items ---");
        for (int i = 0; i < count; i++) {
            Book book = (Book) borrowableItemsList[i];
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Total items in library: " + count);
    }
}