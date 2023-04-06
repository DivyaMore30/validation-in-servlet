   package servletpractice7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet
{
	@Override
	   public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
		{
		String email=req.getParameter("email");
		String password= req.getParameter("password");
		
		if(email.equals("divya@gmail.com") && password.equals("divya@2000"))
		{
			
			System.out.println(email);
			System.out.println(password);
			RequestDispatcher rd=req.getRequestDispatcher("File2.html");
			rd.forward(req,res);
		}
		else
		{
			PrintWriter pw=res.getWriter();
			pw.write("invalid credentials");
			RequestDispatcher rd=req.getRequestDispatcher("File1.html");
			rd.include(req, res);
			res.setContentType("text/html");
			
		}
		
			
		}
	
}