package Questions;
/*Array consists of number of visitors on each day.
A day is a record breaker if-
1) The number of visitors on that day is greater than all visitors on previous days
2) The number of visitors on that day is greater than the following day
Print number of all record breaking days
*/
//
import java.util.Scanner;
public class RecordBreaker {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		arr[n]=-1;
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		if(n==1) {
			System.out.println(1);
		}
		else {
			int recordBreaker=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
				if(arr[i]>max && arr[i]>arr[i+1]) {
					recordBreaker++;
				}
				max=Math.max(max, arr[i]);
			}
			System.out.println(recordBreaker);
			sc.close();
		}
	}

}
