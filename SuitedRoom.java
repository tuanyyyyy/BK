public class SuitedRoom extends Room {
    private boolean oneBed;
    private boolean noBathroom;
    private boolean parkingLot;
    private boolean randomNavigation;

    public SuitedRoom(int containGuest, String type, double price, boolean oneBed, boolean noBathroom,
            boolean parkingLot, boolean randomNavigation) {
        super(containGuest, type, price);
        this.oneBed = oneBed;
        this.noBathroom = noBathroom;
        this.parkingLot = parkingLot;
        this.randomNavigation = randomNavigation;
    }

    public boolean isOneBed() {
        return oneBed;
    }

    public void setOneBed(boolean oneBed) {
        this.oneBed = oneBed;
    }

    public boolean isNoBathroom() {
        return noBathroom;
    }

    public void setNoBathroom(boolean noBathroom) {
        this.noBathroom = noBathroom;
    }

    public boolean isParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

    public boolean isRandomNavigation() {
        return randomNavigation;
    }

    public void setRandomNavigation(boolean randomNavigation) {
        this.randomNavigation = randomNavigation;
    }

    public void getDetailSuitedRoom() {
        // detail suited room logic here
    }
}
