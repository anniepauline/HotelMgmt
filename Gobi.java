package exception.HotelMgmt;

public class Gobi implements MenuItems {
    int qty;
    String name;
    int price;

    Gobi() {
        name = "Gobi";
        price = 50;
    }

    public Gobi getItem() {
        return new Gobi();
    }

    @Override
    public void setQty(int q) {
        this.qty = q;
    }

}
