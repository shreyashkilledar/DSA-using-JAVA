package com.demo.test;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int [] arr, int first, int last)
	{
		int pivot=first;
		int i=first;
		int j=last;
		while(i<j)
		{
			while(i<last && arr[i]<=arr[pivot])
			{
				i++;
			}
			
			while(j>pivot && arr[j]>arr[pivot])
			{
				j--;
			}
			
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
	}
	
	public static void QuickSort(int []arr, int start, int end)
	{
		if(start<end)
		{
			int p=partition(arr,start,end);
			QuickSort(arr,start,p-1);
			QuickSort(arr,p+1,end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		QuickSort(arr,0,arr.length-1);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}

}
