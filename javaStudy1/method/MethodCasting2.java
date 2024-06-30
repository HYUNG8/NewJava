package method;

public class MethodCasting2 {

	public static void main(String[] args) {
		
		int number = 100;
	
	printNumber(number); 
	}

	
	public static void printNumber(double n) {
		
		System.out.println("숫자: " + n);
	}
	
	// double형 매게변수(파라미어)에 int형 인수를 전달하는데 문제가 없이 잘 동작한다.
	// 메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야한다.
	// 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출 할 수 있다.
	
	
	
	

}
