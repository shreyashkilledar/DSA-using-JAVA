package com.demo.test;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionsort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[]arr= {65,23,14,15,13,92,45};
		System.out.print("Given Array:");
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.print("Sorted Array:");
		System.out.println(Arrays.toString(arr));
	}
	

}
