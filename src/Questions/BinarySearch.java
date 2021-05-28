package Questions;
//O(logn)
public class BinarySearch{

	public static int binarysearch(int arr[],int ele,int low,int high) {
		if(low>high)
			return -1;
		int mid=(low+high)/2;
		if(arr[mid]==ele)
			return mid;
		else if(ele>arr[mid])
			return binarysearch(arr,ele,mid+1,high);
		else
			return binarysearch(arr,ele,low,mid-1);
	}
	public static void main(String[] args){
		int arr[]= {12,27,36,45,56,78,89,91};
		int ele=78;
		int pos=binarysearch(arr,ele,0,arr.length-1);
		if(pos==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at position "+(pos+1));
	}

}
