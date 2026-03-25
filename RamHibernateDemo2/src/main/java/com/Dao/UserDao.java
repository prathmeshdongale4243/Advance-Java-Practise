package com.Dao;
import org.hibernate.*;
import java.util.*;

import com.utlity.*;
import com.Entity.*;

public class UserDao
{
	
	
	
	public  String insertData(Developer e)
	{
		Session ss=HBM.HBMConnection();
		Transaction tr=ss.beginTransaction();
		ss.save(e);
		tr.commit();
		return "Data Inserted Successfuly";
	}//insertData() End
	
	public  String insert5RowData(ArrayList<Developer> al)
	{
		Transaction tr=null;
		Session ss=null;
		try
		{
			 ss=HBM.HBMConnection();
			 tr=ss.beginTransaction();
			for(Developer d: al)
			{
				if(d.getName()==null || d.getName().isBlank())
				{
					throw new RuntimeException("Invalid Name");
				}

				ss.save(d);
			}
			tr.commit();
			return " 5 Row Data Inserted Successfuly ";
		}
		catch(Exception e)
		{
			if(tr!=null)
			{
				tr.rollback();
			}
			return "Transaction rolled back. No data inserted";
		}
		finally
		{
			if(ss!=null)
			{
				ss.close();
			}
		}
	}//insert5RowData()
	
	public Developer  displayGivenRowData(int id)
	{
		//get() method return class object in which store the database data 
		// if given id is not present then return "null"

		/*
		//load() method return class object in which store the database data 
		//if given id is not present then "get Exception"

		Developer d1=ss.load(Developer.class, 7);
		System.out.println(d1);
		
		d1=ss.load(Developer.class, 1);
		System.out.println(d1); //exception
		*/
		
		Session ss=HBM.HBMConnection();
		
		Developer d=ss.get(Developer.class,id);
		
		return d;
		
		
		
		
	}//End displayGivenRowData();
	
	public List<Developer> displayAllData()
	{
		// HQL=Hibernate Query Language
		// SQL=Structured Query Language
		
		
		Session ss=HBM.HBMConnection();
		List<Developer> al=ss.createQuery("from Developer").list();
		
		return al; 
		
	}
	
	public  String updateGivenRowData(int id)
	{
		Session ss=HBM.HBMConnection();
		Scanner sc=new Scanner(System.in);
		Developer du=ss.get(Developer.class, id);
		if(du!=null)
		{
			System.out.println("Enter Your Password");
			String pass=sc.nextLine();
			
			if(du.getPassword().equals(pass))
			{
				System.out.println("Your Information :-\n Name="+du.getName()+"\n Password = "+du.getPassword());
				
				
				System.out.println("Enter your new Name = ");
				String namen=sc.nextLine();
				
				System.out.println("Enter your new Password = ");
				String passn=sc.nextLine();
				
				Transaction tr=ss.beginTransaction();
				du.setName(namen);
				du.setPassword(passn);
				
				ss.update(du);
				
				tr.commit();
				
				return "Data Updated Successfully";
				
				
			
			}
			else
			{
				return "Your Password is wrong";
			}
				
			
		}
		else
		{
			return "Given id is not present";
		}
		
		
		
	}
	
	
	
	public  String deleteData(int id)
	{
		Session ss=HBM.HBMConnection();
		Transaction tr=ss.beginTransaction();
		
		Developer dd=ss.get(Developer.class, id);
		if(dd!=null)
		{
		ss.delete(dd);
		}
		else
		{
			return "Given id is not present";
		}
		tr.commit();
		
		
		return "data Deleted Successfully";
	}
	
	
	
	
	
}
