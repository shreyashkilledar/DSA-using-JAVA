package com.demo.test;

import com.demo.beans.Mystack;

public class TestMystack {
	public static void main(String[] args) {
		
		Mystack ob= new Mystack(10);
		ob.push(15);
		ob.push(95);
		ob.push(35);
		ob.push(45);
		ob.push(55);
		ob.push(65);
		while(!ob.isEmpty())
		{
	      System.out.println(ob.pop());
		}
		
	}

}
