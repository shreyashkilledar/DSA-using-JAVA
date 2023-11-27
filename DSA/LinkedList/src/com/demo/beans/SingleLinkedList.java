package com.demo.beans;


public class SingleLinkedList
 {
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
	 public SingleLinkedList()
	 {
		head=null;
	 }
	 
	 	//addFirst
	 	public void addFirst(int data)
	 	{
	 		Node newnode= new Node(data);
	 		newnode.next=head;
	 		head=newnode;
	 	}
	 	
	 	//addLast
	 	public void addLast(int data)
	 	{
	 		Node newnode=new Node(data);
	 		if(head==null)
	 		{
	 			head=newnode;
	 		}
	 		else
	 		{
	 			Node lastnode=head;
	 			while(lastnode.next!=null)
	 			{
	 				lastnode=lastnode.next;
	 			}
	 			lastnode.next=newnode;
	 		}
	 	}
	 	
	 	//addByPosition
	 	public void addByPosition(int pos, int data)
		{
			Node newnode= new Node(data);
			if(head==null && pos!=1) 
			{
				System.out.println("List is Empty");
			}
			if(pos==1)
			{
				if(head==null)
				{
					head=newnode;
				}
				else
				{
					newnode.next=head;
					head=newnode;
				}
			}
			else
			{
				Node prev=head;
				for(int i=1;prev!=null && i<=pos-2;i++)
				{
					prev=prev.next;
				}
				if(prev!=null)
				{
					newnode.next=prev.next;
					prev.next=newnode;
				}
				else
				{
					System.out.println("Wrong Position");
				}
			}
		}
	 	
	 	//display
	 	public void display()
	 	{
	 		Node currnode=head;
	 		while(currnode!=null)
	 		{
	 			System.out.println(currnode.data);
	 			currnode=currnode.next;
	 		}
	 		System.out.println("null");
	 	}
 }

