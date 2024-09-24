package construct.ex;

public class BookMain {

	public static void main(String[] args) {
		
		Book book0 = new Book(); 
		book0.displayBookInfo();
		
		Book book1 = new Book("Hello Java", "kim", 500);
		book1.displayBookInfo();
		
		Book book2 = new Book("Hello JavaWorld", "park", 500);
		book2.displayBookInfo();
		
		Book book3 = new Book("Byrbye Java", "cho");
		book3.displayBookInfo();
		
		Book[] books = {book0, book1, book2, book3};
		
		for(Book b : books) {
			System.out.println("Book name: "+ b.title + ", author: " + b.author + ", page: " + b.page);
		}
		
		

	}

}
