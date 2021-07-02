package Questions;
import java.util.*;
public class SubArrayWithGivenSum {
	// 2 3 5 2 5 10 2 3
	static void check2(int arr[],int s) {
		Set<Integer> set=new HashSet<Integer>();
		int sum=0;
		boolean found=false;
		for(int ele:arr) {
			set.add(sum);
			sum+=ele;
			if(set.contains(sum-s)) {
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("True");
		else
			System.out.println("False");
	}
	static void check1(int arr[],int s) {
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr=curr+arr[j];
				if(curr==s) {
					found=true;
				}
			}
			if(found)
				break;
		}
		if(found)
			System.out.println("True");
		else
			System.out.println("False");
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
		check1(arr,s);
		check2(arr,s);
		sc.close();
	}
}
