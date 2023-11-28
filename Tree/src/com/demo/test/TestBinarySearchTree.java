package com.demo.test;

import com.demo.beans.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		
		BinarySearchTree ob= new BinarySearchTree();
		ob.insert(60);
		ob.insert(35);
		ob.insert(75);
		ob.insert(40);
		ob.insert(20);
		ob.insert(70);
		ob.insert(85);
		
		ob.inorder();
		System.out.println();
		
		ob.preOrder();
		System.out.println();
		
		ob.postOrder();
	}

}
