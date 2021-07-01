package Questions;
import java.util.Arrays;
import java.util.Scanner;
public class TripletWithGivenSum {
	public static boolean findNumbers(int A[], int n, int X) { 
        for(int i=0;i<n-2;i++){
            if(pairSum(A,X-A[i],i+1)){
                return true;
            }
        }
        return false;
    }
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
		int x=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(findNumbers(arr,n,x));
		sc.close();
	}
}
