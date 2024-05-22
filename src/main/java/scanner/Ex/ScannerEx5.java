package scanner.Ex;

import java.util.Scanner;

public class ScannerEx5 {
	
	public static void main(String[] args) {
		
		//Scanner scanner = new Snanner(System.in);
		
		int a = 10;
		int b = 20;
		int temp;
		
		// Start
		temp = a; // 10
		a = b;
		b = temp;
		
		// End
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
