package Questions;
//https://leetcode.com/problems/kth-largest-element-in-an-array/
import java.util.*;
public class KthMax 
{
	public static void main(String[] args) 
	{		
		int arr[]= {23,45,67,89,12,90,21,27,62,83}; //90 89 83 67 62 45 27 23 21 12 
		int k=4; //kth largest
		int d=0;
		//using a max Heap
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
		if(k>0&&k<=arr.length) {
			for(int i:arr)
				maxHeap.add(i);
			while(k--!=0)
				d=maxHeap.remove();
			System.out.println(d);
		}
		else
			System.out.println("Invalid value of k");
	}
}