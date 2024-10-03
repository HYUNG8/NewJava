package access.ex;

public class shoppingCartMain {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("book", 5000, 2);
		Item item2 = new Item("CD", 9000, 4);

		cart.addItem(item1);
		cart.addItem(item2);
		
		cart.displayItem();
		
	}

}
