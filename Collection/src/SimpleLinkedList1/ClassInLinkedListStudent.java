package com.SimpleLinkedList1;
import java.util.*;
public class ClassInLinkedListStudent {
public static void main(String ar[]) {
	LinkedList<Student> ll=new LinkedList<>();
	ll.add(new Student(1,"Ram"));
	ll.add(new Student(2,"Om"));
	ll.add(new Student(3,"Hari"));
	ll.add(new Student(4,"Shyam"));
	System.out.println("By direct print:");
	System.out.println(ll);
	
	System.out.println("By loop print:");
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
    
	System.out.println("By direct using setter print:");
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i).getName());
		System.out.println(ll.get(i).getRollno());
	}
	System.out.println("By  using  List Iterator  print:\nForward");
 ListIterator<Student> lt=ll.listIterator();
 while(lt.hasNext()) {
	 System.out.println(lt.next());
	 
 }
 System.out.println("By Backward direction using list Iterator:");
 
 while(lt.hasPrevious()) {
	 System.out.println(lt.previous());
	 
	 
 }
 System.out.println("By using Iterator:");
Iterator<Student> it=ll.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
	}




}

}
