import java.util.List;

public class BookingSystem {
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private int numberOfGuests;
    private boolean typeOfGuest;
    private String checkInDate;
    private String checkOutDate;
    private boolean availableRoom;
    private Location location;
    private Hotel hotel;
    private List<Room> rooms;

    public BookingSystem(String customerName, String customerPhone, String customerEmail, int numberOfGuests,
            boolean typeOfGuest, String checkInDate, String checkOutDate, boolean availableRoom, Location location,
            Hotel hotel, List<Room> rooms) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.numberOfGuests = numberOfGuests;
        this.typeOfGuest = typeOfGuest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.availableRoom = availableRoom;
        this.location = location;
        this.hotel = hotel;
        this.rooms = rooms;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public boolean isTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(boolean typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public boolean isAvailableRoom() {
        return availableRoom;
    }

    public void setAvailableRoom(boolean availableRoom) {
        this.availableRoom = availableRoom;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void getAvailable(Room room) {

    }

    public void makeBooking() {

    }

    public Payment getTotalPrice() {

        return new Payment();
    }

    public double showTotalPrice() {

        return 0.0;
    }
}
