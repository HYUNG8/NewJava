package class1.ex;

public class MoviewReiviewMain2 {

	public static void main(String[] args) {
		
		MovieReview[] movies = new MovieReview[2];
		
		
		MovieReview movie1 = new MovieReview();
		movie1.title = "첫번째 영화"; 
		movie1.review = "재밌다."; 
		movies[0] = movie1;
		
		
		MovieReview movie2 = new MovieReview();
		movie2.title = "두번째 영화"; 
		movie2.review = "더 재밌다."; 
		movies[1] = movie2;
		
		
		
		for(MovieReview movie :movies) {
			
			System.out.println("영화제목: " + movie.title + ", 리뷰: " + movie.review);
		}
		
		
	}

}
