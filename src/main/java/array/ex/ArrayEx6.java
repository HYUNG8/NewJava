package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력받을 숫자의 개수를 입력하세요");
		int n = scanner.nextInt();
		
		int[] num = new int[n];
		int miniNum , maxNum;
		
		
		System.out.println(n + "개의 정수를 입력하세요");
		for(int i = 0; i < n; i++) {
			
			System.out.print((i+1) + "번 숫자를 입력하세요: ");
			num[i]= scanner.nextInt();	
		
		}
		
		miniNum = maxNum = num[0];
		
		for (int i = 1; i < n; i++) {
			if(miniNum < num[i]) {
				miniNum = num[i];
			}
		
			if(maxNum < num[i]) {
				maxNum = num[i];
			}
		}

		
		System.out.println("가장 작은 정수는 : " + miniNum);
		System.out.println("가장 큰은 정수는 : " + maxNum);

	}

}
