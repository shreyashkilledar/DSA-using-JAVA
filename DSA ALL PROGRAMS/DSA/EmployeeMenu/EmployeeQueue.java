			package com.demo.beans;


public class EmployeeQueue {
	Node rear;
	Node front;
	Employee ob = new Employee();
	
	class Node{
		Employee emp;
		Node next;
		public Node(Employee emp) {
			super();
			this.emp = emp;
			next=null;
		}
		
	}
	
	private boolean isEmpty()
	{
		return front==null && rear==null;
	}
	
	public void insertEmployee(Employee emp)  //enqueue operation
	{
		//Employee ob = new Employee();
		Node newNode = new Node(emp);
		if(front==null)
		{
			front=newNode;
			rear=front;
		}
		else if(front!=null)
		{
			front.next=newNode;
			rear=newNode;
		}
		System.out.println("Employee "+emp.getEmpid()+" "+emp.getFullName()+" "+emp.getGender()+" added successfully");
		
	}
	
	public Employee removeEmployee()		//dequeue operation
	{
		Node temp=front;
		Employee e;
		if(isEmpty())
		{
			System.out.println("Queue is empty.");
		}			
		if(front!=null)
		{
			e=front.emp;
			front=front.next;
			temp=null;
			return e;
		}
		return null;
		
	}
	
	public void printFemale()
	{
		Node temp=front;
		while(temp!=null)
		{
			if((temp.emp.getGender()).equalsIgnoreCase("female"))
			{
				// female = ob.toString();
				System.out.println(temp.emp);
				temp=temp.next;
				//System.out.println(ob.getGender().concat("female"));
			}
			
		}
			
	}
	
	public void printMale()
	{
		Node temp=front;
		while(temp!=null)
		{
			if((temp.emp.getGender()).equalsIgnoreCase("male"))
			{
				//Employee(emp.getGender().equals("male"));
				//String male = ob.toString();
				System.out.println(temp.emp);
				temp=temp.next;
			}
			
		}
	}

	@Override
	public String toString() {
			Node temp=front;
			while(temp!=null)
			{
				System.out.println(temp.emp);//"Employee:"+temp.emp.getEmpid()+" "+temp.emp.getFullName()+" "+temp.emp.getGender());
				temp=temp.next;
			}
			return "EmployeeQueue [front=" + front.emp.toString() + "]";
	}

	public void reverseQueue() {
		
		
	}
	
	
}

