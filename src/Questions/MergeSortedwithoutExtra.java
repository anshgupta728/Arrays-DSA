package Questions;
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
//Merging Sorted Arrays without extra space
import java.util.Arrays;
public class MergeSortedwithoutExtra {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7,10,11}; 
		int arr2[] = {0,2,6,8,9,30,56,12};
		merge(arr1,arr2,arr1.length,arr2.length);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
	}
	public static void merge(int arr1[], int arr2[], int n, int m) 
    {
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2); 
    }

}
