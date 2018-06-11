import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		selectionSort(arr);
	}
	
	static void selectionSort(int[] lst) {
	    int n = lst.length;
	    for (int i = 0; i < n; i++) {
	        int index=i;
	        int smallest = lst[i];
	        for (int j = i; j < n; j++) {
	            if (lst[j] < smallest) {
	                smallest = lst[j];
	                index = j;
	            }
	        }
	            int temp = lst[i];
	            lst[i] = smallest;
	            lst[index] = temp;
	    }
	    System.out.println(Arrays.toString(lst));
	}

}
