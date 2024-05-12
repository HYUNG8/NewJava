package loop;

public class For1 {

	public static void main(String[] args) {
		
		
		// For
		// for문은 주로 반복 횟수가 정해져 있을 경우 사용한다.
		// for (초기식; 조건식; 증감식){}
		
		for (int i = 0; i <= 10; i++ ) {
		
			System.out.println("i는 " + i );
			
		}
	
		int endNum = 10;
		int sum = 0;
		
		for(int i = 1; i <= endNum; i++) {
			sum = sum + i;
			System.out.println("i는 " + i + ", sum은 " + sum);
		}
		
		
		// for VS while
		// for문은 초기화, 조건검사, 반복 후 작업등이 규칙적으로 한 줄에 모두 들어있다.
		// 특히, 반복을 위해 값이 증가하는 카운터 변수를 다른 부분과 명확하게 구분할 수 있다.
		// 그렇기 때문에, 개발자는 루프 횟수와 관련된 코드와 나머지 코드를 명확하게 구분할 수 있다.
	
	}
}
