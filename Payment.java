public class Payment {
    private double totalPayment;
    private String methodPayment;

    public double totalPayment(double price) {
        return price;
    }

    public double price(Hotel h, Room r) {
        return h.price() + r.getPrice();
    }

    public String getMethodPayment() {
        return methodPayment;
    }

    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }

    public String returnBill() {
        return "Bill details here";
    }

    public String returnInvoice() {
        return "Invoice details here";
    }
}
