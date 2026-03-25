package com.app;
import com.controller.*;
import com.entity.*;
import java.util.*;
public class Main {
	public static void main(String[] ar) {
		UserController uc=new UserController();
		Scanner sc=new Scanner(System.in);
		
		
		User user=new User();
		boolean co=true;
		while(co) {
		System.out.println("Enter Your Choice:\n1.Insert Data\n2.Display Data \n3.Update Data \n4.Delete Data \n5Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name=sc.nextLine();
			
			System.out.println("Enter Password");
			String password=sc.nextLine();
			
			user.setId(id);
			user.setName(name);
			user.setPassword(password);
			
			System.out.println(uc.InsertData(user));
			break;
			
		}		
		case 2:
		{
			
			uc.DisplayData();
			break;
			
		}
		case 3:
		{
			int id;
			String password;
		
		
				
			System.out.println("Enter Id");
			 id=sc.nextInt();
			 sc.nextLine();
		
			System.out.println("Enter New Name");
			 String n=sc.nextLine();
			 
			
			
			 
			System.out.println("Enter New Password");
			password=sc.nextLine();
			
				 user.setId(id);
				 user.setName(n);
				  user.setPassword(password);
				  System.out.println("name="+n);
				 System.out.println(uc.UpdateData(user));
		
			break;
			
		}
		case 4:{
			
			System.out.println("Enter Id which are deleted");
			int id=sc.nextInt();
			
			user.setId(id);
			System.out.println(uc.DeleteData(user));
			break;
		}
		case 5:
			co=false;
			break;
		default:{
			System.out.println("Please,  Enter Correct Choice");
			
		}
		
		}//switch
		}//while end
	}

}
