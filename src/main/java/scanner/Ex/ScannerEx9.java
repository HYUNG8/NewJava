package scanner.Ex;

import java.util.Scanner;

public class ScannerEx9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		int num = 0;
	
//		while(true) {
//			
//			System.out.print("숫자를 입력하세요. (입력을 중단하려면 -1을 입력하세요.): ");
//			int num = scanner.nextInt(); 
//			
//			
//			if(num == -1) {
//				break;
//			}
//			count++;
//			sum += num; 
//		}
		
		//축약
		while((num = scanner.nextInt()) != -1) {
			count++;
			sum += num;
		}
		
		
		
		double average = (double) sum / count; 
		
		System.out.println("입력한 숫자들의 합계: " + sum);
		System.out.println("입력한 숫자들의 평균: " + average);

	}

}
