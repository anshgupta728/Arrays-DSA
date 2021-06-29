package Questions;
import java.util.Scanner;
/*Longest Arithmetic Array is the longest sub-array whose consecutive elements have same difference
Example: 10 7 4 6 8 10 11
Longest Arithmetic Array: 4 6 8 10  (All consecutive elements have difference=2)
*/
public class LongestArithmeticArray {

	static int longestArithmeticLength(int arr[],int n) {
		if(n==1)
			return Integer.MIN_VALUE;
		int pd=arr[1]-arr[0];
		int currLength=2;
		int maxLength=2;
		int j=2;
		while(j<n) {
			if(pd==arr[j]-arr[j-1]) {
				currLength++;
			}
			else {
				pd=arr[j]-arr[j-1];
				currLength=2;
			}
			maxLength=Math.max(maxLength, currLength);
			j++;
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(longestArithmeticLength(arr,n));
		sc.close();
	}

}
