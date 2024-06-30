package array;

public class ArrayDi2 {

	public static void main(String[] args) {


		//2x3 2차원배열을 만든다.
		int[][] arr = new int [2][3]; // 행:2 열:3
		
		arr[0][0] = 1; // 0행 0열
		arr[0][1] = 2; // 0행 1열
		arr[0][2] = 3; // 0행 2열
		arr[1][0] = 4; // 1행 0열
		arr[1][1] = 5; // 1행 1열
		arr[1][2] = 6; // 1행 2열
		
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
	}

}
