package com.demo.beans;

public class MyQueue {
	private int []queuearr;
	private int front;
	private int rear;
	private int size;
	
	public MyQueue() {
		size=10;
		queuearr=new int[size];
		front=0;
		rear=-1;
	}
	public MyQueue(int s) {
		size=s;
		queuearr=new int[size];
		front=0;
		rear=-1;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean isEmpty() {
		return front>rear;
	}
    public void enqueue(int n) {
    	if(isFull()) {
    		System.out.println("queue is full,cannot add");
    	}
    	else {
    		rear++;
    		queuearr[rear]=n;
    		System.out.println(n+" added in the queue");
    	}
    }
    public int dequeue() {
    	if(isEmpty()) {
    		System.out.println("queue is empty so cannot delete the number");
    		return -1;
    	}
    	else {
    		int n=queuearr[front];
    		System.out.println("Remove value from front end" +front+"---->"+n);
    		front ++;
    		return n;
    		
    	}
    }
}
