package static1;

public class DecoMain2 {

	public static void main(String[] args) {
		
		String s = "hello Java";
		
		String deco = DecoUtil2.deco(s);
		
		System.out.println( "변환 전: " + s);
		System.out.println( "변환 후: " + deco);
	}

}

// static이 있으면 인스턴스 생성 없이 메서드를 사용할 수 있다.
// 정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드를 사용했다.


// 메서드 앞에 static
// 메서드 앞에 static 을 붙이면 이것을 정적 메서드 또는 클래스 멤서드라고 한다. 
// 정적 메서드는 static 이 정적이라는 뜻이디 때문이고, 클래스 메서드는 인스턴스 생성 없이 마치 클래스에 있는 메서드를 호출하는 것 같기 때문이다.

// static 이 붙지 않은 메서드르 인스턴스 메서드라고 한다.

