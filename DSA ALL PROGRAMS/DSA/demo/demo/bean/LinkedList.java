package com.demo.bean;

public class LinkedList			// Linked List Class
{
	private Node head;
	static int size = 0;
	
	class Node					// Linked List "has-a" Node class 
	{
		private String data;
		private Node next;
		
		public Node(String data)	// Node class constructor
		{
			this.data = data;
			this.next = null;
		}
	}
	public LinkedList()				// Linked List class constructor
	{
		this.head = null;
	}
	public void addNode(String data)		// Function to add a node at end;
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
//			System.out.println("The list is empty");
			head = newNode;
			size++;
//			System.out.println("New List has been made by adding First node");
		}
		else if(size==1)
		{
			head.next = newNode;
			size++;
//			System.out.println("New added succefully");
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			size++;
//			System.out.println("New added succefully");
		}
	}
	public void deleteNode()	// Function to delete a node from start;
	{
		if(head==null)
		{
//			System.out.println("The list is empty");
		}
		else if(size==1)
		{
			System.out.println(head.data+" deleted succefully");
			head = null;
			size--;
		}
		else
		{
			System.out.println(head.data+" deleted succefully");
			Node temp = head;
			head = temp.next;
			temp=null;
			size--;
		}
	}
	public static int getSize()		// Function to get a size of linked list;
	{
		return size;
	}
	public void displayList()		// Function to display all linked list;
	{
		Node temp = head;
		System.out.println();
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
