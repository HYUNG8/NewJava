package conditionEx;

public class ConditionEx4 {

	public static void main(String[] args) {
		
		double score = 9.8;
		
		if (score <= 9) {
			System.out.println("'어바웃타임'을 추천합니다.");
		}
		if (score <= 8) {
			System.out.println("'토이 스토리'을 추천합니다.");
		}
		if (score <= 7) {
			System.out.println("'고질라'를 추천합니다.");
		}
	}

}
