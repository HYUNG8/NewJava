package class1;

public class classStudy2 {

	public static void main(String[] args) {
		
		
		// classStudy1의 리펙토링
		String[] name = {"학생1", "학생2", "학생3"};
		int[] age = {15, 16, 16};
		int[] grade = {90, 80, 100};
		
		for( int i=0; i < name.length; i++) {
			
			System.out.println("이름: " + name[i] + " 나이: " + age[i] + " 성적: " + grade[i]);
		}
	
	}
		
	
	// 배열 사용의 한계
	// 한 학생의 데이터가 3개의 배열로 나누어져 있기 때문에 데이터를 변경할 때 매우 조심해야한다.
	// 예를들어, 학생2의 데이터를 제거하거나 변경할 경우, 각각의 배열의 학생2의 요소를 정확히 찾아내여 각각 제거해야한다.
	
	
	// 위처럼 이름,나이,성적을 각각 따로 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
	// 사람이 관리하기 좋은 방식은 학생이란 개념을 하나로 묶는 것이다. 그리고 각각의 학생 별로 이름,나이,성적을 관리하는 것이다.
	
}
