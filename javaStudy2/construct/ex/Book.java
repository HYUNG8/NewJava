package construct.ex;

public class Book {
	String title;
	String author;
	int page;
	
	Book(){
		this("","", 0);
	}
	
	Book(String title, String author){
		this(title,author,300);
	}
	
	Book(String title, String author, int page){
		
		this.title = title;
		this.author = author;
		this.page = page;
		
	}
	
	void displayBookInfo() {
		
		System.out.println("Book name: "+ title + " author: " + author + " page: " + page);
		
	}
	
}
