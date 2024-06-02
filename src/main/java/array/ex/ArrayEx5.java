package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numbers = new int[5]; 
		
		int total = 0;
		
		System.out.println("다섯개의 정수를 입력하세요");
		for(int i = 0; i < numbers.length; i++) {
			
			System.out.print((i+1) + "번 숫자를 입력하세요: ");
			numbers[i] = scanner.nextInt();
			
			total += numbers[i];
		
		}
		
		double average = (double) total / numbers.length;
		
		System.out.println("입력한 정수의 합계 : " + total);
		System.out.println("입력한 정수의 평균 : " + average);
		
	}

}
