package variable;

public class Var6 {

	public static void main(String[] args) {
		
		//변수 타입
		int a = 100; //정수
		double b = 10.5; //실수
		boolean c = true; //불리언(boolean) true, false 입력 가능
		char d = 'A'; //문자 하나
		String e = "Hello Java"; //문자열, 문자열을 다루기 위한 특별한 
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
//		int z = "100"; //타입이 맞지 않기 때문에 에러가 난다.
		
		
		/*
		변수 타입의 정리
		
		다음 타입은 실무에서 거의 사용하지 않는다.
		byte:표현의 길이가 너무 작다. 또 자바는 기본으로 4byte(int)를 효율적으로 계산하도록 설계되어 있다. int를 사용하자.
				-byte 타입을 선언하고 여기에 숫자를 대입하는 일은 거의 없다. 대신에 파일을 바이트 단위로 다루기 때문에 파일 전송,복사에 주로 사용된다.
		short:표현의 길이가 너무 작다. 또 자바는 기본으로 4byte(int)를 효율적으로 계산하도록 설계되어 있다. int를 사용하자.
		float:표현의 길이와 정밀도가 낮다. 실수형은 double를 사용하자.
		char:문자 하나를 표현하는 일은 거의 없다. 문자 하나를 표현할 때도 문자열을 사용할 수 있다. 
		
		*참고
		메모리 용량은 매우 저렴하다. 따라서  메로미 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효과적이다.
		 
		자주 사용하는 타입
		정수 - int,long: 자나는 정수에 기본으로 int를 사용한다. 만약 20억이 넘을 것 같으면 long을 사용하면 된다(파일을 다룰 때는 byte를 사용한다.)
		실수 - double
		불린형 - boolean은 조건문에서 자주 사용한다.
		문자열 - String
		 */
		
		
		
	}

}
