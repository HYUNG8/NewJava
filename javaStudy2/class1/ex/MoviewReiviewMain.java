package class1.ex;

public class MoviewReiviewMain {

	public static void main(String[] args) {
		
		MovieReview movie1 = new MovieReview();
		movie1.title = "첫번째 영화"; 
		movie1.review = "재밌다."; 
		
		
		MovieReview movie2 = new MovieReview();
		movie2.title = "두번째 영화"; 
		movie2.review = "더 재밌다."; 
		
		System.out.println("영화제목: " + movie1.title + ", 리뷰: " + movie1.review);
		System.out.println("영화제목: " + movie2.title + ", 리뷰: " + movie2.review);
		
		
		

	}

}
