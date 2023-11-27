package com.demo.test;

import com.demo.beans.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList ob = new CircularLinkedList();
		ob.addByPosition(1,11);
		ob.addByPosition(2,12);
		ob.display();
		ob.deletebyKey(11);
		ob.deletebyKey(12);
		ob.display();
	}

}
