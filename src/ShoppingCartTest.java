import java.util.ArrayList;

public class ShoppingCartTest
{

	public static void main(String[] args)
	{
		ArrayList<Item> list1 = new ArrayList<Item>()
		{{
			add(new Item("Bread", 4.52));
			add(new Item("Eggs", 3.62));
			add(new Item("Milk", 5.12));
			add(new Item("Bacon", 4.20));
		}};
		ArrayList<Item> list2 = new ArrayList<Item>()
		{{
			add(new Item("Bread", 4.52));
			add(new Item("Eggs", 3.62));
		}};
		/*
		 * Test 0
		 * The following test should return:
		 * SunShine:$0.00
		 */
		Item item0 = new Item();
		item0.setName("SunShine");
		System.out.println("Test 0:");
		System.out.println(item0);
		System.out.println("******************************************************************");
		/*
		 * Test 1
		 * The following test should return:
		 * Air:$0.00
		 */
		Item item1 = new Item("Air", -2);
		System.out.println("Test 1:");
		System.out.println(item1);
		System.out.println("******************************************************************");
		/*
		 * Test 2
		 * The following test should return:
		 * Shopping Cart: [Bread:$4.52, Eggs:$3.62, Milk:$5.12, Bacon:$4.20]
		 * Total Cost: $17.46
		 */
		ShoppingCart cart1 = new ShoppingCart(list1);
		System.out.println("Test 2:");
		System.out.println(cart1);
		System.out.println("******************************************************************");
		/*
		 * Test 3 - REPLACE TEST WITH addItem
		 * Shopping Cart: [Bread:$4.52, Eggs:$3.62]
		 * Total Cost: $8.14
		 */
		ShoppingCart cart2 = new ShoppingCart(list2);
		System.out.println("Test 3:");
		System.out.println(cart2);
		System.out.println("******************************************************************");
		/*
		 * Test 4
		 * The following test should return:
		 * true
		 */
		System.out.println("Test 4:");
		System.out.println(cart1.hasItem("Bread"));
		System.out.println("******************************************************************");
		/*
		 * Test 5
		 * The following test should return:
		 * Shopping Cart: [Eggs:$3.62, Milk:$5.12, Bacon:$4.20]
		 * Total Cost: $12.94
		 */
		cart1.removeItem("Bread");
		System.out.println("Test 5:");
		System.out.println(cart1);
		System.out.println("******************************************************************");
		/*
		 * Test 6
		 * The following test should return:
		 * Shopping Cart: [Milk:$5.12, Bacon:$4.20]
		 * Total Cost: $9.32
		 */
		cart1.removeItems(new String[]{"Bread", "Eggs"});
		System.out.println("Test 6:");
		System.out.println(cart1);
		System.out.println("******************************************************************");
		/*
		 * Test 7
		 * The following test should return:
		 * Shopping Cart: [Milk:$5.12, Bacon:$4.20, Bread:$4.52, Eggs:$3.62]
		 * Total Cost: $17.46
		 */
		cart1.addItems(list2);
		System.out.println("Test 7:");
		System.out.println(cart1);
		System.out.println("******************************************************************");
		/*
		 * Test 8
		 * The following test should return:
		 * 17.46
		 */
		System.out.println("Test 8:");
		System.out.println(cart1.getTotalCost());
	}
}
