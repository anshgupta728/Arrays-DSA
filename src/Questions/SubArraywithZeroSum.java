package Code;
import java.util.*;
public class SubArraywithZeroSum {
	static void hashing(int arr[],int n) {
		Set<Integer> s=new HashSet<>();
		boolean found=false;
		int sum=0;
		for(int i=0;i<n;i++) {
			s.add(sum);
			sum+=arr[i];
			if(s.contains(sum)) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Subarray with sum zero exsist");
		}
		else {
			System.out.println("Subarray with sum zero does not exsist");
		}
	}
	static void bruteForce(int arr[],int n) {
		boolean found=false;
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr+=arr[j];
				if(curr==0) {
					found=true;
					break;
				}
			}
			if(found)
				break;
		}

		if(found) {
			System.out.println("Subarray with sum zero exsist");
		}
		else {
			System.out.println("Subarray with sum zero does not exsist");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		bruteForce(arr,n);
		hashing(arr,n);
		sc.close();
	}
}
