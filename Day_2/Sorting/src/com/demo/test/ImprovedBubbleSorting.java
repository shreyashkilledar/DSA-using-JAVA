package com.demo.test;

import java.util.Arrays;

public class ImprovedBubbleSorting {
	
	public static void improvedBubbleSorting(int []arr)
	{
		boolean flag;
		for(int i=0;i<=arr.length;i++)
			
		{
			flag=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag)
			{
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int []arr= {50,20,30,40,10};
		System.out.println("Given array is"+arr);
		System.out.println(Arrays.toString(arr));
		
		improvedBubbleSorting(arr);
		System.out.println("sorted array is"+arr);
		System.out.println(Arrays.toString(arr));

	}

}
