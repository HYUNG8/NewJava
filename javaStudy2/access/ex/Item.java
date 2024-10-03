package access.ex;

public class Item {
	
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
	Item(String name, int price, int count){
			
		this.itemName = name;
		this.itemPrice = price;
		this.itemQuantity = count;
	}
	
	public String getName() {
		return itemName;
		}
	
	public int totalPrice() {
		return itemPrice * itemQuantity;
	}

}
	
