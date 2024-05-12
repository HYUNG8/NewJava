package conditionEx;

public class ConditionEx6 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		String status = (a > b) ? "더 큰 숫자는 " + a + "입니다." : "더 큰 숫자는 " + b + "입니다.";
		
		System.out.println(status);
		
		
		int max = (a > b) ? a : b;
		
		System.out.println("더 큰 숫자는 "+ max + "입니다.");
	}

}
