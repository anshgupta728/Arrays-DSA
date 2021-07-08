package Questions;
import java.util.*;
public class SubArrayWithGivenSum {
	// 2 3 5 2 5 10 2 3
	static boolean check2(int arr[],int s) {
		Set<Integer> set=new HashSet<Integer>();
		int sum=0;
		for(int ele:arr) {
			sum+=ele;
			if(sum-s==0) {
				return true;
			}
			if(set.contains(sum-s)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}
	
	static boolean check1(int arr[],int s) {
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr=curr+arr[j];
				if(curr==s) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum");
		int s=sc.nextInt();
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(check1(arr,s));
		System.out.println(check2(arr,s));
		sc.close();
	}
}
