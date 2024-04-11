package condition;

public class if2 {

	public static void main(String[] args) {
		
		
		//if문만 사용할 경우 단점: 이미 조건을 만족해도 불필요한 다음 조건을 계속 검사한다. 
		
		//else if
		//특정 조건이 만족하면 코드를 실행하고 if문 전체를 빠져나온다. 특정 조건이 만족하지 않으면 다음 조건을 검사한다.
		//여기서 핵심은 순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개 실행이 되는 것이다.
		int age = 13;
//		
		
		//조건을 중복체크한 코드
//		if (age <= 7) {
//			System.out.println("미취학");
//		} else if (8 <= age && age  <= 13) {
//			System.out.println("초등학생");
//		} else if (14 <= age && age  <= 16) {
//			System.out.println("중학생");
//		} else if (17 <= age && age  <= 19) {
//			System.out.println("고등학생");
//		} else {
//			System.out.println("성인");
//		}
		
		
		
		if (age <= 7) {
			System.out.println("미취학");
		} else if (age <= 13) {
			System.out.println("초등학생");
		} else if (age <= 16) {
			System.out.println("중학생");
		} else if (age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}
}
