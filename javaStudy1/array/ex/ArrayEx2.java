package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5]; 
		
		System.out.println("다섯개의 정수를 입력하세요");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print((i+1) + "번 숫자를 입력하세요: ");
			
			numbers[i] = scanner.nextInt();
		}
		System.out.println("츨력");
		
		
		// 내가 짠 코드
//		String totalMassge = "";
//		
//		for(int i = 0; i < numbers.length; i++) {
//			if(i == numbers.length - 1) {
//				totalMassge += numbers[i];
//			}else {
//				totalMassge += numbers[i] + ", ";
//			}
//		}
//		System.out.println(totalMassge);
		
		// 강의 코드
		
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i]);
			
			if(i < numbers.length - 1) {
				System.out.print(", ");
			}
			
		}
		
		//System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4]);
	}

}
