package com.demo.test;

import java.util.Arrays;

public class InsertionSorting {
	
	public static void insertionSort(int []arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			
			for(;j>=0 && arr[j]>key;j-- )
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	

	public static void main(String[] args) {
		int []arr= {12,31,25,8,32,17};
		
		System.out.println("given number "+arr);
		System.out.println(Arrays.toString(arr));
		
		insertionSort(arr);
		System.out.println("given sorted arrays "+arr);
		System.out.println(Arrays.toString(arr));
	}

}
