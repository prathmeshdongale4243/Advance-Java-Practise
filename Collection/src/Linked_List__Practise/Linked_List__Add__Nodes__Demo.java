package com.Linked_List__Practise;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int New_data){
		this.data=New_data;
		this.next=null;
	}
	
}
public class Linked_List__Add__Nodes__Demo {
	public void traverse(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
		
		if(head.next!=null) {
			System.out.print("-> ");
		}
		head=head.next;
	}
		}
	public Node insertAtFirstPosition(Node head,int value) {
		//int value=100;
		Node newNode=new Node(value);
		newNode.next=head;
		return newNode;
	}
	public Node insertAtLastPosition(Node head,int value) {
		Node lastNode=new Node(value);
		if(head==null) {
			return  lastNode;
		}
		Node last=head;
		while(last.next!=null) {
			
				
			last=last.next;
		}
		
		last.next=lastNode;
	
		return head;
	}
	
	public Node insertAtSpecificPosition(Node head,int pos,int value) {
		Node newNode=new Node(value);
		Node last=head;
		if(pos<1) 
		{
			return head;
		}
		else if(pos==1)
		{
			newNode.next=head;
			return newNode;
			
		}		
		else
		{
			
			for(int i=1;i<pos-1 && last !=null;i++)
			{
				last=last.next;
			}
				if(last==null) {
				System.out.println("Entered index out of position of Linkedlist");	
				return head;
			}
				
			newNode.next=last.next;
			
			last.next=newNode;
			return head;
				
				
		}
		
		
	}
	
	
public static void main(String[] ar) {
    Scanner sc=new Scanner(System.in);
	Linked_List__Add__Nodes__Demo lld=new Linked_List__Add__Nodes__Demo();
	Node head=new Node(10);
	head.next=new Node(20);
	head.next.next=new Node(30);
	head.next.next.next=new Node(40);
	
	lld.traverse(head);
	System.out.println("\nAdd data at first Position:\nSo,Enter value:-");
	int value=sc.nextInt();
	head=lld.insertAtFirstPosition(head,value);
	
	lld.traverse(head);
	
	System.out.println("\nAdd data at last Position:\nSo,Enter value:-");
	 value=sc.nextInt();
	head=lld.insertAtLastPosition(head,value);
	lld.traverse(head);
	System.out.println("Enter Position:");
	int pos=sc.nextInt();
	
	System.out.println("Enter Value(Data) of node:");
	value=sc.nextInt();
	lld.insertAtSpecificPosition(head, pos, value);
	
	lld.traverse(head);
	
	
	
}
}
