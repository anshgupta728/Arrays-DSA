package Questions;
//O(nlogn) for best and average cases and O(n*n) for worst case that is when array is already sorted, 
//To improve complexity in worst case just change pivot element to mid or any random position
public class QuickSort {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[low];    
		int i=low,j=high;		
		while(i<j) {	
			//keep on increasing value of i until you encounter an element larger than pivot and keep on decreasing value of j until you encounter an element smaller than
			//pivot and then after it swap elements at i and j positions and also at last when i>j then swap elements at j and pivot position. 
			while(arr[i]<=pivot)	
				i++;
			while(arr[j]>pivot)		
				j--;
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	public static void quicksort(int arr[],int low,int high) {
		if(low<high) {
			int pivot=partition(arr,low,high);
			quicksort(arr,low,pivot-1);
			quicksort(arr,pivot+1,high);
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,6,2,5,7,9,1};
		quicksort(arr,0,arr.length-1);
		for(int i:arr)
			System.out.print(i+" ");
	}

}
