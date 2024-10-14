package static1;

public class DecoData {
	
	
	private int instanceValue;
	private static int staticValue;
	
	public static void staticCall() {
		
		//instancdValue++; // 인스턴스 변수 접근, compile error
		//instanceMethod(); // 인스턴스 메서드 접근, compile error
		
		staticValue++;	// 정적 변수 접근
		staticMethod();	// 정적 메서드 접근
		
	}
	
	public void instanceCall() {
		instanceValue++; // 인스턴스 변수 접근
		instanceMethod(); // 인스턴스 메서드 접근
		
		staticValue++;	// 정적 변수 접근
		staticMethod(); // 정적 메서드 접근
	}

	private static void staticMethod() {
		System.out.println("staticValue= " + staticValue);		
	}
	
	private void instanceMethod() {
		System.out.println("instanceValue= " + instanceValue);
	}
	
	public static void staticCall2(DecoData data) {
		
		data.instanceValue++;  
		data.instanceMethod(); 
		
		// 참조값을 매게변수로 받아서 직접 지정해주면 인스턴스 변수,메서드 사용가능
	}
}
