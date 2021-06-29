package Questions;
import java.util.Arrays;
import java.util.Scanner;
/*Check if pair of two numbers in an array is equal to given sum and print all those pairs*/
public class PairSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=sc.nextInt();
		
		Arrays.sort(arr);
		
		int low=0,high=n-1;
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println(arr[low]+" "+arr[high]);
				low++;
				high--;
			}
			else if(arr[low]+arr[high]>sum){
				high--;
			}
			else if(arr[low]+arr[high]<sum){
				low++;
			}
		}
		sc.close();
	}

}
