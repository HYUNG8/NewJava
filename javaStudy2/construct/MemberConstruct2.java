package construct;

public class MemberConstruct2 {

	String name;
	int age;
	int grade;
	
	// 추가
//	MemberConstruct2(String name, int age){
//		this.name = name;
//		this.age = age;
//		this.grade = 50;
//	}

	// this()를 사용한 MemberConstruct2 
	MemberConstruct2(String name, int age){
		// System.out.println(" ");  // this()는 생성자 코드의 첫줄에만 작성할 수 있다.
		this(name, age, 50);
	}
	
	
	// this() 라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다. 참고로 this는 인스턴스 자신의 참조값을 가르킨다.
	// 그래서 자신의 생성자를 호출한다고 생각하면 된다.
	// this()를 활용하면 지금과 같이 중복을 제거할 수 있다.
	// this()는 생성자 코드의 첫줄에만 작성할 수 있다.
	
	MemberConstruct2(String name, int age, int grade){
		
		System.out.println("생성자호출 name: " + name + " 나이: " + age + " 점수: " + grade);
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

// 

