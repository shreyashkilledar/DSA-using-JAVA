package com.demo.test;


import java.util.Scanner;

import com.demo.beans.Mystack1;
public class TestBalanceParenthesis {
	
	private static boolean checkBalanceParenthesis(String str)
	{
		Mystack1 ob= new Mystack1(str.length());
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{')
			{
				ob.push(ch);
			}
			else
			{
				if(ch==')' || ch==']' || ch=='}')
				{
					if(!ob.isEmpty())
					{
						char ch1= ob.pop();
						if((ch==')' && ch!='(') || (ch==']' && ch!='[') || (ch=='}' && ch=='{'))
						{
							return false;
						}
					}
					else
					{
						return false;
					}
				}
			}
		}
		if(ob.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		Mystack1 ob= new Mystack1(20);
		Scanner sc= new Scanner(System.in);
		String str="({[][](({})})";
		boolean status= checkBalanceParenthesis(str);
		if(status)
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}

	}

}
