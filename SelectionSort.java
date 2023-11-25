import java.util.Arrays;

public class SelectionSort {
	public static void main(String[]args) {
		int []arr= {45,10,95,64,88};
		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));
		SelectionSort(arr);
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(arr));
	}
	private static void SelectionSort(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
	}
}
