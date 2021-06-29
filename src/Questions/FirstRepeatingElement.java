package Questions;
import java.util.Arrays;
import java.util.Scanner;
/*First Repeating Element Position
  Example: 1 5 3 4 3 5 6 in this array 3 and 5 both are repeating but first occurrence of 5 is least hence position 2 or index 1
  is the First Repeating Element
 */
public class FirstRepeatingElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int N=(int)Math.pow(10, 6);
		int idx[]=new int[N];
		Arrays.fill(idx, -1);
		int minIndex=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(idx[arr[i]]==-1) {
				idx[arr[i]]=i;
			}
			else {
				minIndex=Math.min(idx[arr[i]], minIndex);
			}
		}
		
		System.out.println(minIndex+1);
		sc.close();
	}

}
