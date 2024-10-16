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
		
		
		
		// 추가
		// 인스턴스를 통한 접근
		DecoData data3 = new DecoData();
		data3.staticCall();		// 에러가 발생하지는 않지만, 클래스메서드가 아닌 인스턴스메서드 처럼 보이기 때문에 사용하지 않는다.
		
		// 클래스를 통한 접근
		DecoData.staticCall();
		
	}

}
