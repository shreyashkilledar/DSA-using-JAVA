package com.demo.beans;

public class CircularLinkedList {
	
	private Node head;
		public class Node
		{
			private int data;
			private Node next;
			public Node(int data)
			{
				this.data=data;
				next=null;
			}
		}
	public CircularLinkedList()
	{
		head=null;
	}
	
	public void addByPosition(int pos, int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			newnode.next=head;
		}
		else
		{
			if(pos==1)
			{
				Node temp=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}
			else
			{
				Node temp=head;
				for(int i=1;temp.next!=head && i<=pos;i++)
				{
					temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next=newnode;
			}
		}
	}
	
	
	public void deletebyKey(int data)
	{
		Node prev=null;
		Node current=head;
		while(current.next!=head && current.data!=data)
		{
			prev=current;
			current=current.next;
		}
		if(current.data==data)
		{
			if(current==head)
			{
				Node temp=head;
				while(temp.next!=head)
				{
					temp=temp.next;
				}
				temp.next=current.next;
				current.next=null;
				current=null;
			}
			else
			{
				prev.next=current.next;
				current.next=null;
				current=null;
			}
			
		}
		
	}
	
	
	public void display()
	{
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

}
