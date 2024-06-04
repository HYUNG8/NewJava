package method;

public class Method1Ref {

	public static void main(String[] args) {
		
		
		// 계산1 
		int result = add(1, 2);
		System.out.println("결과값: " + result);

		// 계산2
		int result2 = add(10, 20);
		System.out.println("결과값: " + result2);

	}

	
	// add 메서드
	public static int add(int a, int b) {
			
			System.out.println(a + "+" + b + " 연산 수행");
			
			int result = a + b;
			
			return result;
		}
}
