package com.Linked_List__Practise;
class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedList_Specific_Node_Deleted {
	public Node1 PrintList(Node1 head) {
		while(head!=null) {
			System.out.print(head.data);
			if(head.next!=null) {
				System.out.print("-->");	
			}
		head=head.next;
		}
	return head;
	}
	
	public Node1 Specific_Node_Delete(Node1 head,int pos) {
	if(pos==1) {
		head=head.next;
		return head;
	}
	Node1 temp=head;
	Node1 prev=null;
	for(int i=1;i<pos;i++) {
	prev=temp;
	temp=temp.next;
	}
	prev.next=temp.next;
	return head;
		
	}
public static void main(String[] ar) {
	Node1 head=new Node1(10);
	head.next=new Node1(20);
	head.next.next=new Node1(30);
	head.next.next.next=new Node1(40);
	head.next.next.next.next=new Node1(50);
	LinkedList_Specific_Node_Deleted ld=new LinkedList_Specific_Node_Deleted();
	ld.PrintList(head);
	System.out.println("\nPos 3 is deleted:");
	head=ld.Specific_Node_Delete(head,1);
	ld.PrintList(head);
}
	
}
