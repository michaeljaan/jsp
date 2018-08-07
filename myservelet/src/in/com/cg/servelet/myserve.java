package in.com.cg.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myserve")
public class myserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public myserve() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		String Firstname=request.getParameter("FirstName");
		String Lastname=request.getParameter("LastName");
		String Gender=request.getParameter("gender");
		String HighestQualification=request.getParameter("qualification");
		String DateOfBirth=request.getParameter("dob");
		String Hobbies=request.getParameter("hobbies");
		String Address=request.getParameter("address");
		String Skills=request.getParameter("skill");
		String emailAddress=request.getParameter("email");
		String website=request.getParameter("Website");
		String Contact=request.getParameter("contactnumber");

		
		out.println("<html><body>");
		
		out.println("<h5>FirstName: "+Firstname+"</h5>");
		out.println("LastName: "+Lastname);
		out.println("HighestQualification: "+HighestQualification);
		out.println("DateOfBirth: "+DateOfBirth);
		out.println("Hobbies: "+Hobbies);
		out.println("Address: "+Address);
		out.println("Skills: "+Skills);
		out.println("emailAddress: "+emailAddress);
		
		
		out.println("</html></body>");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
