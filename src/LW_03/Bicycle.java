package LW_03;

public class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(String name, String num) {
        this.owner = new Owner(name, num);
    }

    public String getOwnerName() {
        return owner.getOwnerName();
    }

    public void setOwnerName(String name) {
        this.owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        return owner.getPhoneNo();
    }

    public void setPhoneNo(String num) {
        this.owner.setPhoneNo(num);
    }
}