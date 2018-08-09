package in.com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.cg.cart.CartList;
import in.com.cg.dao.BookDAO;
import in.com.cg.pojo.Book;
import in.com.cg.service.BookService;
import in.com.cg.service.BookServiceImpl;


@WebServlet("*.app")
public class bookServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public bookServe() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getServletPath();
		System.out.println(action);
		switch(action) {
		case "/addtocart.app":
			CartList cart=new CartList();
			String bookname=request.getParameter("bookName");
			int cost = Integer.parseInt(request.getParameter("txtId"));
			
			response.sendRedirect("Home.jsp");
			break;
			
		case "/cart.app":
			response.sendRedirect("cart.jsp");
			break;
		case "/refresh.app":
			BookService service= new BookServiceImpl();
			service.addNew();
			
			Collection<Book> book=service.viewAll();
			request.setAttribute("Book", book);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("Home.jsp");
			dispatcher.forward(request, response);
			break;
		}	
	}
				
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
