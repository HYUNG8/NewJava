package condition;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2등급과 3등급의 쿠폰이 같을 때.
		int grade = 2;
		int coupon;
		
		switch(grade) {
			case 1 :
				coupon = 1000;
				break;
			case 2 :
			case 3 :
				coupon = 3000;
				break;
			default :
				coupon = 0;
				break;
		}
		
		System.out.println("발급받은 쿠폰 "+coupon+"원!!");
	}

}
