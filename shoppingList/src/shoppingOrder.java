public class shoppingOrder
{
    shoppingItem item;
    private int quantity = 0;
    private double total = 0;

    public shoppingOrder(shoppingItem i, int q)
    {
        this.item = i;
        this.quantity = q;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public shoppingItem getItem()
    {
            return item;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getOrderTotal()
    {
        return total;
    }

    public void applyTwoForTwoDiscount(shoppingItem item)
    {
        if (quantity > 1)
        {
            double price = item.getPrice();
            double discountedQuantPrice = ((quantity - (quantity % 2)) / 2) * price;
            total = discountedQuantPrice + ((quantity % 2) * price);
            System.out.printf("Your %s's discounted total is: $%.2f%n", item.getItemName(), total);
        }
        else if (quantity <= 0)
        {
            System.out.println("Please enter a valid quantity amount.");
        }
    }
}
