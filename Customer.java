
import java.util.Scanner;

public class Customer {
    private String name;
    private long phoneNo;

    // String name;
    // long price;
    int option;
    // HoteInf orders[] = new Hotel[10];
    // int i = 0;
    // Factory h = new Factory();
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public long getPhone() {
        return this.phoneNo;
    }

    public void setDetails() {
        System.out.println("Enter Customer name:");
        name = sc.nextLine();

        System.out.println("Enter phone number:");
        phoneNo = sc.nextLong();

    }

    public void welcome() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNo);
      
    }

}