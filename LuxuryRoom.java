public class LuxuryRoom extends Room {
    private String priority;
    private boolean stunningView;
    private boolean balcony;
    private boolean twoBed;
    private boolean bathroom;
    private boolean parkingLot;

    public LuxuryRoom(int containGuest, String type, double price, String priority, boolean stunningView,
            boolean balcony, boolean twoBed, boolean bathroom, boolean parkingLot) {
        super(containGuest, type, price);
        this.priority = priority;
        this.stunningView = stunningView;
        this.balcony = balcony;
        this.twoBed = twoBed;
        this.bathroom = bathroom;
        this.parkingLot = parkingLot;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isStunningView() {
        return stunningView;
    }

    public void setStunningView(boolean stunningView) {
        this.stunningView = stunningView;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isTwoBed() {
        return twoBed;
    }

    public void setTwoBed(boolean twoBed) {
        this.twoBed = twoBed;
    }

    public boolean isBathroom() {
        return bathroom;
    }

    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }

    public boolean isParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(boolean parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void getDetailLuxuryRoom() {
        // detail luxury room logic here
    }
}
