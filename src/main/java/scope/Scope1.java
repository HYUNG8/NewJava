package scope;

public class Scope1 {

	public static void main(String[] args) {
		
		int m = 10; // m 생존 시작 (main메소드 안에서만 쓸 수 있다.
		
		if(true) {
			
		// if문 안에서 생성된 변수는 if문 안에서만 쓸 수 있다.
				
			int x = 20; // x 생존 시작
		
			System.out.println("if m = " + m);
			System.out.println("if x = " + x);
		} // x 생존 종료
		
		// System.out.println("if x = " + x); // x의 생존벙위가 아니기 때무에 컴파일 에러가 난다.
		System.out.println("if m = " + m);
	} // m 생존 종료

}
