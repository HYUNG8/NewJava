package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int maxProducts = 10;
		
		String[] productNames = new String[maxProducts];
		int[] productPrices = new int[maxProducts];
		
		int productCount = 0;
		
		
		
		while(true) {
			System.out.print("1.상품등록 2.상품목록 3.종료\n메뉴를 선택하세요: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			
			
			
				
			if(num == 1) {
				
				if(productCount >= maxProducts) {
					System.out.println("등록상품이 10개 이므로 더이상 상품을 등록할 수 없습니다.");
					continue;
				}
				
				System.out.print("상품명을 입력하세요: ");
				productNames[productCount] = scanner.nextLine();
				
				System.out.print("가격을 입력하세요: ");
				productPrices[productCount] = scanner.nextInt();
				
				productCount++;

			}else if(num == 2) {
				
				if(productCount == 0) {
					System.out.println("등록상품이 없습니다.");
					continue;
				}
				
				for(int i = 0; i < productCount; i++) {
					System.out.println("상품명: " + productNames[i]);
					System.out.println("가격: " + productPrices[i]);
				}
			
			}else if(num == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("옳바른 숫자를 입력해주세요.");
				System.out.println("");
			}
		}
	}

}
