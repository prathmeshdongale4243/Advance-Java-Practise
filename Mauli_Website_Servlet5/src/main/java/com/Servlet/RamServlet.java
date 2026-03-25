package com.Servlet;
import java.io.IOException;
import com.Entity.*;
import com.Dao.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/save")
public class RamServlet extends HttpServlet
{

	@Override
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String name=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		
		UserDao d=new UserDao();
		User u=new User();
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setGender(gender);
		u.setCity(city);
		
		boolean r=d.insertData(u);
		
		resp.setContentType("text/html");
		
		if(r)
		{
		req.setAttribute("msg", "<h3 style='color:green'>Register Successfully</h3>");
		resp.sendRedirect("login.jsp");
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red'>Register Unuccessfully</h3>");
			req.getRequestDispatcher("Ram_Form2.jsp").forward(req, resp);
		}
		
		
        
	
		
	
	}

}
