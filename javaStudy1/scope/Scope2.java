package scope;

public class Scope2 {

	public static void main(String[] args) {
		
		int m = 10;
		
		for(int i = 0; i < 2; i++) {
			
			// for문 내에서 생성된 변수는 for문에서만 사용 가능하다.
			System.out.println("for m = " + m);
			System.out.println("for i = " + i);
			
		} // i 생존 종료
		
		// System.out.println("for i = " + i); // i 접근불가
		System.out.println("for m = " + m);
	}

}
