package conditionEx;

public class ConditionEx2 {

	public static void main(String[] args) {
		
		int distance = 7000;
	
		
		if(distance <= 1) {
			System.out.println("도를 이용하세요");
		}
		else if(distance <= 10) {
			System.out.println("자전를 이용하세요");
		}
		else if(distance <= 100) {
			System.out.println("자동차를 이용하세요");
		}
		else {
			System.out.println("비행기를 이용하세요");
		}

	}

}
