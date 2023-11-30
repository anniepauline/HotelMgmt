
import java.util.Scanner;

public class Customer {
    private String name;
    private long phoneNo;
    int option;
    Scanner sc = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public long getPhone() {
        return this.phoneNo;
    }

    public void setName() {
        System.out.println("Enter Customer name:");
        name = sc.nextLine();
    }

    public void setPhone() {
        System.out.println("Enter Customer phone number:");
        try {
            phoneNo = sc.nextLong();
            int count = 0;
            long num = phoneNo;
            while (num != 0) {
                num /= 10;
                count++;
            }
            if (count != 10) {
                throw new PhoneNoException("PhoneNumberValidationException");
            }
        } catch (PhoneNoException p) {
            System.out.println("Enter 10 digits only");
            this.setPhone();
        }

    }

    public void setDetails() {
        this.setName();
        this.setPhone();

    }

    public void welcome() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNo);
    }
}