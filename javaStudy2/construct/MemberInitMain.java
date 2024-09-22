package construct;

public class MemberInitMain {

	public static void main(String[] args) {
		
		MemberInit member1 = new MemberInit();
		member1.name = "user1";
		member1.age = 17;
		member1.grade = 80;
		
		MemberInit member2 = new MemberInit(); 
		member2.name = "user1";
		member2.age = 18;
		member2.grade = 90;
		
		
		MemberInit[] members = {member1, member2};
		
		for( MemberInit s : members) {
			System.out.println("멤버이름: " + s.name);
			System.out.println("멤버나이: " + s.age);
			System.out.println("멤버점수: " + s.grade);
		}
	}

}
