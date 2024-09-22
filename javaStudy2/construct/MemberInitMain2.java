package construct;

public class MemberInitMain2 {

	public static void main(String[] args) {
		
		MemberInit member1 = new MemberInit(); 
		initMember(member1,"user1",18,90);
		MemberInit member2 = new MemberInit(); 
		initMember(member2,"user2",19,95);
		
		
		MemberInit[] members = {member1, member2};
		
		for( MemberInit s : members) {
			System.out.println("멤버이름: " + s.name);
			System.out.println("멤버나이: " + s.age);
			System.out.println("멤버점수: " + s.grade);
		}
	}
	
	static void initMember(MemberInit member, String name, int age, int grade ) {
		member.name = name;
		member.age = age;
		member.grade = grade;
	}

}
