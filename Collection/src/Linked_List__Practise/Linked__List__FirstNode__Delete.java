package com.Linked_List__Practise;
class Node2{
	int data;
	Node2 next;
	Node2(int new_Data){
   this.data=new_Data;
   this.next=null;
	}
}



public class Linked__List__FirstNode__Delete {

public Node2 deleteHead(Node2 head) {
	if(head==null) {
		return null;
	}
	Node2 temp=head;
	 head=head.next;
	 temp=null;
	
	
	
	return head;
}	
	
	public void PrintList(Node2 head) {
	    Node2 tamp=head;
	    while(tamp!=null) {
	    	System.out.print(tamp.data);
	        if(tamp.next!=null) {
	        	System.out.print("-->");
	        }
	        tamp=tamp.next;
	        
	    }
	    System.out.println();
	}
	
	public static void main(String[] ar) {
		
		Linked__List__FirstNode__Delete m=new Linked__List__FirstNode__Delete();
		Node2 head=new Node2(10);
		head.next=new Node2(20);
		head.next.next=new Node2(30);
		m.PrintList(head);
		head=m.deleteHead(head);
		m.PrintList(head);
		
		
	}
	
	
}
