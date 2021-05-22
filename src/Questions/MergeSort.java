package Questions;
import java.util.Scanner;
public class MergeSort{
	public static void sort(int arr[],int temp[],int low,int mid,int high)
	{
		int i=low,j=mid+1,k=low;
		while(i<=mid && j<=high)
		{
			if(arr[i]<arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=mid)
			temp[k++]=arr[i++];
		while(j<=high)
			temp[k++]=arr[j++];
	}
	
	public static void mergesort(int arr[],int temp[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergesort(arr,temp,low,mid);
			mergesort(arr,temp,mid+1,high);
			sort(arr,temp,low,mid,high);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int temp[]=new int[n];
		mergesort(arr,temp,0,n-1);
		System.out.println("*******************************************");
		System.out.println("Original Array");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Sorted Array");
		for(int i:temp)
			System.out.print(i+" ");
		sc.close();
	}
}