package construct;

public class ContstructMain1 {

	public static void main(String[] args) {
		
		MemberConstruct member1 = new MemberConstruct("user1",19,90);
		MemberConstruct member2 = new MemberConstruct("user2",18,70);
		
		MemberConstruct[] members = {member1, member2};
		
		for( MemberConstruct s : members) {
			System.out.println("멤버이름: " + s.name + " 멤버나이: " + s.age + " 멤버점수: " + s.grade);
		}

	}

}

// 생성자호출
// new 키워드를 사용해서 객체를 생성할 때 마지막 괄로 ()도 포함해야하는 이유가 바로 생성자 때문이다.
// 객체를 생성하면서 동시에 생성자를 호출하한든 의도를 포함한다.

// 생성자 장점
// 중복 호출 제거
// 생성자가 없던 시정에는 생성 직후에 어떤 작업을 수행하기 위해 다음과 같이 메서드를 직법 한번 더 호출해야 했다.
// 생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.


// 무조건 초기값을 세팅해야하는 경우. 입력을 강제할 수 있다.
// 객체를 생성할 때, 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야한다.
// 직접 정의한 생성자를 호출하지 않으면 컴파일 오류가 발생한다. - 제약

// 참고로 생성자를 메서드 오버로딩 처럼 여러개 정의할 수 있는데, 이 경우에는 하나만 호출하면된다.