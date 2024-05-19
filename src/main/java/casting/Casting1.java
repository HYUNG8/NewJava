package casting;

public class Casting1 {

	public static void main(String[] args) {
		
		
		// 작은 범위에서 큰 범위에 값을 대입하는 것은 큰 문제가 없다.
		int intValue = 10;
		long longValue;
		double doubleValue;
		
		longValue = intValue; // int -> long
		System.out.println("longValue = " + longValue);
		
		doubleValue = longValue; // long -> double
		System.out.println("doubleValue = " + doubleValue);

		doubleValue = 20L; // long -> double
		System.out.println("doubleValue2 = " + doubleValue);
		
		
		// 자동 형변환
		// 위의 코드는 개념적으로는 아래와 같이 동작한다.
		
		//intValue = 10
		doubleValue = intValue;
		doubleValue = (double) intValue; // 형 맞추 
		doubleValue = (double) 10; // 변수 값 읽기
		doubleValue = 10.0;
		
		// 작은 범위에서 큰 범위는 자바가 자동으로 형변환을 해준다. -> 자동형변환(묵시적 변환)
		
		
	}

}
