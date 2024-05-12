package condition;

public class CondOp {

	public static void main(String[] args) {
		
		
		// If

		int age = 18;
		String grade;
		
		if(age > 18){
			grade = "성인";
		} else {
			grade = "미성년자";
		}
		System.out.println("age = "+ age + " status = " + grade);
		
		//CondOp
		// 삼항연산자는 항이 세개이다. 조건 ? 참_표현식 : 거짓_표현식
		//단순히 참과 거짓을 이용해서 특정 값을 구하는 경우는 삼항연산자가 간결하게 코드를 작성할 수 있다.
		
		age = 18;
		String status = (age > 18) ? "성인" : "미성년자";
		
		System.out.println("age = "+ age + " status = " + grade);
		
	}

}
