package static1;

public class Data3 {
	
	public String name;
	public static int count; // static
	
	public Data3(String name) {
		
		this.name = name;
		count++;			// Data3.count++ 가 맞지만 같은 클래스이기 때문에 Data3을 생략할 수 있다.
				
	}

}
