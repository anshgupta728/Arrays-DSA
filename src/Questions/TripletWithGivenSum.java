package Questions;
import java.util.Arrays;
/*Check if there is an triplet in an array is equal to given sum and return true*/
import java.util.Scanner;
public class TripletWithGivenSum {
	//Brute Force [O(N*N*N)]
	private static void findTriplets1(int arr[],int n,int sum) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
	}
	//Sorting and Two Pointers Approach [O(N*N)]
	private static void findTriplets2(int arr[],int n,int sum) {
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			pairSum(arr,n,sum-arr[i],i+1,arr[i]);
		}
	}
	private static void pairSum(int arr[],int n,int sum,int low,int temp) {
		int high=n-1;
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println(temp+" "+arr[low]+" "+arr[high]);
				return;
			}
			else if(arr[low]+arr[high]>sum) {
				high--;
			}
			else {
				low++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Using Brute Force");
		findTriplets1(arr,n,sum);
		System.out.println("Using sorting and Two Pointers");
		findTriplets2(arr,n,sum);
		sc.close();
	}
}
