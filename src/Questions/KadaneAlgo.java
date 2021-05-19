package Questions;
//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class KadaneAlgo {
	public static int kadane(int arr[])
	{
		int maxsum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(maxsum<sum)
				maxsum=sum;
			if(sum<0)
				sum=0;
		}
		return maxsum;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,-2,5};
		System.out.println(kadane(arr));
	}

}
