package com.controller;
import com.service.*;
import com.entity.*;
public class UserController {
	UserService us=new UserService();
	public String InsertData(User user) {
		return us.InsertData(user);
	}

	public void DisplayData() {
		 us.DisplayData();
	}
	
	public String DeleteData(User user) {
		return us.DeleteData(user);
	}
	
	public String UpdateData(User user) {
		return us.UpdateData(user);
	}
	

	
	
}
