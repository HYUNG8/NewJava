package method;

public class MethodReturn2 {

	public static void main(String[] args) {
		
		checkAge(10);
		checkAge(20);

	}
	
	
	public static void checkAge(int i) {
		
		if (i > 18) {
			
			System.out.println(i + "살 이므로 출입이 가능합니다.");
			return;
			
		} else {
			System.out.println(i + "살 이므로 출입이 불가합니다.");
		}
	}

}
