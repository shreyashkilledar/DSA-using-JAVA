package com.demo.test;

import com.demo.beans.MyCircularQueue;

public class TestMyCircularQueue{
	public static void main(String[] args) {

	  MyCircularQueue q = new MyCircularQueue();
	  q.deQueue();
	  q.enQueue(1);
	  q.enQueue(2);
	  q.enQueue(3);
	  q.enQueue(4);
	  q.enQueue(5);

  // Fails to enqueue because front == 0 && rear == SIZE - 1
	  q.enQueue(6);
	  q.display();
	  
	  int elem = q.deQueue();
	  if (elem != -1) 	
	  {
		  System.out.println("Deleted Element is " + elem);
	  }
	  
	  q.display();
	  q.enQueue(7);
      q.display();

  // Fails to enqueue because front == rear + 1
      q.enQueue(8);
}

}