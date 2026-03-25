package com.Returnype;
import java.util.*;
public class App {
	//User[] getUsers() {
		//User user1=new User(1,"Ram","Ram@gmail.com","Ram@11");
		//User user2=new User(2,"Sita","Sita@gmail.com","Sita@11");
		//User user3=new User(3,"Om","Om@gmail.com","Om@11");
		//User user4=new User(4,"Shyam","Shyam@gmail.com","Shyam@11");
	    
		
		//User users[]=new User[4];
		//users[0]=user1;
		//users[1]=user2;
		//users[2]=user3;
		//users[3]=user4;
		
		//return users;
	
	
	//}

   public User[] getUserFromUser() {
		User users[]=new User[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<users.length;i++) {
			users[i]=new User();			
			System.out.println("Enter Id");
			users[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Name");
			users[i].setName(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter Email");
			users[i].setEmail(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter Password");
			users[i].setPassword(sc.nextLine());
			
			
		}
		return users;
   }
	
	public static void main(String[] ar) {
		
		App a=new App();
		//User[] users=a.getUsers();
		//for(int i=0;i<users.length;i++) {
			
			//System.out.println("Id="+users[i].getId());
			//System.out.println("Name="+users[i].getName());
			//System.out.println("Email="+users[i].getEmail());
			//System.out.println("Password="+users[i].getPassword());
			//System.out.println("==============++===============");
		//}
		User[] users2=a.getUserFromUser();
        for(int i=0;i<users2.length;i++) {
			
			System.out.println("Id="+users2[i].getId());
			System.out.println("Name="+users2[i].getName());
			System.out.println("Email="+users2[i].getEmail());
			System.out.println("Password="+users2[i].getPassword());
			System.out.println("==============++===============");
		}
	}

}
