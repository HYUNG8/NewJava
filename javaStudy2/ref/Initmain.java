package ref;

public class Initmain {

	public static void main(String[] args) {
		
		InitData data = new InitData();
		System.out.println("Value1 = " + data.value1 ); // 초기화하지 않았지만 0으로 초기화되었다.
		System.out.println("Value2 = " + data.value2 ); // 10으로 초기화되어있기 때문에 10으로 출력
		
		
		// 인스턴스를 생성하면 자바에서 초기화를 해준다.

	}

}
