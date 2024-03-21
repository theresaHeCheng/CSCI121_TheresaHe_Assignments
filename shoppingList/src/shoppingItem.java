public class shoppingItem
{
    private String itemName;
    private double price;

    public shoppingItem (String n, double p)
    {
        this.itemName = n;
        this.price = p;
    }
    public void setItemName(String name){
        this.itemName = name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getItemName(){
        return itemName;
}
    public double getPrice()
    {
        return price;
    }
}
