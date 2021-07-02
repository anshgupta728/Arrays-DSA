package Questions;
/*Check if pair of two numbers in an array is equal to given sum and print all those pairs*/
import java.util.*;
public class PairSum {
	//Brute Force Approach [O(N*N)]
	private static void findPairs1(int arr[],int n,int sum) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	//Sorting and Two Pointers Approach [O(nlogn) for sorting and O(n) for two pointers]
	private static void findPairs2(int arr[],int n,int sum) {
		Arrays.sort(arr);
		int low=0,high=n-1;
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println(arr[low]+" "+arr[high]);
				high--;
				low++;
			}
			else if(arr[low]+arr[high]>sum) {
				high--;
			}
			else {
				low++;
			}
		}
	}
	//Hashing Approach   [O(N) Time and O(N) Space]
	private static void findPairs3(int arr[],int n,int sum) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			int temp=sum-arr[i];
			if(set.contains(temp)) {
				System.out.println(arr[i]+" "+temp);
			}
			set.add(arr[i]);
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
		findPairs1(arr,n,sum);
		System.out.println("Using sorting and Two Pointers");
		findPairs2(arr,n,sum);
		System.out.println("Using Hashing");
		findPairs3(arr,n,sum);
		sc.close();
	}

}
