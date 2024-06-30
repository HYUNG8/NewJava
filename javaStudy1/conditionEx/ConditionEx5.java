package conditionEx;

public class ConditionEx5 {

	public static void main(String[] args) {
		
		String grade = "D";
		
		switch (grade) {
		
			case "A":
				System.out.println("탁월한 성과입니다.");
				break;
		
			case "B" :
				System.out.println("좋은 성과입니다.");
				break;
				
			case "C" : 
				System.out.println("준수한 성과입니다.");
				break;
				
			case "F" :
				System.out.println("불학격입니다.");
				break;
				
			default : 
				System.out.println("잘못된 성적입니다.");
				break;
		}

	}

}
