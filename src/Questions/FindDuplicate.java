package Questions;
//https://leetcode.com/problems/find-the-duplicate-number/
import java.util.*;
public class FindDuplicate 
{
	public static void main(String[] args) 
	{
		int nums[]= {1,2,2,1,3,4,4,5,6};
		/*Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;*/
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) 
            	System.out.println(num);
            seen.add(num);
        }
      }
}
