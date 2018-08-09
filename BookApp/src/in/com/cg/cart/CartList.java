package in.com.cg.cart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import in.com.cg.pojo.Book;

public class CartList implements CartInter{
	
	private Map<Integer, Book> bookdb = new HashMap<>();

	@Override
	public void addNew(Book book) {
		bookdb.put(book.getBookId(), book);	
	}

	@Override
	public void deleteBook(String bookName) {
		bookdb.remove(bookName);
		
	}

	@Override
	public Collection<Book> viewAll() {
		// TODO Auto-generated method stub
		return bookdb.values();
	}

}
