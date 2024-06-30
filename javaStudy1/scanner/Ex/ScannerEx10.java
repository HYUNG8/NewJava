package scanner.Ex;

import java.util.Scanner;

public class ScannerEx10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int totalPrice = 0;
		
		while(true) {
			System.out.println("1:상품 입력, 2: 결제, 3: 프로그램 종료");
			
			int option = scanner.nextInt();
			scanner.nextLine();
			
			
			if (option == 1) {
				System.out.print("삼품을 입력하세요: ");
				String name = scanner.nextLine();
				
				System.out.print("가격을 입력하세요: ");
				int price = scanner.nextInt();
				
				System.out.print("수량을 입력하세요: ");
				int quantity = scanner.nextInt();
				
				totalPrice =  totalPrice + price * quantity;
				System.out.println("상품명: " + name + ", "+ "가격: " + price + "원, "+ "수량: " + quantity+ "개 " + "합계: " + price * quantity + "원");
				
			} else if (option == 2){
				
				System.out.println("총합계 : " + totalPrice );

				totalPrice = 0;
				
				
			}else if (option == 3){
				
				System.out.println("프로그램을 종료합니다.");
				break;
			
			} else {
				
				System.out.println("올바른 옵션을 선택해주세요.");
				
			}
		}
	}
}
