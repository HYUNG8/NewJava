package access.a;

public class AccessInnerMain {

	public static void main(String[] args) {
		
		
		AccessData data = new AccessData();
		
		// public 호출 가능
		data.publicField = 1;
		data.publicMethod();
		
		// 같은 패키지 default도 호출 가능
		data.defaultField = 2;
		data.defaultMethod();
		
		// private 호출 불가
		// data.privateField = 3;
		// data.privateMethod();
		
		data.innerAccess();
		
		// innerAccess()는 외부에서 호출되었지만 innerAccess() 메서드는 innerData에 포함되어 있다.
		// 그렇기 때문에 innerAccess() 메서드는 자신의 private 필드와 메서드에 모두 접근할 수 있다.
		

	}

}
