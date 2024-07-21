package ref;

public class Method1 {

	public static void main(String[] args) {
		

		Student student1 = createStudent("loopy",15,99);
		Student student2 = createStudent("zoro",17,90);
		
		
		printStudent(student1);
		printStudent(student2);
	
		

	
	}
	
	public static Student createStudent(String name, int age, int grade) {
		Student student = new Student();
		student.name = name;
		student.age = age;
		student.grade = grade;
		return student;
	}

	public static void printInit(Student student, String name, int age, int grade) {
		student.name = name;
		student.age = age;
		student.grade = grade;
	}
	
	public static void printStudent(Student student) {
		System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
	}
	
}
