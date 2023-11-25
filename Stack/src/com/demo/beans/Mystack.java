package com.demo.beans;

public class Mystack {
	
	private int[]arr;
	private int size;
	private int top;
	
	public Mystack()
	{
		arr=new int[10];
		size=10;
		top=-1;
	}
	
	public Mystack(int num)
	{
		arr=new int[num];
		size=num;
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public boolean push(int n)
	{
		if(isFull())
		{
			System.out.println("stack Overflow");
			return false;
		}
		else
		{
			top++;
			arr[top]=n;
			return true;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack underflow");
			return -1;
		}
		else
		{
			int num=arr[top];
			top--;
			return num;
		}
		
	}

}
