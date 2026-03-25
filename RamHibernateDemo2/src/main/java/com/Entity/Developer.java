package com.Entity;
import jakarta.persistence.*;

@Entity
public class Developer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	
	public Developer(String name,String password)
	{
		//this.id=id;
		this.name=name;
		this.password=password;
	}
	
	public Developer()
	{
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public String toString()
	{
		return "Student \n Id = "+id+",\n Name = "+name+", \n Password = "+password;
	}
}
