package class1;

public class ClassStudy4 {

	public static void main(String[] args) {
		
		
		Student student1 = new Student(); 
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;
		
		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80; 
		
		Student student3 = new Student();
		student3.name = "학생3";
		student3.age = 17;
		student3.grade = 80;
		
		
		// 배열 도입
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
		System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
		System.out.println("이름: " + students[2].name + " 나이: " + students[2].age + " 성적: " + students[2].grade);
		
		
		
		// Student[] students = new Student[3]; // students는 new Student[3]이 아니라 new Student[3]의 참조값을 같게된다.
		// Student[] students = new Student[3]; // students = x005(참조값)
		
		// students = {student1, student2, student3}
		//   x005   = {x001, x002, x003}    //실제 변수 안에는 참조값이 들아있다.
		
		// 배열 안에 변수에는 인스턴스 자체가 아니라 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다.
		// 따라서 대입시에 인스턴스가 복사되는 것이 아니라 참고값만 복사된다.
		// students[0] = student1; -> students[0] = x001;
		
		// 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
		
		// 배열에 들어있는 객체 사용
		// System.out.println(students[0].name); // 배열 접근 시작
		// System.out.println(x005[0].name);     // [0]를  사용해서 x005 배열의 1번 요소에 접근   ([0]은 인덱스 0)
		// System.out.println(x001.name);        // .(dot)을 사용해서 참도값으로 객체에 접근
		// System.out.println("학생1");
		
		// System.out.println(students[1].name); // 배열 접근 시작
		// System.out.println(x005[1].name);     // [1]를  사용해서 x005 배열의 1번 요소에 접근   
		// System.out.println(x001.name);        // .(dot)을 사용해서 참도값으로 객체에 접근
		// System.out.println("학생2");
		
		// System.out.println(students[2].name); // 배열 접근 시작
		// System.out.println(x005[2].name);     // [2]를  사용해서 x005 배열의 1번 요소에 접근   
		// System.out.println(x001.name);        // .(dot)을 사용해서 참도값으로 객체에 접근
		// System.out.println("학생3");
		
		
	}
}
