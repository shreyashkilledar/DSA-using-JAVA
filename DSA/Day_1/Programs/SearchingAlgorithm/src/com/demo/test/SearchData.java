package com.demo.test;
import java.util.Scanner;
public class SearchData 
{
	public static void acceptData(int[] arr) 
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter Number:"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	
	
	
	//Linear Search
	public static int linearSearch(int[] arr,int search)
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
	
	
	
	//Binary Search
	public static int binarySearch(int [] arr,int search)
	{
		int first=0,last=arr.length-1;
		int compcnt=0;
		while(first<=last)
		{
			int mid=(first+last)/2;
			compcnt++;
			if(arr[mid]==search)
			{
				System.out.println("comparison are "+compcnt);
				return mid;
			}
			else if(arr[mid]<search)
			{
				first=mid-1;
			}
			else
			{
				last=mid-1;
			}
		}
		System.out.println("comparison are "+compcnt);
		return -1;
	}
	
	
	
	
	//Binary Recursive Search
	public static int binaryrecursive(int first,int last,int search,int[] arr)
	{
		if(first>last)
		{
			return -1;
		}
		else
		{
			int mid=(first+last)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				System.out.println(first+","+last+","+mid+","+search);
				return binaryrecursive(mid+1,last,search,arr);
			}
			else
			{
				System.out.println(first+","+last+","+mid+","+search);
				return binaryrecursive(first,mid-1,search,arr);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n=10;
		int[] arr=new int[n];
		Scanner sc= new Scanner(System.in);
		acceptData(arr);
		System.out.println("Enter the number for search");
		int search= sc.nextInt();
		int pos=binaryrecursive(0,arr.length-1,search,arr);
		if(pos!=-1)
		{
			System.out.println("Number found at:"+pos);
		}
		else
		{
			System.out.println("Number not found");
		}
	}

}
