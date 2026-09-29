import java.util.Scanner;
public class Onlinefoodorderingsystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String customer;
        String address;

        int choice;
        double total = 0;

        // User
        System.out.print("name: ");
        customer = sc.nextLine();

        System.out.print("delivery address: ");
        address = sc.nextLine();

        // Menu
        System.out.println("\n0. Checkout");
        System.out.println("1. Burger - 80");
        System.out.println("2. Pizza - 120");
        System.out.println("3. Fries - 60");
        System.out.println("4. Cola - 40");

        // Order
        do {
            System.out.print("\nitem id: ");
            choice = sc.nextInt();

            double price = 0;
            String item = "";

            switch (choice) {

                case 1:
                    item = "Burger";
                    price = 80;
                    break;

                case 2:
                    item = "Pizza";
                    price = 120;
                    break;

                case 3:
                    item = "Fries";
                    price = 60;
                    break;

                case 4:
                    item = "Cola";
                    price = 40;
                    break;

                case 0:
                    System.out.println("Checkout...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            if (choice >= 1 && choice <= 4)
            {
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                double itemTotal = price * quantity;
                total = total + itemTotal;

                System.out.println(item + " x " + quantity
                        + " = ₹" + itemTotal);
            }
        } while (choice != 0);

        // Bill
        double discount=0;

        if (total >= 200) {
            discount = total * 0.10;
            //10% =0.10
        }
        double fee;
        //extra fees

        if (total >= 300) {
            fee = 0;
        } else {
            fee = 40;
        }

        double finalBill = total - discount + fee;

        // display order info
        System.out.println("\nOrder Summary");
        System.out.println("Customer: " + customer +"\nAddress:"
                + address+" \nSubtotal: ₹" + total);
        System.out.println("Discount: ₹" + discount);
        System.out.println("\nDelivery: ₹" + fee);
        System.out.println("\nFinal Bill: ₹" + finalBill);

        //pay option
        System.out.println("\n1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");
        System.out.print("Pay method: ");
        //else if ladder
        int pay = sc.nextInt();
        if (pay == 1) {
            System.out.println("Pay: Cash");
        } else if (pay == 2) {
            System.out.println("Pay: UPI");
        } else if (pay == 3) {
            System.out.println("Pay: Card");
        } else {
            System.out.println("Invalid pay option");
        }
        System.out.println("Order confirmed.");
    }  }