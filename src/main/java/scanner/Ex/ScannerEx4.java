package scanner.Ex;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}

}
