package Questions;
//https://www.geeksforgeeks.org/minimize-the-maximum-difference-between-the-heights/
import java.util.Arrays;
import java.util.Scanner;
public class MinimizeHeights {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		System.out.println(minimize(arr,n,k));
		sc.close();
	}
	public static int minimize(int arr[],int n,int k)
	{
		Arrays.sort(arr);
		int small=arr[0]+k;
		int big=arr[n-1]-k;
		int ans=big-small;
		for(int i=1;i<n-1;i++)
		{
			small=Math.max(small,arr[i]+k);
			big=Math.min(big,arr[i+1]-k);
			ans=Math.min(ans, big-small);
		}
		return ans;
	}
}
