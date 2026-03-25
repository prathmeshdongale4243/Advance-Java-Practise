package com.Linked_List__Practise;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
} 
public class Linked_List_LastNode__Deleted {
	public void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data);
			if(head.next!=null) {
				System.out.print("-->");	
				
			}
		head=head.next;
		}	
	}
public Node DeleteLastNode(Node head) {
	if(head==null) {
		return null;
		
	}
	if(head.next==null) {
		return null;
		
	}
	Node temp=head;
	while(temp.next.next!=null) {
        temp=temp.next;
		
	}
	temp.next=null;
	return head;
	
	
	
	
}
	
	
	
	public static void main(String[] ar) {
		Linked_List_LastNode__Deleted ld=new Linked_List_LastNode__Deleted();
		Node head=new Node(10);
		head.next=new Node(20);
		head.next.next=new Node(30);
		head.next.next.next=new Node(40);
		head.next.next.next.next=new Node(50);
		ld.printList(head);
		ld.DeleteLastNode(head);
		System.out.println("\nLast node deleted");
		ld.printList(head);
		
	}
	
	
	
	
	
	

}
