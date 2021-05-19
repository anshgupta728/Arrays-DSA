package Questions;
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class MinMax {
	public static void main(String[] args) {
		int arr[]={-23,43,12,89,-18,109,90,102,13};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>max)
				max=i;
			if(i<min)
				min=i;
		}
		System.out.println("Minimum value-> "+min);
		System.out.println("Maximum value-> "+max);
	}

}
