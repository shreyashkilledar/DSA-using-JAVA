package com.demo.test;

import java.util.Arrays;

public class BubbleSorting {
	
	public static void bubbleSort(int []arr)
	{
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

public static void main(String[] args) {

	int []arr= {50,20,30,40,10};
	System.out.println("Given array is"+arr);
	System.out.println(Arrays.toString(arr));
	
	bubbleSort(arr);
	System.out.println("sorted array is"+arr);
	System.out.println(Arrays.toString(arr));
	

	
}
}

