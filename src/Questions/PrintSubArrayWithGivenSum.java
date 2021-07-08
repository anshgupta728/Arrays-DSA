package Questions;
import java.util.HashMap;
import java.util.Scanner;
public class PrintSubArrayWithGivenSum {
	static void hash_map(int arr[],int n,int s) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int curr=0,start=-1,end=-1;
		boolean found=false;
		for(int i=0;i<n;i++) {
			curr+=arr[i];
			if(curr-s==0) {
				start=0;
				end=i;
				found=true;
				break;
			}
			if(map.containsKey(curr-s)) {
				start=map.get(curr-s)+1;
				end=i;
				found=true;
				break;
			}
			map.put(curr,i);
		}
		
		if(found) {
			System.out.println("Subarray with sum zero exsist from index "+start+" to "+end);
		}
		else {
			System.out.println("Subarray with sum zero does not exsist");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		hash_map(arr,n,s);
		sc.close();
	}
}
