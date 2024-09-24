package construct;

public class ContstructMain2 {

	public static void main(String[] args) {
		
		MemberConstruct2 member1 = new MemberConstruct2("user1",19,90);
		MemberConstruct2 member2 = new MemberConstruct2("user2",18);
		
		MemberConstruct2[] members = {member1, member2};
		
		for( MemberConstruct2 s : members) {
			System.out.println("멤버이름: " + s.name + " 멤버나이: " + s.age + " 멤버점수: " + s.grade);
		}

	}

}

