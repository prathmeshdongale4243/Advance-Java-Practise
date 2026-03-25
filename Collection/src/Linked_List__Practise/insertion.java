package com.Linked_List__Practise;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}

}
public class insertion 
{
	public static Node FirstPosition(Node head,int data)
	{
		Node newNode=new Node(data);
		newNode.next=head;
		return newNode;
	}
	public static void printn(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" -> ");
		    head=head.next;
		}
		
	}
	public static Node LastPosition(Node head,int data)
	{
		Node temp=head;
		Node newNode=new Node(data);
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=newNode;
		return temp;
	}
	public static void SpecificPosition(Node head,int pos,int data)
	{
		Node newNode=new Node(data);
		Node temp=head;
		if(pos==1)
		{
			ret
		}
	}
	public static void main(String[] args) 
	{
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		
		Node r =FirstPosition(head,5);
		printn(r);
		System.out.println();
		r=LastPosition(r,3);
		printn(r);
		System.out.println();
		
		
		
	}

}
