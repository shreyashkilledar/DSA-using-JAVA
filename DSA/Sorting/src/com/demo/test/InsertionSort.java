package com.demo.test;

import java.util.Arrays;

public class InsertionSort {
	public static void InsertionSort(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]>key;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {65,23,14,15,13,92,45};
		System.out.print("Given Array: ");
		System.out.println(Arrays.toString(arr));
		InsertionSort(arr);
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
		
	}
	

	
}
