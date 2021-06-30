package ArraysNxN;

public class Transpose {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int trans[][]=new int[3][3];
		
		System.out.println("Original Matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//Storing Transpose in a new Matrix
		System.out.println("Transpose Matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				trans[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		//Storing Transpose in Original Matrix
		System.out.println("Original Matrix");
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
