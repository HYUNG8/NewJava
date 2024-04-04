package operator;

public class operator {

	public static void main(String[] args) {
		
		//문자열 더하기
		
		
		//문자열과 문자열 더하기1
		String result1 = "hello" + "world";
		System.out.println(result1);
		
		//문열과 문자 더하기2
		String s1 = "hello";
		String s2 = "world2";
		
		String result2 = s1 + s2;
		System.out.println(result2);
		
		//문자열 더하기 숫자
		String result3 = "a + b = " + 10;
		System.out.println(result3);
		//자바가 문자와 숫자를 더하면 숫자를 문자로 바꾸어서 연산한다.
		
		//문자열 더하기 숫자2
		int a = 20;
		String str = "a + b = ";
		String result4 = str + a;
		System.out.println(result4);
		
		
		
		//복잡한 연산에서 연산다 우선순위가 많이 필요한 경우에는 괄호를 넣어서 우선순위를 명시적으로 표현하자
		
		
		
		
		
	}

}
