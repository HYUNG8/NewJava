package casting;

public class Casting2 {

	public static void main(String[] args) {
		
		
		double doubleValue = 1.5;
		int intValue = 0;
		
		// intValue = doubleValue; // 컴파일오류 발생
	
		intValue = (int) doubleValue; // 형변환
		System.out.println(intValue);
		
		// 자동이 아닌 개발자가 강제로 형변환을 할 경우 명시적 형변환이라고 말한다.
		
		// 명시적형변환 과정
		// doubleValue = 1.5 
		intValue = (int) doubleValue; 
		intValue = (int) 1.5; // doubleValue에 저장된 값을 읽는다.
		intValue = 1; // (int)로 형변환한다. intValue에 int형인 1을 대입한다.
		
		
		// 참고로 형변환을 한다고 해서 doubleValue 자체의 타입이 변경되거나 그 안의 값이 변경되는 것은 아니다.
		// doubleValue에서 읽은 값을 변경하는 것이다. doubleValue 안에 들어있는 값은 1.5 그대로 유지된다.
		// 참고로 젼수의 값은 대입연산자(=)을 사용해서 직접 대입할 경우에만 변경된다.
		

	}

}
