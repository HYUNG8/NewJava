package conditionEx;

public class ConditionEx3 {

	public static void main(String[] args) {
		
	    int dollar;
		dollar = 20;
		
		int won;
		
		
		if(dollar < 0) {
			System.out.println("잘못된 금액입니다.");
		}
		if(dollar == 0) {
			System.out.println("횐전할 금액이 없습니.");
		}
		if(dollar > 0) {
			won = dollar * 1300;
			System.out.println("환전할 금액은 " + won + "원 입니다." );
		}

	}

}
