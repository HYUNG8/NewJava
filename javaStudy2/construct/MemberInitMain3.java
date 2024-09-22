package construct;

public class MemberInitMain3 {

	public static void main(String[] args) {
		
		MemberInit member1 = new MemberInit(); 
		member1.initMember("user1",18,90);
	
		MemberInit member2 = new MemberInit(); 
		member2.initMember("user2",19,95);
		
		
		MemberInit[] members = {member1, member2};
		
		for( MemberInit s : members) {
			System.out.println("멤버이름: " + s.name);
			System.out.println("멤버나이: " + s.age);
			System.out.println("멤버점수: " + s.grade);
		}
	}

}

// this는 인스턴스 자신의 참조값이다.
// 매게변수의 이름과 멤버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야한다.
// this는 인스턴스 자신을 가리킨다.

// this의 생략
// this는 생략할 수 있다. 이 경우 변수를 찾을때 가까운 지역변수(매게변수도 지역변수이다.)를 먼저 찾고 
// 없으면 그다음으로 멤버 변수를 찾는다. 멤버변수도 없으면 오류가 발생한다.