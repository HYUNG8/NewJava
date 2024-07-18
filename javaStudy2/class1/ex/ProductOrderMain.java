package class1.ex;

public class ProductOrderMain {

	public static void main(String[] args) {
		
		ProductOrder[] productOrders = new ProductOrder[3];
		
		ProductOrder dubu = new ProductOrder();
		dubu.productName = "두부";
		dubu.price = 2000;
		dubu.quantity = 2;
		productOrders[0]=dubu;
		
		
		ProductOrder kimchi = new ProductOrder();
		kimchi.productName = "김치";
		kimchi.price = 5000;
		kimchi.quantity = 2;
		productOrders[1]=kimchi;
		
		ProductOrder cola = new ProductOrder();
		cola.productName = "콜라";
		cola.price = 1500;
		cola.quantity = 2;
		productOrders[2]=cola;
		
		int sum = 0;
		
		for(ProductOrder product:productOrders) {
			System.out.println("상품명: "+ product.productName + " 가격: " + product.price + " 수량: " + product.quantity);
		    sum += product.price * product.quantity;
		}
		
		
		System.out.println("총 결제금액: " + sum);
		
		
		
		
		
	}

}
