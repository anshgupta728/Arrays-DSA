package Questions;

public class MergeSortedwithExtra {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7,10,11}; 
		int arr2[] = {0,2,6,8,9,30,56,12};
		int arr3[]=merge(arr1,arr2,arr1.length,arr2.length);
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
	}
	public static int[] merge(int arr1[], int arr2[], int n, int m) 
    {
		int arr3[]=new int[n+m];
		int i=0,j=0,k=0;
        while(i < n && j < m)
        {
        	if(arr1[i]<arr2[j])
        		arr3[k++]=arr1[i++];
        	else
        		arr3[k++]=arr2[j++];
        }
        while(i<n)
        	arr3[k++]=arr1[i++];
        while(j<m)
        	arr3[k++]=arr2[j++];
        return arr3;
    }
}
