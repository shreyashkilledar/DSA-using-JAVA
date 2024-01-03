package com.demo.test;
import java.util.Scanner;
import com.demo.bean.QueueByLL;

public class TestQueueByLL
{
	public static void main(String[] args)
	{
		QueueByLL queue = new QueueByLL();
		
		//Test data
		queue.enqueue("Nilesh");      //size = 1
		queue.enqueue("Abhishek");    //size = 2
		queue.enqueue("Varad");       //size = 3
		queue.enqueue("Pranav");      //size = 4
		queue.enqueue("Prashant");    //size = 5
		queue.enqueue("Omkar");       //size = 6
		queue.enqueue("Anurag");      //size = 7
		queue.enqueue("Tushar");      //size = 8
		queue.enqueue("Chinmay");     //size = 9
		queue.enqueue("Vyanktesh");   //size = 10
		
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		String data = null;
	
		do
		{
			System.out.println("--------------------------------------");
			System.out.println("1. Insert Element in the Queue");
			System.out.println("2. Remove Element from the Queue");
			System.out.println("3. Display Elements in the Queue");
			System.out.println("4. Check if Queue is Full");
			System.out.println("5. Check if Queue is Empty");
			System.out.println("6. Check Size of the Queue");
			System.out.println("0. For Exit");
			System.out.println("--------------------------------------");
			System.out.println("...Enter Your Choice...");
			System.out.println("--------------------------------------");
			
			choice = sc.nextInt(); 
			
			switch(choice)
			{
				case 1:System.out.println("Insert the string");
					   sc.nextLine();
					   data = sc.nextLine();
					   queue.enqueue(data);
					   break;
				case 2:queue.dequeue();
					   break;
				case 3:queue.displayQueue();
					   break;
				case 4:if(queue.isFull())
					   System.out.println("The Queue is Full");
					   else
					   System.out.println("The Queue is not Full");
					   break;
				case 5:if(queue.isEmpty())
					   System.out.println("The Queue is Empty");
				   	   else
				   	   System.out.println("The Queue is not Empty");
					   break;
				case 6:queue.sizeOfQueue();
					   break;
				case 0:System.exit(0);
					   break;
				default:System.out.println("...Invalid Choice...");
					   break;
			}
		}while(choice!=0);
	}

}
