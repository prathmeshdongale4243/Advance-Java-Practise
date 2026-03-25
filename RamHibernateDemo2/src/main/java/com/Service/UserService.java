package com.Service;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

import com.Entity.*;
import com.Dao.*;


public class UserService 
{
	UserDao d=new UserDao();
	public  String insertData(Developer e)
	{
		return d.insertData(e);
	}
    
	public  String insert5RowData(ArrayList<Developer> al)
	{
		return d.insert5RowData(al);
	}
	
	public  Developer  displayGivenRowData(int id)
	{
		return d.displayGivenRowData(id);
	}
		
	public List<Developer> displayAllData()
	{
	   return d.displayAllData();	 
	}
	
	public  String updateGivenRowData(int id)
	{
		return d.updateGivenRowData(id);
	}
	
	public  String deleteData(int id)
	{
		return d.deleteData(id);
	}
}
