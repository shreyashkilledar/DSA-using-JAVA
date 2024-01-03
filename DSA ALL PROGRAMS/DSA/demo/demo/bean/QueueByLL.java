package com.demo.bean;

public class QueueByLL			// Queue Class
{
	private int front;
	private int rear;
	private int size;
	private LinkedList list;
	
	public QueueByLL()			// Queue Class constructor
	{
		this.front = -1;
		this.rear = -1;
		this.size = 0;
		this.list = new LinkedList();
	}
	public boolean isEmpty()		// Function to check empty queue
	{
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}
	public boolean isFull()		// Function to check full queue
	{
		this.size = LinkedList.getSize();
		if(front==0 && this.size==10)
			return true;
		else
			return false;
	}
	public void enqueue(String data)	// Function to add element at end
	{
		if(isEmpty())
		{
			System.out.println("The Queue is Empty");
			list.addNode(data);
			front++;
			rear++;
			System.out.println("The Queue is created by adding first element");
		}
		else
		{
			if(isFull())
			{
				System.out.println("The Queue is Full");
			}
			else
			{
				list.addNode(data);
				rear++;
				System.out.println(data+" is added");
			}
		}
	}
	public void dequeue()		// Function to delete element from front
	{
		if(isEmpty())
		{
			System.out.println("The Queue is Empty");
		}
		else
		{
			list.deleteNode();
			rear--;
		}
		if(LinkedList.getSize()==0)
		{
			front = -1;
			rear = -1;
		}
	}
	public void sizeOfQueue()		// Function to get a size of Queue;
	{
		this.size = LinkedList.getSize();
		System.out.println("Queue size is "+this.size);
	}
	public void displayQueue()		// Function to display all Queue elements;
	{
		list.displayList();
	}
}
