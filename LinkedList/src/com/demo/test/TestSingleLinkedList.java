package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TestSingleLinkedList {

	public static void main(String[] args) {
		SingleLinkedList ob= new SingleLinkedList();
		ob.addFirst(2);
		ob.addFirst(1);
		ob.addLast(3);
		ob.addLast(4);
		ob.addByPosition(5, 3);
		ob.deleteByValue(3);
		ob.deleteByPosition(2);
		ob.display();

	}

}
