package Questions;
import java.util.Scanner;
public class MaxTillPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
			System.out.println("Max till "+i+"th position is: "+max);
		}
		sc.close();
	}

}
