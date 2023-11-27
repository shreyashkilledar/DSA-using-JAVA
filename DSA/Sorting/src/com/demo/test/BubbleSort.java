package com.demo.test;

import java.util.Arrays;

public class BubbleSort {
	
	//BubbleSort
	public static void bubbleSort(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	//Improve BubbleSort
	public static void improveBubbleSort(int[] arr)
	{
		boolean flag;
		for(int i=0;i<arr.length;i++)
		{
			flag=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
		}
	}
	
	//Main Function
	public static void main(String[] args) {
		
		int [] arr= {65,23,14,15,13,92,45};
		System.out.print("Given Array: ");
		System.out.println(Arrays.toString(arr));
		improveBubbleSort(arr);
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
	}

}
