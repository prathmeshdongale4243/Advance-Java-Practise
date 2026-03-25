package com.service;
import java.util.*;
import com.entity.*;
import com.utility.*;
import com.dao.*;
import java.sql.*;

public class UserService 
{
	Connection con=DB.CreateDBcon();	
	UserDao ud=new UserDao();
	
	public String InsertData(User user)
	{
		return ud.InsertData(user);	
	}
	
	public void DisplayData()
	{
		 ud.DisplayData();		
	}
	
	public String DeleteData(User user) {
		
		int id=user.getId();
		try {
		PreparedStatement pst=con.prepareStatement("select 1 from Practise2 where id=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
			return ud.DeleteData(user);	
			
		}
		else {
			return "Id alredy not present in database";
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "Id alredy not present in database";
	}
	
	public String UpdateData(User user) {
		return ud.Update(user);
		
	}
	
	
	
	
	

}
