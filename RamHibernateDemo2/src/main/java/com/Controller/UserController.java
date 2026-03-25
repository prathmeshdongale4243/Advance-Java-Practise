package com.Controller;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import com.Dao.UserDao;
import com.Entity.*;
import com.Service.*;

public class UserController 
{
	UserService s=new UserService();
	public  String insertData(Developer e)
	{
		return s.insertData(e);
	}
	public  String insert5RowData(ArrayList<Developer> al)
	{
		return s.insert5RowData(al);
	}
	
	public  Developer displayGivenRowData(int id)
	{
		return s.displayGivenRowData(id);
	}

	public List<Developer> displayAllData()
	{
		   return s.displayAllData();	 
   	}
	
	public  String updateGivenRowData(int id)
	{
		return s.updateGivenRowData(id);
	}
	
	public  String deleteData(int id)
	{
		return s.deleteData(id);
	}
	
	
	
}
