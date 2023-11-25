import java.util.Arrays;

public class QuickSort {
	
	private static int Partition(int[]arr,int first,int last)
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
	
	public static void QuickSort(int [] arr,int start, int end)
	{
		if(start<end)
		{
			int p=Partition(arr,start,end);
			QuickSort(arr,start,p-1);
			QuickSort(arr,p+1,end);
		}
	}


	public static void main(String[] args) {
		int[]arr= {25,17,18,28,95,78,87};
		System.out.println("Given array:");
		System.out.println(Arrays.toString(arr));
		QuickSort(arr,0,arr.length-1);
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(arr));
		
	}

}
