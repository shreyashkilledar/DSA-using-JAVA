package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		
		SingleLinkedList ob= new SingleLinkedList();
		ob.addFirst(2);
		ob.addFirst(1);
		ob.addLast(3);
		ob.addLast(4);
		ob.addByPosition(3, 10);
		ob.addByPosition(4, 11);
		ob.display();
	}

}
