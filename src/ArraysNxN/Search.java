package ArraysNxN;
import java.util.Scanner;
/*Pre-Requisite: Array should be sorted row wise and column wise in ascending order
 */
public class Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int val=sc.nextInt();

		boolean k=false;
		int row=0,column=n-1;
		
		while(row<m && column>=0) {
			if(arr[row][column]==val) {
				k=true;
				break;
			}
			else if(arr[row][column]>val) {
				column--;
			}
			else if(arr[row][column]<val) {
				row++;
			}
		}

		if(k==true)
			System.out.println("Found");
		else
			System.out.println("Not found");
		sc.close();
	}
}
