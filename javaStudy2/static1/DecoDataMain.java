package static1;

public class DecoDataMain {

	public static void main(String[] args) {
		
		
		System.out.println("1. 정적 호출");
		DecoData.staticCall();
		
		System.out.println("2. 인스턴스 호출");
		DecoData data = new DecoData();
		data.instanceCall();
		
		
		System.out.println("3. 참조값 지정");
		DecoData.staticCall2(data);

	}

}
