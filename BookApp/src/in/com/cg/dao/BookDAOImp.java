package in.com.cg.dao;

import java.util.Collection;

import in.com.cg.pojo.Book;

public interface BookDAOImp {
	
	
	void addNew(Book book);
	public void deleteBook(String bookName);
	Collection<Book> viewAll();
	
}
