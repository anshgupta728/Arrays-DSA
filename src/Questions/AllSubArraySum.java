package Questions;
public class AllSubArraySum {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,-10,5};
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr=curr+arr[j];
				maxsum=Math.max(maxsum,curr);
				System.out.println(curr);
			}
			System.out.println();
		}
		System.out.println("Maximum SubArray Sum= "+maxsum);
	}
}

