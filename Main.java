package exception.HotelMgmt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer details:");

        Customer c1 = new Customer();
        c1.setDetails();
        System.out.println("Welcome to the hotel!");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1.Add Orders");
            System.out.println("2.Bills");
            System.out.println("3.Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    c1.addOrders();
                    break;

                case 2:
                    c1.getBill();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Please enter a valid option!");
                    break;

            }
        }

    }
}
