package static2.ex;

public class Car {
	
	private static int totalCars = 0;
	private String name;
	

	public Car(String name) {
		System.out.println("구입한 차량이름: " + name);
		this.name = name;
		totalCars++;
	}
	
	static void showTotalCars() {
		System.out.println("구매한 차량 수: " + totalCars);
	}
		

}
