public class Room {
    private int containGuest;
    private String type;
    private double price;

    public Room(int containGuest, String type, double price) {
        this.containGuest = containGuest;
        this.type = type;
        this.price = price;
    }

    public int getContainGuest() {
        return containGuest;
    }

    public void setContainGuest(int containGuest) {
        this.containGuest = containGuest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDetailRoom() {

    }

    public void updateTypeOfRoom(String newType) {
        this.type = newType;
    }
}
