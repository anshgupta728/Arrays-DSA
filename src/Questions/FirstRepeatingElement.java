package Questions;
import java.util.*;
/*First Repeating Element Position
  Example: 1 5 3 4 3 5 6 in this array 3 and 5 both are repeating but first occurrence of 5 is least hence position 2 or index 1
  is the First Repeating Element
 */
public class FirstRepeatingElement {
	static void printFirstRepeating2(int arr[]) {
		int N=1000000;
		int idx[]=new int[N];
		Arrays.fill(idx, -1);
		int minIndex=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(idx[arr[i]]==-1) {
				idx[arr[i]]=i;
			}
			else {
				minIndex=Math.min(idx[arr[i]], minIndex);
			}
		}
		if(minIndex==Integer.MAX_VALUE)
			System.out.println("There are no repeating elements");
		else
			System.out.println("The first repeating element is " + arr[minIndex]);
	}
	static void printFirstRepeating1(int arr[]) {
        int min=-1;
        HashSet<Integer> set = new HashSet<>();
        for (int i=arr.length-1;i>=0;i--)
        {
            if (set.contains(arr[i])) {
                min=i;
            }
            else {
                set.add(arr[i]);
            }
        }
        if(min!=-1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		printFirstRepeating1(arr);
		printFirstRepeating2(arr);
		sc.close();
	}
}
