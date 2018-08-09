package in.com.cg.cart;

import java.util.Collection;

import in.com.cg.pojo.Book;

public interface CartInter {
	
	void addNew(Book book);
	public void deleteBook(String bookName);
	Collection<Book> viewAll();
	

}
