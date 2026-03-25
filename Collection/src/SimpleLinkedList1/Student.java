package com.SimpleLinkedList1;

public class Student {
	
	int Rollno;
	String name;
	Student(int Rollno,String name){
		this.Rollno=Rollno;
		this.name=name;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student Name="+name+" Roll no="+Rollno;
		
	}
	

}
