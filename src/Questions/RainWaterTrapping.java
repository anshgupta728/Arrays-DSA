package Questions;
//https://leetcode.com/problems/trapping-rain-water/
public class RainWaterTrapping {
	public static int amount(int arr[])
	{
		if(arr.length<=2)
			return 0;
		//Water collect only in holes that means water collect only on indexes where there is a higher height pillar on left as well as right
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		left[0]=arr[0];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++)
			left[i]=Math.max(arr[i],left[i-1]);
		for(int i=arr.length-2;i>=0;i--)
			right[i]=Math.max(right[i+1],arr[i]);
		int water=0;
		for(int i=0;i<arr.length;i++)
			water=water+(Math.min(left[i],right[i])-arr[i]);
		return water;
	}

	public static void main(String[] args) {

		int arr[]= {3,1,2,4,0,1,3,2};
		System.out.println(amount(arr));
	}

}
