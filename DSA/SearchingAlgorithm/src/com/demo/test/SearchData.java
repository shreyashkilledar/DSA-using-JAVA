package com.demo.test;

import java.util.Scanner;

public class SearchData {
	
	
	public static void acceptdata(int [] arr)
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number:"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	
	public static int LinearSearch(int [] arr,int search)
	{
		for(int j=1;j<arr.length;j++)
		{
			if(arr[j]==search)
			{
				return j;
			}
		}
		return -1;
	}
	
	
	public static int binarySearch(int [] arr, int search)
	{
		int first=0;
		int last=arr.length;
		int cnt = 0;
		while(first<=last)
		{
			int mid=(first+last)/2;
			cnt++;
			if(arr[mid]==search)
			{
				System.out.println("Comparison: "+cnt);
				return mid;
			}
			else if(arr[mid]<search)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		System.out.println("Comparison: "+cnt);
		return -1;
	}
	
	
	public static int binaryRecursive(int first,int last, int search, int [] arr)
	{
		if(first>last)
		{
			return -1;
		}
		else
		{
			int mid= (first+last)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				System.out.println(first+","+last+","+mid+","+search);
				return binaryRecursive(mid+1,last,search,arr);
			}
			else
			{
				System.out.println(first+","+last+","+mid+","+search);
				return binaryRecursive(first,mid-1,search,arr);
			}
		}
	}

	public static void main(String[] args) {
		
		int n=10;
		int [] arr= new int[n];
		Scanner sc= new Scanner(System.in);
		acceptdata(arr);
		System.out.println("Enter number to search");
		int search= sc.nextInt();
		//int pos= LinearSearch(arr,search);
		int pos= binaryRecursive(0,arr.length-1,search,arr);
		if(pos!=-1)
		{
			System.out.println("Number found at "+pos);
		}
		else
		{
			System.out.println("Number not found");
		}
		
	}

}
