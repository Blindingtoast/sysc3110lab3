public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public BuddyInfo() {
        this.name = "John";
        this.address = "1 Way Road";
        this.phoneNumber = 911;
    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", 5558707);
        System.out.println("Hello " + buddy.getName());
    }

}