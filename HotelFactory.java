package exception.HotelMgmt;

public class HotelFactory {
    MenuItems getObjItems(String item) {
        MenuItems obj;
        if (item.equalsIgnoreCase("roti")) {
            obj = new Roti();
        } else if (item.equalsIgnoreCase("dosa")) {
            obj = new Dosa();
        } else {
            obj = new Roti();
        }
        return obj;
    }

}
