package com.ArrayListPassInterface;

public class Ram implements Test {
	int id;
	String name;
	Ram(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
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
public String toString() {
	return "Users Id="+id+" Name="+name;
}
}
