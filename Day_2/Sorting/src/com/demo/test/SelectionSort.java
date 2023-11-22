package com.demo.test;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minindex=i;
			for(int j=1+i;j<arr.length;j++)
			{
				if(arr[j]<arr[minindex])
				{
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int []arr= {5,1,12,-5,16,2,12,14};
		System.out.println(" given array is");
		System.out.println(Arrays.toString(arr));
		
		selectionSort(arr);
		System.out.println(" given sorted array is");
		System.out.println(Arrays.toString(arr));
		
	}

}
