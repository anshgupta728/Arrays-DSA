package Questions;
//https://leetcode.com/problems/rotate-array/
//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
public class RotationBynElements {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7};
		int arr1[]=new int[7];
		for(int i=0;i < arr.length; i++)
			arr1[i]=arr[i];
		int d=3;
		int clock[]=clockwise(arr,d);
		System.out.println("Clockwise-> ");
		for(int i:clock)
			System.out.print(i+" ");
		System.out.println();
		int anticlock[]=anti_clockwise(arr1,d);
		System.out.println("AntiClockwise-> ");
		for(int i:anticlock)
			System.out.print(i+" ");
		System.out.println();
		
	}

	public static int[] clockwise(int[] nums, int d) {
		int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
            a[(i+d)%nums.length] = nums[i];
        for (int i = 0; i < nums.length; i++) 
            nums[i] = a[i];
        return nums;
	}

	public static int[] anti_clockwise(int[] nums, int d) {
		int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        	a[i] = nums[(i+d)%nums.length];
        for (int i = 0; i < nums.length; i++) 
            nums[i] = a[i];
        return nums;		
	}

}
