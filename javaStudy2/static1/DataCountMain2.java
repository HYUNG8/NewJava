package static1;

public class DataCountMain2 {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Data2 data1 = new Data2("A",counter);
		System.out.println("A count: " + counter.count);

		Data2 data2 = new Data2("B",counter);
		System.out.println("B count: " + counter.count);
		
		Data2 data3 = new Data2("C",counter);
		System.out.println("C count: " + counter.count);
	}

}

// count 클래스를 만들어서 관리하면 분편한 점이 있다.
// Data2와 관련된 일인데, Counter 라는 별도의 클래스를 추가로 사용해야 한다.
// 생성자의 매게변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.
