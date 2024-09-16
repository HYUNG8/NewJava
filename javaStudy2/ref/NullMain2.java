package ref;

public class NullMain2 {

	public static void main(String[] args) {
		
		
		Data data = null;
		data.value = 10;                                // NullPointerException 에러 발생
		System.out.println("data = " + data.value);
		
		
		// 결과적으로 null은 참조할 주소가 없다는 뜻이다.
		// 따라서 참조할 객체 인스턴스가 존재하지 않으므로  java.lang.NullPointerException 이 발생하고 프로그램이 종료된다.
		// 참고로 예외가 발생했으므로 다음 로직은 수행되지 않는다.
	}

}
// NullPointerEeception은 참조값이 없는 객체를 찾아가면 발생하는 에러이다.
// 객체를 참조할 때는 .(dot)을 사용한다. 근데 참조값이 null이라면 값이 없다는 뜻이므로 찾아갈 수 있는 객체가 없다.


