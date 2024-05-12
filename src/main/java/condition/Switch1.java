package condition;

public class Switch1 {

	public static void main(String[] args) {
		
		//switch문은 값이 같은지만 비교할 수 있다.
		// 조건식의 결과 값이 case의 값과 일치하면 해당 case를 실행한다.
		// breake는 현재 실행중인 코드를 끝내고 현재 switch문을 빠져나가게 하는 역할을 한다.
		// breake문이 없으면 일치하는 case 이후의 모든 case 가 순차적으로 실행됟다.
		// defult는 조건식의 결과값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드이다.(default문은 선택이다.)
		
		int grade = 2;
		int coupon;
		
		if(grade == 1) {
			coupon =1000;
		}
		else if(grade == 2) {
			coupon =2000;
		}
		else if(grade == 3) {
			coupon =3000;
		}
		else{
			coupon = 0;
		}
		
		System.out.println("발급받은 쿠폰 "+coupon+"원");
		
		
		grade = 3;
		
		switch(grade) {
			case 1 :
				coupon = 1000;
				break;
			case 2 :
				coupon = 2000;
				break;
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
