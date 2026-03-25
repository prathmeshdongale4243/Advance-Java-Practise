package com.Linked_List__Practise;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}	
	
}
public class Search_An_Element_In_A_LinkedList {
    public static boolean searchElement(Node head,int find) {
    	Node temp=head;
    	while(head!=null) {
    		if(head.data==find) {
    			return true;
    		}
    		
    		head=head.next;
    	}
    	return false;
    }
	
	public static void printData(Node head) {
    	while(head!=null) {
    		System.out.print(head.data);
    		if(head.next!=null) {
    			System.out.print("-->");
    			
    		}
    	head=head.next;
    	
    	}
    	
    	
    } 
	
	
	public static void main(String ar[]) {
Node head=new Node(10);
head.next=new Node(20);
head.next.next=new Node(30);
head.next.next.next=new Node(40);
head.next.next.next.next=new Node(50);
printData(head);
System.out.println(searchElement(head,45));

}

	
}
