package com.Dao;
import java.sql.*;
import com.Entity.*;
import com.utility.*;
import java.util.*;
public class UserDao 
{
	
	
	public boolean insertData(User user)
	{
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("insert into User(name,email,password,gender,city) values(?,?,?,?,?)");
			p.setString(1, user.getName());
			p.setString(2, user.getEmail());
			p.setString(3, user.getPassword());
			p.setString(4, user.getGender());
			p.setString(5,user.getCity());
			p.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		finally
		{
			try {
				p.close();
				con.close();
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		return true;
	}
	
	public boolean checkLogin(User user)
	{
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			String email=user.getEmail();
			String password=user.getPassword();
			p=con.prepareStatement("select * from User where email=?");
			p.setString(1, email);
			ResultSet rs=p.executeQuery();
			
			if(rs.next() && email.equals(rs.getString("email")) && password.equals(rs.getString("password")))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		finally
		{
			try
			{
				p.close();
				con.close();
			}
			catch(Exception e)
			{
				
				System.out.println(e.getMessage());		
			}
		}
	}
	public User displayRow1Data(User user)
	{
		Connection con=null;
		PreparedStatement p=null;
		User u=new User();
		try 
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from User where email=?");
			p.setString(1, user.getEmail());
			
			ResultSet rs=p.executeQuery();
			if(rs.next())
			{
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setGender(rs.getString("gender"));
				u.setCity(rs.getString("city"));
				return u;
				
			}
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				p.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	return u;
	}
	
	public ArrayList<User> displayData()
	{
		ArrayList<User> al=new ArrayList<>();
		Connection con=null;
		PreparedStatement p=null;
		try
		{
			con=DB.DBConnection();
			p=con.prepareStatement("select * from User");
			ResultSet rs=p.executeQuery();
			while(rs.next())
			{
				User u=new User();
				u.setName(rs.getString("name"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setCity(rs.getString("city"));
				u.setGender(rs.getString("gender"));
				al.add(u);
			}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				p.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		return al;
	}
	
	

}
