package com.mkyong.common;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class App extends HttpServlet{
 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		
		HttpSession session = request.getSession(); //sessionCreated() is executed
		session.setAttribute("url", "mkyong.com"); 
		session.invalidate();  //sessionDestroyed() is executed
		  
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Spring Dependency Injection into Servlet Listenner</h1>");
		out.println("</body>");
		out.println("</html>");	
		
	
		
	}
}