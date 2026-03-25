package com.Servlet;

import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;
import com.Entity.*;
import com.Dao.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/Home")
public class HomeServlet extends HttpServlet{
	
	@Override
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		HttpSession session=req.getSession(false);
		String email=(String) session.getAttribute("email");
		
		resp.setContentType("text/html");
		
		User u1 =new User();
		u1.setEmail(email);
		UserDao d=new UserDao();
		User u=d.displayRow1Data(u1);
		
		if(u==null)
		{
			System.out.println("null");
		}	
		req.setAttribute("user", u);
	
		req.getRequestDispatcher("Home.jsp").forward(req, resp); 
		
	}

}
