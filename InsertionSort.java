import java.util.Arrays;

public class InsertionSort {
	public static void main(String[]args) {
		int []arr= {45,65,36,78,23};
		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(arr));
		
		
	}
	private static void insertionsort(int[]arr) 
	{
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
		}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));	
		}
	}
}


