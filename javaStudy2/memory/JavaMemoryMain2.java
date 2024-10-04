package memory;

public class JavaMemoryMain2 {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
		method1();
		
		System.out.println("main end");

	}

	static void method1() {
		
		System.out.println("method1 start");
		
		Data data1 = new Data(10);
		method2(data1);
		
		System.out.println("method1 end");
	}

	static void method2(Data data2) {
		System.out.println("method2 start");
		
		System.out.println("data.value: " + data2.getValue());
		
		System.out.println("method2 end");
		
	}

}


// method1이 종료된 후에 method1()의 스택 프레임이 제거되고 지역변수 data1도 함께 제거되었다.
// 이제 Data data1 = new Data(10);로 생성되었던 Data 인스턴스를 참조하는 곳은 더 없다.
// 참조하는 곳이 없으므로 사용되는 곳도 없다. 결과적으로 프로그램에서 사용하지 않는 객체인 것이다.
// GC(가비지 컬렉션)은 이렇게 참조가 모두 사라진 인스턴스를 찾아서 메모리에서 제거한다.

// 참고: 힙영역 외부가 아닌, 힙 영역 안에서만 인스턴스끼리 서로 참조하는 경우에도 GC의 대상이된다.

// 지역변수는 스택영역에,객체(인스턴스)는 힙 영역에 관리된다.
