package operator;

public class operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//문자열 비교는 rquals

		
		String str1 = "문자열1";
		String str2 = "문자열2";
		
		//리터럴 비교
		boolean result1 = "hello".equals("hello"); 
		
		//문자열 변수, 리터럴 비교
		boolean result2 = str1.equals("문자열1"); 
		
		//문자열 변수 비교
		boolean result3 = str1.equals(str2); 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		System.out.println("hello" == "hello"); //특정한 조건에서 true가 나오지 않는 경우가 있으므로 문자열 비교는 "==" 를 라용하지 않는다.
	}

}
