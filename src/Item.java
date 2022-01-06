import java.text.NumberFormat;

public class Item
{
	/*
	 * Item properties, defines the item name and price
	 */
	private String itemName;
	private double price;

	/*
	 * Sets the default values for the item properties
	 */
	public Item()
	{
		setName("");
		setPrice(0);
	}

	/*
	 * Sets the properties of the item equal to the parmaters
	 */
	public Item(String name, double price)
	{
		setName(name);
		setPrice(price);
	}

	/*
	 * Return the price of the item
	 */
	public double getPrice()
	{
		return this.price;
	}

	/*
	 * return the name of the item
	 */
	public String getName()
	{
		return this.itemName;
	}

	/*
	 * sets the price to equal the parameter price if the price is greater then or equal to 0
	 */
	public void setPrice(double price)
	{
		if (price >= 0)
		{
			this.price = price;
		}
		else
		{
			this.price = 0;
		}
	}

	/*
	 * sets the name of the item to the parameter
	 */
	public void setName(String name)
	{
		this.itemName = name;
	}

	/*
	 * checks if this item is equal to the parameter item
	 */
	public boolean equals(Item item)
	{
		return (this.itemName.equals(item.getName()) && this.price == item.getPrice());
	}

	/*
	 * returns the item as a string
	 */
	public String toString()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return this.getName() + ":" + formatter.format(this.getPrice());
	}
}