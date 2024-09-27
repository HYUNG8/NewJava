package access.a;

public class AccessData {
	
	public int publicField;
	
	int defaultField;
	
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출");
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod 호출");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod 호출");
	}
	
	public void innerAccess() {
		System.out.println("내부 호출");
		
		publicField = 100;
		defaultField = 200;
		privateField = 300;
		publicMethod();
		defaultMethod();
		privateMethod();
		
		// 자기 자신에게 접근한 것이다. 따라서 private 를 포함한 모든 곳에서 접근할 수 있다.
	}
}
