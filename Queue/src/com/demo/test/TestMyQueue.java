package com.demo.test;

import com.demo.beans.MyQueue;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue ob=new MyQueue(7);
		ob.enqueue(45);
		ob.enqueue(55);
		ob.enqueue(96);
		ob.enqueue(47);
		ob.enqueue(63);
		//System.out.println(ob);
		ob.enqueue(52);
		ob.enqueue(56);
		ob.enqueue(53);
		ob.dequeue();
		//System.out.println(ob);
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		ob.dequeue();
		//System.out.println(ob);
		ob.dequeue();
		}

}
