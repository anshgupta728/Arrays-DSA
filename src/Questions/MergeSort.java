package Questions;
import java.util.Scanner;
public class MergeSort {
	public static void sort(int arr[],int low,int mid,int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[low+i];
		for (int i=0;i<n2;i++)
            R[i]=arr[mid+1+i];
		int i = 0, j = 0,k=low;
        while (i<n1&&j<n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else 
                arr[k++] = R[j++];
        }
        while (i<n1) 
        	arr[k++] = L[i++];
        while (j<n2)
        	arr[k++] = R[j++];
	}
	
	public static void mergesort(int arr[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			sort(arr,low,mid,high);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Original Array");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		mergesort(arr,0,n-1);
		System.out.println("Sorted Array");
		for(int i:arr)
			System.out.print(i+" ");
		sc.close();
	}
}

	
