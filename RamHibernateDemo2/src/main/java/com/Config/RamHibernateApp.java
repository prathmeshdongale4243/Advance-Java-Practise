package com.Config;

import org.hibernate.cfg.Configuration;

import com.Controller.*;
import com.Entity.*;

import java.util.*;

import org.hibernate.*;


public class RamHibernateApp 
{
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		UserController c=new UserController();
		
		System.out.println("Enter your choice = \n 1.Insert Data \t\t 2.Insert 5 Row data \n 3.Display All Data \t 4.Display Single Row \n 5.Delete Row \t\t 6.Update Row");
		int ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
		case 1:
			Developer e1=new Developer();
			System.out.println("Enter your Name");
			String name1=sc.nextLine();
			
			System.out.println("Enter your Password");
			String pass1=sc.nextLine();
			e1.setName(name1);
			e1.setPassword(pass1);
			System.out.println(c.insertData(e1));
			break;
			
		case 2:
			ArrayList<Developer> al=new ArrayList<>();
			for(int i=1;i<=5;i++)
			{
				Developer d=new Developer();
				System.out.println(i+"Enter Name and Password \n Name = ");
				String name=sc.nextLine();
				d.setName(name);
				
				System.out.println(" Password = ");
				String pass=sc.nextLine();
				d.setPassword(pass);
				
				al.add(d);
				
				
			}
			System.out.println(c.insert5RowData(al));
			break;
			
		case 3:
			List<Developer> al3=c.displayAllData();
			if(al3.isEmpty())
			{
				System.out.println("Data set is Empty");
			}
			else
			{
				for(Developer d:al3)
				{
					System.out.println("Developer \n Id =\t\t"+d.getId()+", \n Name =\t\t"+d.getName()+", \n Password =\t"+d.getPassword()+".");
				}
				
			}
			break;
			
		case 4:
			System.out.println("Enter a Id for print");
			int id4=sc.nextInt();
			sc.nextLine();
			Developer d4=c.displayGivenRowData(id4);
			if(d4!=null)
			{
				System.out.println("Developer \n Name = "+d4.getName()+", \n Password = "+d4.getPassword());
			}
			else
			{
				System.out.println("Given id is not Present");
			}
			break;
			
		case 5:
			System.out.println("Enter a Id for delete");
			int id5=sc.nextInt();
			sc.nextLine();
			Developer d5=c.displayGivenRowData(id5);
			if(d5!=null)
			{
				System.out.println(d5);
				System.out.println("Are You Want to delete this data ? \nif Yes=1 else No=0");
				int chd=sc.nextInt();
				sc.nextLine();
				if(chd==1)
				{
					System.out.println(c.deleteData(id5));
				}
				else
				{
					System.out.println("Ok...");
				}
			}
			else
			{
				System.out.println("Given id is not Present");
			}
			break;
			
		case 6:
			System.out.println("Enter a Id for update");
			int id6=sc.nextInt();
			sc.nextLine();
			System.out.println(c.updateGivenRowData(id6));
			break;
			
		default:
			System.out.println("Your choice is wrong");
			
		} //switch end
		
		
	
		
		
	} //main

}//class
