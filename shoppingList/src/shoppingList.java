import java.util.Scanner;
import java.util.ArrayList;

public class shoppingList
{
    public static class shoppingCart
    {
        ArrayList<shoppingOrder> cart = new ArrayList<shoppingOrder>();

        public void addToCart(shoppingOrder order)
        {
            cart.add(order);
        }

        public void removeFromCart(shoppingOrder order)
        {
            cart.remove(order);
        }

        public boolean checkInCart(shoppingOrder order)
        {
            return cart.contains(order);
        }

        public void applyDiscounts()
        {
            for (shoppingOrder order: cart)
            {
                if (order.getQuantity() >= 2)
                {
                    order.applyTwoForTwoDiscount(order.getItem());
                }
            }
        }
        public double cartTotal()
        {
            double total = 0.00;

            for (shoppingOrder order: cart)
            {
                total += order.getOrderTotal();
            }

            return total;
        }
    }
    public static void main(String[] args)
    {
        /*
        An attempt was made

        Scanner input = new Scanner(System.in);
        String yesOrNo = "";

        System.out.println("Insert the name, price, and then how much you're buying of your item.");
        cart.addToCart(new shoppingOrder(new shoppingItem(input.nextLine(), input.nextDouble()), input.nextInt()));

        System.out.println("Add another item? Y/N");
        Scanner input1 = new Scanner(System.in);
        yesOrNo = input1.nextLine();

        while (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("yes"));
        {
            System.out.println("Insert the name, price, and then how much you're buying of your item.");
            cart.addToCart(new shoppingOrder(new shoppingItem(input.nextLine(), input.nextDouble()), input.nextInt()));

            System.out.println("Add another item? Y/N");
            yesOrNo = input1.nextLine();
        }*/

        shoppingCart cart = new shoppingCart();

        shoppingItem tissues = new shoppingItem("tissues", 2.00);
        shoppingOrder tissueOrder = new shoppingOrder(tissues, 5);

        shoppingItem candy = new shoppingItem("candy", 3.00);
        shoppingOrder candyOrder = new shoppingOrder(candy, 10);

        cart.addToCart(tissueOrder);
        cart.addToCart(candyOrder);

        cart.applyDiscounts();

        System.out.printf("Your cart's total is: $%.2f%n", cart.cartTotal());

    }
}
