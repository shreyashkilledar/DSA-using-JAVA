import java.util.Arrays;

public class BubbleSort {

	public static void main(String[]args) {
		int []arr= {65,45,36,25,21};
		System.out.println("Given Array :");
		System.out.println(Arrays.toString(arr));
		
		//bublesortArr;
		improvedBubbleSort(arr);
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(arr));
		
	}
	private static void improvedBubbleSort(int[] arr) {
		int n=arr.length;
		boolean flag;
		for(int i=0;i<n;i++) {
			flag=false;
			{
				for(int j=0;j<n-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						flag=true;
					}
				}
				System.out.println(Arrays.toString(arr));
				if(!flag) {
					break;
				}
			}
		}
	}
}
