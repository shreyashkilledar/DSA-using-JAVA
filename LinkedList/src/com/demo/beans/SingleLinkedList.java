package com.demo.beans;

import org.w3c.dom.Node;

public class SingleLinkedList {
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
		Node newnode= new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node Lastnode=head;
			while(Lastnode.next!=null)
			{
				Lastnode=Lastnode.next;
			}
			Lastnode.next=newnode;
		}
	}
	
	//addByPosition
	public void addByPosition(int data, int pos)
	{
		Node newnode=new Node(data);
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
				System.out.println("Wrong position");
			}
		}
	}
	
	//deleteByValue
	public boolean deleteByValue(int val)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			if(head.data==val)
			{
				Node temp=head;
				head=head.next;
				temp.next=null;
				return true;
			}
			else
			{
				Node prev=head;
				Node curr=prev.next;
				while(curr!=null && curr.data!=val)
				{
					prev=prev.next;
					curr=curr.next;
				}
				if(curr!=null)
				{
					prev.next=curr.next;
					curr.next=null;
					curr=null;
					return true;
				}
				else
				{
					System.out.println(val+ " Not Found");
					return false;
				}
			}
		}
		return false;
	}
	
	
	//deleteByPosition
	public boolean deleteByPosition(int pos)
	{
		if(pos==1)
		{
			Node temp=head;
			head=head.next;
			temp.next=null;
			return true;
		}
		else
		{
			Node prev=head;
			Node curr= prev.next;
		    for(int i=1;curr!=null && i<=pos-2;i++)
		    {
		    	prev=prev.next;
		    	curr=curr.next;
		    }
		    if(curr!=null)
		    {
		    	prev.next=curr.next;
		    	curr.next=null;
		    	curr=null;
		    	return true;
		    }
		    else
		    {
		    	System.out.println(pos+" Position Wrong");
		    	return false;
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
