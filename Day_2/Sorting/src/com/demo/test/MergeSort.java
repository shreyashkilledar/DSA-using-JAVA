package com.demo.test;

import java.util.Arrays;

public class MergeSort {
	
	public static void mergeSort(int []arr1,int []arr2,int []arr3)
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;			
			}
			
		}
		while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
			
	}
	
	public static void main(String[] args) {
		
		int []arr1= {7,15,18,19,20,30,45};
		int []arr2= {8,14,16,17,32,40};
		int []arr3=new int[arr1.length+arr2.length];
		mergeSort(arr1,arr2,arr3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
	

}

