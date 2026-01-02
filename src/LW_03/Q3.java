package LW_03;

public class Q3 {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Kamal", "0712345678");
        System.out.println("Owner: " + bike.getOwnerName());
        System.out.println("Phone: " + bike.getPhoneNo());
    }
}