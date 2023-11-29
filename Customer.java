package exception.HotelMgmt;

import java.util.Scanner;

public class Customer {
    private String name;
    private long phoneNo;
    private double total = 0;
    int option;
    MenuItems orders[] = new MenuItems[10];
    int i = 0;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public long getPhone() {
        return this.phoneNo;
    }

    public double getPrice() {
        return this.total;
    }

    public void setDetails() {
        System.out.println("Enter Customer name:");
        name = sc.nextLine();

        System.out.println("Enter phone number:");
        phoneNo = sc.nextLong();

    }

    public void addOrders() {
        System.out.println("Menu");
        System.out.println("1.Roti Rs.10/pc");
        System.out.println("2.Dosa Rs.40/pc");
        System.out.println("3.Gobi Rs.50/plate");
        System.out.println("Enter your choice");
        option = sc.nextInt();
        HotelFactory h = new HotelFactory();
        switch (option) {
            case 1:
                MenuItems r = h.getObjItems("Roti");
                System.out.println("How many Roti?");
                r.qty = sc.nextInt();
                total += r.price * r.qty;
                orders[i++] = r;
                System.out.println(r.qty);

                break;
            case 2:
                MenuItems d = new Dosa();
                System.out.println("How many Dosa?");
                d.qty = sc.nextInt();
                total += d.price * d.qty;
                System.out.println(orders[i]);
                orders[i++] = d;

                break;
            case 3:
                MenuItems g = new Gobi();
                System.out.println("How many Dosa?");
                g.qty = sc.nextInt();
                total += g.price * g.qty;
                orders[i++] = g;
                break;
            default:
                break;
        }
    }

    public void getBill() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Name       Price       Qty         Total");
        System.out.println("------------------------------------------- ");

        for (int k = 0; k < orders.length; k++) {
            System.out.println(
                    orders[k].name + "      " + orders[k].price + "     " + orders[k].qty + "      " + this.total);
        }

        System.out.println("------------------------------------------- ");
        System.out.println("Bill (before tax)" + total);
        double afterGst = total - (total / 100) * 18;
        System.out.println("Bill (after tax)" + afterGst);
        System.out.println("------------------------------------------- ");

    }

}
