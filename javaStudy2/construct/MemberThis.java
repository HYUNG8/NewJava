package construct;

public class MemberThis {
	
	String nameField;
	
	void initMember(String nameParamater) {
		nameField = nameParamater;
		
		// nameField는 먼저 지역변수(매개변수)에서 같은 이름이 있는지 찾는다. 이 경우 없으므로 멤버 변수에서 찾는다.
		// nameParameter는 먼저 지역변수(매게변수)에서 같은 이름이 있는지 찾는다.이 경우 매게변수가 있으므로 매개변수를 사용한다.
		
		
		
		// this. nameField = nameParamater; 
		// this는 생략 될 수 있다.
	}
}
