package method;

public class MethodValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		System.out.println("1. changenum1 호출 전, nunmber: " + num1);
		num1 = changeNumber(num1);
		System.out.println("4. changenum1 호출 후, nunmber: " + num1);
	}
	
	
	public static int changeNumber(int num2) {
		
		System.out.println("2. changenum1 변경 전, nunmber: " + num2);
		num2 = num2 * 2;
		System.out.println("3. change num1 변경 후, nunmber: " + num2);
		return num2;
	}
	
	
	// changeNumber를 호출하여 num2를 복제하여 값을 계산하고 return 한다. 
	// changeNumber(num1) = num2 = 10 의 결과가 된다. 
	// 
	
	
}
