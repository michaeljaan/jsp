package in.com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;



import in.com.cg.pojo.Book;

public class BookDAO implements BookDAOImp{
	
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
		
	
	
	
	
	
	/*Set<Book> bookDO= new LinkedHashSet<>();
	
	public void add(Book book)
	{
		bookDO.add(book);
	}
	
	
	
	public void remove(String bookName)//function to remove movie
	{
		Predicate<Book> delbook = Book -> Book.getBookName().equals(bookName);//search for movie that must be deleted
		bookDO.removeIf(delbook);//remove that file
	}
	public void viewALL()//function to display
	{
		Consumer<Book> disp = Book -> System.out.println(Book);
		((Collection<Book>) bookDO).stream().forEach(disp);//display all elements of collection
	}	
*/


}
