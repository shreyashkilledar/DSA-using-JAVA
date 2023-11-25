package com.demo.beans;

public class Mystack1 {
	
	private char[] arr;
	private int size;
	private int top;
	
	public Mystack1()
	{
		arr=new char[5];
		size=5;
		top=-1;
	}
	
	public Mystack1(int num)
	{
		arr= new char[num];
		size=num;
		top=size-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public boolean push(char num)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			top++;
			arr[top]=num;
			return true;
		}
	}
	
	public char pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
			return '#';
		}
		else
		{
			char ch=arr[top];
			top--;
			return ch;
		}
		
	}

}
