package method;

public class Overloading3 {

	

	// 매게변수의 타입이 다른 오버로딩 예제2
	public static void main(String[] args) {
		
		System.out.println("1: "+ add(1,2));
		System.out.println("2: "+ add(1.2,1.5));
		
	}
	
	// 1번 add
	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}
	
	// 2번 add
	public static double add(double a, double b) {
		System.out.println("2번 호출");
		return a + b;
	}
	
	
	// 1번 add 메서드를 지우면 모두 2번 add 메서드를 호출한다.(int는 double로 형변환이 가능하기 때문에)
	// 본인에 타입에 맞는 메서드를 가장먼저 찾고 없으면 형변환이 가능한 메서드를 찾아서 실행한다.
	
}
