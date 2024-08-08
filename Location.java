import java.util.List;

public class Location {
    private String Dalat;
    private double NhaTrang;
    private List<Hotel> hotel;

    public Location(String dalat, double nhaTrang, List<Hotel> hotel) {
        Dalat = dalat;
        NhaTrang = nhaTrang;
        this.hotel = hotel;
    }

    public String getDalat() {
        return Dalat;
    }

    public void setDalat(String dalat) {
        Dalat = dalat;
    }

    public double getNhaTrang() {
        return NhaTrang;
    }

    public void setNhaTrang(double nhaTrang) {
        NhaTrang = nhaTrang;
    }

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

}
