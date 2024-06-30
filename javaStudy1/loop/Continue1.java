package loop;

public class Continue1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i =1;
		
		while(i <= 5) {
			
			if (i == 3) {
				i++;
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}

	}

}
