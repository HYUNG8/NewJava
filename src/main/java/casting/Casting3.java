package casting;

public class Casting3 {

	public static void main(String[] args) {
		
		long maxIntValue = 2147483647; // int 최고값
		long maxIntOver = 2147483647L; // int 최고값 + 1
		int intValue = 0;
		
		
		intValue = (int) maxIntValue; // 형변환
		System.out.println("maxIntValue casting= " + intValue); // 출력: 2147483647
		
		intValue = (int) maxIntOver; // 형변환
		System.out.println("maxIntOver casting=" + intValue); // 출력: -2147483648
		
		
		// 초과 범위 변환과정
		
		maxIntOver = 2147483648L; // int 최고값 + 1
		intValue = (int) maxIntOver; // 변수 값 읽기 시도
		intValue = (int) 2147483647L; // 형변환 시도
		intValue = -2147483648;
		
		// int형은 2147483648L를 표현할 수 있는 방법이 없다.
		// 이렇게 기존 범위를 초과해서 표현하게되면 전혀 다른 숫자가 표현되는데, 이런 현상을 오버플로우라고 한다.
		// 보통 오버플로우가 발생하면 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.(참고로 -2147483648은 int의 가장 작은 숫자이다.)
		// 오버플로우가 발생한 것 자체가 문제이기 때에 오버플로우 숫자를 계산하거나 하지 말고 타입을 상위 타입으로 바꿔야한다.
		
		
		
		
		

	}

}
