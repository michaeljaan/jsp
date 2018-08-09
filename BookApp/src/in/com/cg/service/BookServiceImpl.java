package in.com.cg.service;

import java.util.Collection;

import in.com.cg.dao.BookDAO;
import in.com.cg.pojo.Book;

public class BookServiceImpl implements BookService
{
	private BookDAO dao=new BookDAO();

	@Override
	public void addNew() {
		dao.addNew(new Book(100,"Jaan","Mike",250));
		dao.addNew(new Book(101,"Jaana","Mikei",350));
		dao.addNew(new Book(102,"Jaanb","Mikea",450));
		dao.addNew(new Book(103,"Jaanc","Mikeu",550));
		dao.addNew(new Book(104,"Jaand","Mikeo",650));
		dao.addNew(new Book(105,"Jaane","Mikey",150));
		dao.addNew(new Book(106,"Jaanf","Miker",450));
	}

	

	@Override
	public Collection<Book> viewAll() {
		// TODO Auto-generated method stub
		return dao.viewAll();
	}



	@Override
	public void deleteBook(String bookName) {
		dao.deleteBook(bookName);
		
	}

}
