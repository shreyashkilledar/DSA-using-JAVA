package com.demo.test;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapify(int[] arr, int n, int i)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[left]>arr[largest])
		{
			largest=left;
		}
		if(right<n && arr[right]>arr[largest])
		{
			largest=right;
		}
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}
	}
	
	public static void heapSort(int[] arr)
	{
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
			System.out.println("Size: "+i);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
	
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}
}
