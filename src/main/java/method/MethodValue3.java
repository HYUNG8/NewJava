package method;

public class MethodValue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		System.out.println("1. changeNumber 호출 전, nunmber: " + number);
		changeNumber(number);
		System.out.println("4. changeNumber 호출 후, nunmber: " + number);
	}
	
	
	public static void changeNumber(int number) {
		
		System.out.println("2. changeNumber 변경 전, nunmber: " + number);
		number = number * 2;
		System.out.println("3. changNumber 변경 후, nunmber: " + number);
	}
	
	// 자바는 항상 값을 복제해서 사용한다.
	// main()에 정의한 변수와 메서드의 파라미터 이름이 둘다 number로 같은 경우
	// 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다.
	// 메서드가 생성되면 메서드 별로 각각의 영역이 형성되고 각각의 영역 안에 변수가 존재한다. (다른 메로리 공간에 존재한다.)
	// 변수의 이름이 같아 하더라도 완전히 다른 변수이다.
	// 
	
	
}
