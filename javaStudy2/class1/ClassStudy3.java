package class1;

public class ClassStudy3 {

	public static void main(String[] args) {
		
		Student student1;
		student1 = new Student(); // 인스턴스 생성 (설계도인 클래스를 사용해서 실제 메모리에 올려 사용할 객체를 만든다.)
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;
		
		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80; 
		
		Student student3 = new Student();
		student3.name = "학생3";
		student3.age = 16;
		student3.grade = 80;
		
		System.out.println("이름: " + student1.name + " 나이: " + student1.age + "성적: " + student1.grade);
		System.out.println("이름: " + student2.name + " 나이: " + student2.age + "성적: " + student2.grade);
		System.out.println("이름: " + student3.name + " 나이: " + student3.age + "성적: " + student3.grade);

	}
	
	// 클래스와 사용자의 정의 타입
	// int 라고 하면 정수 타입, String이라고 하면 문자 타입이다.
	// 학생(student)라는 타입을 만들면 되지 않을까?
	// 클래스를 사용하면 int,String과 같은 타입을 만들려면 설계도가 필요하다. 이 살계도가 바로 클래스이다.
	// 사용자가 집접 정의하는 사용자 정의 타입을 마들려면 설계도가 필요하다. 
	// 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체 또는 인스턴스라 한다.
	// 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
	
	// 용어
	// 클래스 - 설계도
	// 인스턴스, 객체 - 클래스(설계도)를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 인스턴스와 객체는 같은 의미로 사용한다.
	
	
	// 코드 분석
	// Student student1; // 변수 생성
	// student1 = new Student(); // 인스턴스 생성 (설계도인 클래스를 사용해서 실제 메모리에 올려 사용할 객체를 만든다.)
	// student1 = x001; // x001은 참조값(객체의 주소)
	
	// new 할때하다 메모리에 새로 생성하는 것이다.
	// student2 = x002; // student2의 참조값
	
	// 객체에 값 대입
	// student1.name = "학생1"; // 1. student1 객체의 name 멤버 변수에 값 대입.
	// x001.name = "학생1"; // 2. 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입.
	
	
}
