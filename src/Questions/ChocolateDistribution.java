package Questions;
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
import java.util.Arrays;
public class ChocolateDistribution {
	public static int distribute_chocolate(int arr[],int m) {
		if (m == 0 || arr.length == 0)
            return 0;
        if (arr.length < m)
           return -1;
		Arrays.sort(arr);
		int d=Integer.MAX_VALUE;
		int diff;
		// 1 3 4 7 9 9 12 56
		for(int i=0;i+m-1<arr.length;i++)
		{
			diff=arr[i+m-1]-arr[i];
			if(diff<d)
				d=diff;
		}
		return d;
	}
	public static void main(String[] args) {
		int arr[]={3, 4, 1, 9, 56, 7, 9, 12} ;
		int m=5;
		System.out.println(distribute_chocolate(arr,m));

	}

}
