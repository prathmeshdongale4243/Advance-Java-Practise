package com.Entity;

public class User 
{
	int id;
	String name;
	String email;
	String password;
	String gender;
	String city;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String name, String email, String password, String gender, String city) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.city = city;
	}
	public int getId()
	{
		return id;
	}	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
}
