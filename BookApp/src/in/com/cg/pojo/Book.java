package in.com.cg.pojo;

public class Book {
	
	private int bookId;
	private String bookName;
	private String author;
	private int cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Book(int bookId, String bookName, String author, int cost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", cost=" + cost + "]";
	}
	
	

}
