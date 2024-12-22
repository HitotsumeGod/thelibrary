public class Book {

	private String bookTitle;
	private String authorName;
	private long ISBN;
	private int numOfPages;
	
	public String getTitle() {
	
		return bookTitle;
	
	}
	
	public String getName() {
	
		return authorName;
	
	}
	
	public long getISBN() {
	
		return ISBN;
	
	}
	
	public int getLength() {
	
		return numOfPages;
	
	}
	
	public Book(String bT, String aN, long isbn, int nPages) {
	
		this.bookTitle = bT;
		this.authorName = aN;
		this.ISBN = isbn;
		this.numOfPages = nPages;
	
	}

}
