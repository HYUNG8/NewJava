package scanner;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.print("두번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫번째 입력숫자 " + num1 + "이 두번째 입력숫자 " + num2 + "보다 큽니다.");
		} else if (num1 < num2) {
			System.out.println("두번째 입력숫자 " + num2 + "이 첫번째 입력숫자 " + num1 + "보다 큽니다.");
		} else {
			System.out.println("첫번째 입력 숫자와 두번째 입력숫자 모두 " + num1 +"이므로 같습니다." );
		}
		

	}

}
