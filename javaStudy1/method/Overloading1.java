package method;

public class Overloading1 {

	
	
	// 메서드 오버로딩(Overloading)
	// 이름이 같고 매개변수가 다른 메서드를 여러개 정의한 것.
	
	// 오버로딩 규칙
	// 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환타입은 인정하지 않는다.
	
	// int add(int a, int b)
	// double add(int a, int b)
	// 위의 케이스는 메서드의 이름과 매개변수의 타입이 같으므로 컴파일 오류가 발생한다.
	
	// 메서드 시그니쳐(method signature)
	// 메서드 시그니쳐 = 메서드 이름 + 매개변수 타입(순서)
	// 메서드 시그니쳐는 자바에서 메서드를 구분할 수 있는 고유한 식별자나 서명을 뜻한다. 
	// 메서드 시그니처는 메서드의 이름과 매개변수타입(순서포함)으로 구성되야한다. 
	// 자바 입장에서는 각각의 메서드를 고유하게 구분할 수 있어야한다. 그래야 어떤 메서드를 호출할 지 결정한다.
	// 따라서 메서드 오버로딩에서 설명한 것 처럼 메서드 이름이 같아도 시그니처가 다르면 다른 메서드로 간주한다.
	// 반환타입은 시그니처에 포함되지 않는다.
	// 위의 두 메서드는 add(int a, int b)로 시그니처가 같다. 따라서 메서드 구분이 불가능하므로 컴파일 오류가 발생한다.
	
	
	
	// 매게변수의 갯수가 다른 오버로딩 예제
	public static void main(String[] args) {
		
		System.out.println("1: "+ add(1,2));
		System.out.println("2: "+ add(1,2,3));
		
	}
	
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("1번 호출");
		return a + b + c;
	}
	
}
