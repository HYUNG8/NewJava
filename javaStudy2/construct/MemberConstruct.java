package construct;

public class MemberConstruct {

	String name;
	int age;
	int grade;
	
	MemberConstruct(String name, int age, int grade){
		
		System.out.println("생성자호출 name: " + name + " 나이: " + age + " 점수: " + grade);
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}

// 생성자와 메서드의 차이.
// 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫글자의 이름이 대문자로 시작한다.
// 생성자는 반환 타입이 없다.

