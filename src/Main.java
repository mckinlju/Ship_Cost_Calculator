
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double SHIPPING_RATE = 0.02;
        double totalCost = 0.0;
        String trash = "";

        System.out.print("Please enter the cost of the item: $");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            if(itemPrice >= 100)
            {
                totalCost = itemPrice;
                System.out.println("You qualify for free Shipping! Your total is: $" + itemPrice);
            }
            else
            {
                shippingCost = itemPrice * SHIPPING_RATE;
                totalCost = itemPrice + shippingCost;

                System.out.println("The shipping Cost is: $" + shippingCost );
                System.out.println("The total cost is: $" + totalCost);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Enter a valid item price: " + trash);
            System.exit(0);
        }
    }
}