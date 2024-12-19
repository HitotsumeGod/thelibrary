public class Book {

	private static String bookTitle;
	private static String authorName;
	private static int ISBN;
	private static int numOfPages;
	
	public String getTitle() {
	
		return bookTitle;
	
	}
	
	public String getName() {
	
		return authorName;
	
	}
	
	public int getISBN() {
	
		return ISBN;
	
	}
	
	public int getLength() {
	
		return numOfPages;
	
	}
	
	public Book(String bT, String aN, int isbn, int nPages) {
	
		this.bookTitle = bT;
		this.authorName = aN;
		this.ISBN = isbn;
		this.numOfPages = nPages;
	
	}

}
