package access.ex;

public class ShoppingCart {
	
	private Item[] items = new Item[10];
	private int itemCount;
	
	
	public void addItem(Item item) {
		
		if(items.length <= itemCount) {
			System.out.println("쇼핑카트가 가득 찾습니다.");
			return;
		}
		
		items[itemCount] = item;
		++itemCount;

		
	}
	
	public void displayItem() {
		
		int cartTotalPrice = 0;
		System.out.println("장바구니 상품 출력");
		
		
		for(int i = 0; i < itemCount; i++) {
			Item item = items[i];
			System.out.println("상품명:" + item.getName() + " 가격:" + item.totalPrice());
		}
		
		
//		for(Item item : items) {
//		System.out.println("상품명:" + item.getName() + " 가격:" + item.totalPrice());
//		cartTotalPrice += item.totalPrice();
//		}
		
		System.out.println("전체 가격의 합: " + CalculateCartTotalPrice(items));
	}
	
	private int CalculateCartTotalPrice(Item[] items) {
		
		int cartTotalPrice = 0;
		
		for(int i = 0; i < itemCount; i++) {
			
			Item item = items[i];
			
			cartTotalPrice += item.totalPrice();
		}
		
		return cartTotalPrice;
		
	}
	
	
	
}
