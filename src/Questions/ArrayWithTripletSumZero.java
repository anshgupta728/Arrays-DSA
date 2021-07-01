package Questions;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayWithTripletSumZero {
	static boolean pairSum(int arr[],int x,int low) {
		int high=arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high]==x) {
				return true;
			}
			else if(arr[low]+arr[high]>x){
				high--;
			}
			else if(arr[low]+arr[high]<x){
				low++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		Arrays.sort(arr);
		boolean k=false;
		for(int i=0;i<n-2;i++) {
			if(pairSum(arr,-arr[i],i+1)) {
				k=true;
				System.out.println("True");
				break;
			}
		}
		if(!k) {
			System.out.println("False");
		}
		sc.close();
	}

}
