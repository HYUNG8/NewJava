package ref;

public class Method2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		printInit(student1,"loopy",15,99);
		
		Student student2 = new Student();
		printInit(student2,"zoro",17,90);
		
		
		printStudent(student1);
		printStudent(student2);
	
		
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
