package array.ex;

public class ArrayEx1 {

	public static void main(String[] args) {


//		int student1 = 90;
//		int student2 = 80;
//		int student3 = 70;
//		int student4 = 60;
//		int student5 = 50;
//		
//		
//		int total = student1 + student2 + student3 + student4 + student5;
//		double average = (double) total / 5;
//		
//		System.out.println("점수 총합: " + total);
//		System.out.println("점수 평균: " + average);
		
		// 배열로 개선하기 
		int[] students = {90, 80, 70, 60, 50};
		
		
		int total = 0;
		
		
		for(int i = 0; i < students.length; i++) {
			total += students[i];
		}
		

		double average = (double) total / 5;
		
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average);
		System.out.println("");
		
		total = 0;

		
		// 향상된 for문 
		for(int student : students) {
			total += student;
		}
		
		double average1 = (double) total / 5;
		
		System.out.println("점수 총합: " + total);
		System.out.println("점수 평균: " + average1);
	}

}
