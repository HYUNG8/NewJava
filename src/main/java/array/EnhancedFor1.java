package array;

public class EnhancedFor1 {

	public static void main(String[] args) {
		
		int numbers[] = {1, 2, 3, 4, 5};
		
		// 일반 for문
		for (int i = 0; i < numbers.length; i++){
			int number = numbers[i];
			System.out.println(number);
		}
		System.out.println("");
		
		// 향상된 for문 , for-each문
		for(int number : numbers) {
			System.out.println(number);
		}
		
		// 두개의 for문은 같은 값을 출력한다.
		// 첫번째 for문은 배열 안의 index를 직접 설정하여 범위를 지정한다.
		// 두번째 for문은 지정한 배열을 무조건 처음부터 끝까지 탐색한다.
		// 어떤한 배열을 끝까지 돌릴 경우에 향상된 for문이 적합하다.
		
		//for-each문을 사용할 수 없는 경우, 증가하는 index 값이 필요할 때.
		for(int i = 0; i < numbers.length; i++ ) {
			System.out.println((i + 1) + "행, 의값은: " + numbers[i] );
		}
		
		//위와 같이 증가하는 index의 값이 직접적으로 필요한 경우에는 for-each문을 사용할 수 없다. 
		
		

	}

}
