package array;

public class ArrayDi4 {

	public static void main(String[] args) {

		//2x3 2차원배열을 만든다.
		int [][] arr = new int[4][4];
		
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				arr[i][k] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				if(arr[i][k] < 10 ) {
					System.out.print(arr[i][k]+ "  ");
				}else {
				System.out.print(arr[i][k]+ " ");
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		// 만든 배열 출력하기
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[i].length; k++) {
				System.out.println((i + 1) + "행, " +(k + 1)+ "열의 값: " + arr[i][k] );
			}
			System.out.println(" ");
		}
	}
}
