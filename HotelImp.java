import java.util.Scanner;

public class HotelImp implements Hotel {
    int[] qty = new int[3];
    int[] price = { 10, 40, 50 };
    String[] menu = { "Roti", "Dosa", "Idli" };
    int[] total = new int[3];
    int gTotal = 0;
    int option;
    Scanner sc = new Scanner(System.in);

    public void getBill() {
        System.out.println("Name       Price       Qty         Total");
        System.out.println("------------------------------------------- ");

        for (int k = 0; k < qty.length; k++) {
            if (qty[k] != 0) {
                total[k] = +price[k] * qty[k];
                gTotal = +total[k];
            }

        }
        for (int i = 0; i < price.length; i++) {
            if (qty[i] != 0) {
                System.out.println(
                        menu[i] + "           " + price[i] + "          " + qty[i] + "        " + this.total[i]);

            }
        }
        System.out.println("-------------------------------------------  ");
        System.out.println("Bill (before tax) :                 " + gTotal);
        double afterGst = gTotal + (gTotal / 100) * 18;
        System.out.println("Bill (after tax)  :                 " + afterGst);
        System.out.println("-------------------------------------------  ");

    }

    public void addOrders() {
        System.out.println("Menu");
        System.out.println("1.Roti Rs.10/pc");
        System.out.println("2.Dosa Rs.40/pc");
        System.out.println("3.Gobi Rs.50/plate");
        System.out.println("Enter your choice");
        option = sc.nextInt();
        switch (option) {
            case 1:
                // HoteInf roti = h.getObject("Roti");
                // System.out.println(roti);
                System.out.println("How many Roti?");
                int rqty = sc.nextInt();
                qty[0] = qty[0] + rqty;
                // total += roti.price * qty[0];
                // orders[i++] = roti;
                System.out.println("Ordered " + rqty + " Roti");

                break;
            case 2:
                System.out.println("How many Doas?");
                int dqty = sc.nextInt();
                qty[1] += dqty;
                System.out.println("Ordered " + dqty + " Dosa");

                break;
            case 3:
                System.out.println("How many Gobi?");
                int gqty = sc.nextInt();
                qty[2] += gqty;
                System.out.println("Ordered " + gqty + " Gobi");

                break;
            default:
                break;
        }
    }

}
