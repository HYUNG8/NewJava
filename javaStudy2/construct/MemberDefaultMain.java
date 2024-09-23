package construct;

public class MemberDefaultMain {

	public static void main(String[] args) {
		
		MemberDefault memberDefault = new MemberDefault();
		
		

	}

}


// MemberDefault 클래스에 생성자가 없다.
// MemberDefault memberDefault = new MemberDefault();
// 하지만 위처럼 코드를 작성하면 자바에서 자동으로 기본 생성자를 만들어준다.

// 생성자 정리
// 생성자는 반드시 호출되어야 한다.
// 생성자가 없으면 기본 생성자가 제공된다.
// 생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다. 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
