package com.dao;
import com.utility.*;
import com.entity.*;
import java.sql.*;

public class UserDao 
{
  static Connection con=DB.CreateDBcon();
  public static void createTable() 
  {
	  try 
	  {
		  PreparedStatement pst=con.prepareStatement("create table Practise2(id int auto_increment primary key, name varchar(100),password varchar(100)) "); 
		  pst.executeUpdate();  
		  System.out.println("Ram");
	  }
	  catch(Exception e) 
	  {
		 System.out.println(e.getMessage()); 
		  
	  }
	  
  }//create table end
  
  public  String  InsertData(User user) {
	  PreparedStatement pst=null;
	  try {
		 pst=con.prepareStatement("Insert into Practise2 values(?,?,?)"); 
		 pst.setInt(1,user.getId());
		 pst.setString(2,user.getName());
		 pst.setString(3,user.getPassword());
		 
		 pst.executeUpdate();
		 System.out.println("Ram");
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
		  String is=user.getName()+" Data inserted Unsuceccessfuly ";
		  return is;
	  }
	  finally {
		  try {
			con.close();
			pst.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  
	  }
	  
	  
	  
	  String is=user.getName()+" Data inserted Suceccessfuly ";
	  return is;
  }//insertData end
  
  public  void DisplayData() {
	  PreparedStatement pst=null;
	  try {
	   pst=con.prepareStatement("Select * from practise2");
	  ResultSet rs=pst.executeQuery();
	  while(rs.next()) {
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String password=rs.getString("password");
		

		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Password="+password);
		System.out.println("===================++===============");
		
	  }
	  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  finally {
		  try {
			con.close();
			pst.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  }
	  
	  
  }//Display Data
  public  String DeleteData(User user) {
	  PreparedStatement pst=null;
	  try {
	  pst=con.prepareStatement("delete from practise2 where id=?");
	  pst.setInt(1,user.getId());
	  pst.executeUpdate();
	  
	  }
	  catch(Exception e){
		  e.printStackTrace();
	  }
	  finally {
		  try {
			  con.close();
			  pst.close();
		  }
		  catch(Exception e){
			  
		  }
	  }
	  String s="Ram Ram, Data Deleted Suceccessfuly ";
	  return s;//eted Successfully";
  }
  
  public  static String Update(User user) {
	  try {
	  PreparedStatement pst=con.prepareStatement("update practise2 set name=?,password=? where id=?");
	  pst.setString(1,user.getName());
	  pst.setString(2, user.getPassword());
	  pst.setInt(3,user.getId());
	  pst.executeUpdate();
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
		  
	  }
	  finally {
		  try {
			con.close();
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  }
	  return "Ram Ram, Data Updated Successfully";
  }
  
  
  
  //public static void main(String ar[]) {
	  //createTable();
	  //User user=new User();
	  //user.setId(3);
	 //user.setName("Vithoba");
	//  user.setPassword("Ram@11");
	  //System.out.println(InsertData(user));//Insert Data
	 
	  //DisplayData();//Display Data
	  
	 //user.setId(3);
	 // System.out.println(DeleteData(user));//Delete Data
	  //DisplayData();
	// System.out.println(Update(user));
  //}
}
