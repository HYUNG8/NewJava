package final1;

public class FinalLocalMain {

	public static void main(String[] args) {
		
		// Final 지역 변수1
		final int data1; 
		
		data1 = 10; //최초 변수 할당, 최초 한번만 가능
		//data1 = 20; //컴파일 오류
		
		//final 지역 변수2
		final int data2 = 10; 
		// data2 = 20; // 컴파일 오류
		
		method(10);

	}
	
	static void method(final int parameter) {
		
		//parameter = 10; // 컴파일 오류, 
						// 매게변수에 파이널이 붙으면 메서드 내부에서 매게변수의 값을 변경할 수 없다.
						// 따라서 메서드 호출 시점에 아용된 값이 끝까지 사용된다.
		
	}

}
