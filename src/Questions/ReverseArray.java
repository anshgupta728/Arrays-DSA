package Questions;
//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
public class ReverseArray {

	public static void main(String[] args) {

		int arr[]={-23,43,12,89,-18,109,90,102,13};
		reverse(arr,0,arr.length-1);
		System.out.println("Reversed Array:");
		for(int i:arr)
			System.out.print(i+" ");
	}
	public static void reverse(int arr[],int low,int high)
	{
		int temp;
		while(low<high)
		{
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			high--;
			low++;
		}
	}

}
