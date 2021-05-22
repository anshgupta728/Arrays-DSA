package Questions;
import java.util.*;
public class MajorityElement {
	//Brute Force Approach
	public static void majoritybrute(int arr[], int n)
	{
		int maxCount = 0;
        int index = -1; 
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2)
            System.out.println("Majority element using Brute Force Approach :" +arr[index]);
        else
            System.out.println("No Majority Element");
	}
	
	//Sorting Approach
	public static int majoritysort(int[] arr, int n)
	{
	    Arrays.sort(arr);
	    int count = 1, max_ele = -1,temp = arr[0], ele = 0,f = 0;
	    for(int i=1;i<n;i++)
	    {
	        if (temp == arr[i])
	            count++;
	        else
	        {
	            count = 1;
	            temp = arr[i];
	        }
	        if (max_ele < count)
	        {
	            max_ele = count;
	            ele = arr[i];
	 
	            if (max_ele > (n / 2))
	            {
	                f = 1;
	                break;
	            }
	        }
	    }
	    return (f == 1 ? ele : -1);
	 }
	    
	//HashMap
	public static void majorityhash(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
 
        for(int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                    int count = map.get(arr[i]) +1;
                    if (count > arr.length /2) {
                        System.out.println("Majority element using HashMap Approach :" + arr[i]);
                        return;
                    } else
                        map.put(arr[i], count);
            }
            else
                map.put(arr[i],1);
            }
            System.out.println(" No Majority element");
    }
	
	//Moore's Voting Algorithm
    public static int majoritymoore(int a[], int size)
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }
 
    public static boolean isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
	    int n = 7;
	    //Brute force
	    majoritybrute(arr,n);
	    //HashMap
	    majorityhash(arr);
	    //Moore Voting Algorithm
	    int cand=majoritymoore(arr,n);
	    if (isMajority(arr, n, cand))
            System.out.println("Majority Element using Moore Voting Algorithm"+cand);
        else
            System.out.println("No Majority Element");
	    //Sorting Approacha
	    System.out.println("Majority element using Sorting Approach :" +majoritysort(arr, n));

	}

}
