package exception.HotelMgmt;

public class Dosa implements MenuItems {
    int qty;
    String name;
    int price;

    Dosa() {
        name = "Dosa";
        price = 40;
    }

    public Dosa getItem() {
        return new Dosa();
    }

    @Override
    public void setQty(int q) {
        this.qty = q;
    }
}
