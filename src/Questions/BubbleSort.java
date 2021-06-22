package Questions;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		//Normal Bubble Sort -> O(n*n) for all cases
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//Improvised Bubble Sort -> O(n*n) for worst and average and O(n) for best case
		/*boolean swapped=false;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
				if(!swapped)
					break;
			}
		}*/
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}
}
