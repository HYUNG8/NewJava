package method;

public class MethodValue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		System.out.println("1. changeNumber 호출 전, num1: " + num1);
		changeNumber(num1);
		System.out.println("4. changeNumber 호출 후, num1: " + num1);
	}
	
	
	public static void changeNumber(int num2) {
		
		System.out.println("2. changeNumber 변경 전, num2: " + num2);
		num2 = num2 * 2;
		System.out.println("3. changNumber 변경 후, num2: " + num2);
	}
	
	// 자바는 항상 변수의 값을 복사해서 대입한다.(원본에 절대 손을 대지 않는다.)
	// 위에서 num2는 num1의 값에 아무런 영향을 주지 않는다. 
	// num2는 num1의 값을 복사해서 사용한 것 뿐이다.
	
	
}
