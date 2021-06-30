package ArraysNxN;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{10,11,12},{13,14,15},{16,17,18}};
		//Columns in first matrix should be equal to rows in second matrix
		int multiplication[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					multiplication[i][j]+=arr1[i][k]*arr2[j][k];
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(multiplication[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
