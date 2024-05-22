package array;

public class array {

	public static void main(String[] args) {
		
		int[] students; // 배열 변수 선언
		students = new int[5];  // 5개의 값을 넣을 수 있는 배열 생성
		
		//변수 값 대입
		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 50;
		
		// 변수 값 사용
		
		System.out.println("학생1의 점수: " + students[0]);
		System.out.println("학생2의 점수: " + students[1]);
		System.out.println("학생3의 점수: " + students[2]);
		System.out.println("학생4의 점수: " + students[3]);
		System.out.println("학생5의 점수: " + students[4]);
		
		
		
		
		// 배열의 참조값 보관
		// int[] students = new int[5]; // 배열 생성
		// int[] students = x001; 		// 2.new int[5]의 참고값 변환
		// students = x001 				// 3.최종 결과

	}

}
