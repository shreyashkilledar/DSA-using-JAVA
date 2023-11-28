package com.demo.beans;

public class BinarySearchTree {
	
	private Node root;
		public class Node
		{
			private int data;
			private Node left;
			private Node right;
			public Node(int data)
			{
				this.data=data;
				left=null;
				right=null;
			}
		}
	public BinarySearchTree()
	{
		root=null;
	}
	
	
	//insert Key into tree
	private Node insertRec(Node root, int data)
	{
		if(root==null)
		{
			root= new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		else
		{
			root.right=insertRec(root.right,data);
		}
		return root;
	}
	
	public void insert(int data)
	{
		root=insertRec(root,data);
	}
	
	
	//InOrder traversal
	private void inorderTraversal(Node root)
	{
		if(root!=null)
		{
			inorderTraversal(root.left);
			System.out.println(root.data+",");
			inorderTraversal(root.right);
		}
	}
	
	public void inorder()
	{
		inorderTraversal(root);
	}
	
	
	//preOrder traversal
	private void preOrderTraversal(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data+",");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void preOrder()
	{
		preOrderTraversal(root);
	}
	
	
	//postOrderTraversal
	private void postOrderTraversal(Node root)
	{
		if(root!=null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data+",");
		}
	}
	
	public void postOrder()
	{
		postOrderTraversal(root);
	}
}
