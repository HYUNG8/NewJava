package final1;

public class FinalFieldMain {

	public static void main(String[] args) {
		
		// final 필드 - 생성자 초기화
		System.out.println("생성자 초기화");
		ConstructInit constructInit1 = new ConstructInit(10); 
		ConstructInit constructInit2 = new ConstructInit(20); 
		System.out.println(constructInit1.value);
		System.out.println(constructInit2.value);
		
		
		//final 필드 - 필드 초기화
		System.out.println("필드 초기화");
		FieldInit fieldInit1 = new FieldInit();
		FieldInit fieldInit2 = new FieldInit();
		FieldInit fieldInit3 = new FieldInit();
	
		System.out.println(fieldInit1.value);
		System.out.println(fieldInit2.value);
		System.out.println(fieldInit3.value);
		
		// 상수
		System.out.println("상수");
		System.out.println(FieldInit.CONST_VALUE);
		
		// FieldInit.CONST_VALUE는 static 영역에 존재하고 final 키워드를 사용해서 초기값이 변하지 않는다.
		// static 영역은 단 하나한 존재하는 영역이다. MY_VALUE 변수는 JVM상에서 하나만 존재하므로 중복과 메모리 비효율 문제를 해결할 수 있다.
		// 이러한 이유로 필드에 final + 필드초기화를 하는 경우 static 을 붙혀서 사용하는게 효과적이다.
		
		

	}

}
