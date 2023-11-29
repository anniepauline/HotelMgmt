package exception.HotelMgmt;

public class Roti implements MenuItems {
    int qty;
    String name;
    int price;

    Roti() {
        name = "Roti";
        price = 10;
    }

    public Roti getItem() {
        return new Roti();
    }

    @Override
    public void setQty(int q) {
        this.qty = q;
    }
}
