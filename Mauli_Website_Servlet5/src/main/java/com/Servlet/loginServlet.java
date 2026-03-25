package com.Servlet;

import com.Dao.*;
import com.Entity.*;
import jakarta.servlet.http.*;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;



@WebServlet("/login")
public class loginServlet extends HttpServlet
{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{ 
		UserDao d=new UserDao();
		User u=new User();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		u.setEmail(email);
		u.setPassword(password);
		boolean r=d.checkLogin(u);
		if(r)
		{
		req.setAttribute("msg", "<h3 style='color:green'>Login Successfully</h3>");
		 
		
		HttpSession session=req.getSession();
		session.setAttribute("email",email);      //email pass to homeservlete
		

		
		resp.sendRedirect("Home");
	
		}
		else
		{
			req.setAttribute("msg", "<h3 style='color:red'>Login Unsuccessfully</h3>");
			
		}
		
		
		
		
	}

}
