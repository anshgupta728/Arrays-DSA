package Questions;
import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int temp,min;
		for(int i=0;i<n-1;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();

	}

}
