package condition;

public class switch3 {

	public static void main(String[] args) {
		
		//Java14~Switch
		// ->를 사용한다.
		// 선택된 데이터를 반환할 수 있다.
		
		int grade = 2;
		
		int coupon = switch (grade) {
		case 1 -> 1000;
		case 2 -> 2000;
		case 3 -> 3000;
		default -> 0; 
		};
		
		System.out.println("발급받은 쿠폰 " + coupon + "원" );
	}

}
