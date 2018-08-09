package in.com.cg.service;

import java.util.Collection;

import in.com.cg.pojo.Book;

public interface BookService {
	
	void addNew();
	public void deleteBook(String bookName);
	Collection<Book> viewAll();
}
