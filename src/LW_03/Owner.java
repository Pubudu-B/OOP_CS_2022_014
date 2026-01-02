package LW_03;

public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}