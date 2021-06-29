package Questions;
import java.util.Scanner;
public class MaximumCircularSubArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int temp[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			temp[i]=-arr[i];
			sum=sum+arr[i];
		}
		
		int mcsa=sum-(-KadaneAlgo.kadane(temp));
		System.out.println(mcsa);
		
		sc.close();
	}

}
