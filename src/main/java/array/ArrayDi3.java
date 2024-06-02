package array;

public class ArrayDi3 {

	public static void main(String[] args) {


//		//2x3 2차원배열을 만든다.
//		int[][] arr = new int [2][3]; // 행:2 열:3
//		
//		arr[0][0] = 1; // 0행 0열
//		arr[0][1] = 2; // 0행 1열
//		arr[0][2] = 3; // 0행 2열
//		arr[1][0] = 4; // 1행 0열
//		arr[1][1] = 5; // 1행 1열
//		arr[1][2] = 6; // 1행 2열
		
		//2x3 배열 생성
		int[][] arr = new int[][] {
			{1,2,3},
			{4,5,6}
		};
		
//		// 생성 초기화
//		int[][] arr =  {
//			{1,2,3},
//			{4,5,6}
//		};
		
	
		
		// 0행 출력
		System.out.print(arr[0][0] + " "); // 0열출력
		System.out.print(arr[0][1] + " "); // 0열출력
		System.out.print(arr[0][2] + " "); // 0열출력
		System.out.println(" ");
		
		// 1행 출력
		System.out.print(arr[1][0] + " "); // 1열출력
		System.out.print(arr[1][1] + " "); // 1열출력
		System.out.print(arr[1][2] + " "); // 1열출력
		System.out.println(" ");
		
	for(int i = 0;i < 2; i++) {
		for(int k = 0; k < 3 ;k++) {
			System.out.println((i + 1) + "행, " +(k + 1)+ "열의 값: " + arr[i][k] );
		}
	}
	System.out.println(" ");
	// length사용
	for(int i = 0; i < arr.length; i++) {
		for(int k = 0; k < arr[i].length;k++) {
			System.out.println((i + 1) + "행, " +(k + 1)+ "열의 값: " + arr[i][k] );
		}
		System.out.println(arr[i].length);
	}
	
	// arr.length는 행의 길이를 뜻한다. 여기서는 2가 출력된다.
	// {{},{}}를 생각해보면 arr배열은 {},{} 2개의 요서를 가진다.
	// arr[k].length는 열의 길이를 뜻한다. 여기서는 3이 출력된다.
	// arr[0]은 {1,2,3} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
	// arr[1]은 {4,5,6} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.

	}

}
