import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart
{

	/*
	 * Shopping cart properties, a list of all items in shopping cart
	 */
	private ArrayList<Item> shoppingCart;

	/*
	 * Constructors to build the ShoppingCart objects
	 * 4 constructors for all types of inputs
	 */
	public ShoppingCart()
	{
		shoppingCart = new ArrayList<Item>();
	}

	public ShoppingCart(Item item)
	{
		shoppingCart = new ArrayList<Item>();
		shoppingCart.add(item);
	}

	public ShoppingCart(Item[] items)
	{
		shoppingCart = new ArrayList<Item>();
		addItems(items);
	}

	public ShoppingCart(ArrayList<Item> items)
	{
		shoppingCart = new ArrayList<Item>();
		addItems(items);
	}

	/*
	 * AddItem methods
	 * 3 methods one for each amount and type of input for items
	 */
	public void addItem(Item item)
	{
		this.getShoppingCart().add(item);
	}

	public void addItems(Item[] items)
	{
		for (int i = 0; i < items.length; i++)
		{
			this.addItem(items[i]);
		}
	}

	public void addItems(ArrayList<Item> items)
	{
		for (int i = 0; i < items.size(); i++)
		{
			this.addItem(items.get(i));
		}
	}

	/*
	 * RemoveItem methods
	 * 3 methods one for each amount and type of input for items
	 */
	public void removeItem(String item)
	{
		int index = findItem(item);
		if (index == -1)
		{
			return;
		}
		this.getShoppingCart().remove(0);
	}

	public void removeItems(String[] items)
	{
		for (int i = 0; i < items.length; i++)
		{
			removeItem(items[i]);
		}
	}

	public void removeItems(ArrayList<String> items)
	{
		for (int i = 0; i < items.size(); i++)
		{
			removeItem(items.get(0));
		}
	}

	/*
	 * FindItem
	 * This method searches through the shoppingCart property
	 * and finds the index in the shoppingCart where the item parameter exists.
	 * If the item does not exist in the cart it returns -1.
	 */
	public int findItem(String itemName)
	{
		for (int i = 0; i < this.getShoppingCart().size(); i++)
		{
			if (this.getShoppingCart().get(i).getName().equals(itemName))
			{
				return i;
			}
		}
		return -1;
	}

	/*
	 *hasItem
	 *Checks the shoppingCart property to determine if the given item
	 *parameter exists in the shoppingCart.
	 */
	public boolean hasItem(String item)
	{
		if (findItem(item) != -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	/*
	 * getTotalCost
	 * Sums the cost of every item in shoppingCart and returns it.
	 */
	public double getTotalCost()
	{
		double total = 0;
		for (int i = 0; i < this.getShoppingCart().size(); i++)
		{
			total += this.getShoppingCart().get(i).getPrice();
		}
		return total;
	}

	/*
	 * getShoppingList
	 * returns shoppingCart property
	 */
	public ArrayList<Item> getShoppingCart()
	{
		return this.shoppingCart;
	}

	/*
	 * toString
	 * returns the shoppingCart as a string
	 */
	public String toString()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return "Shopping Cart: " + Arrays.toString(this.getShoppingCart().toArray()) + "\nTotal Cost: " + formatter.format(this.getTotalCost());
	}
}
