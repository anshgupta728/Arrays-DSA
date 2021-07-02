package Questions;
//https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
import java.util.*;
public class UnionIntersection {

	public static void main(String[] args) {
		
		int a[] = {9,1,2,3,10,4,6 };
	    int b[] = {11,2,9,3,13,14,15};
	    System.out.println("Number of elements in union ->  "+doUnion(a,a.length,b,b.length));
	    System.out.println("Number of elements intersection ->  "+doIntersection(a,b));
	}
	
	public static int doIntersection(int a[],int b[]) {
		int count=0;
		Set<Integer> s=new HashSet<Integer>();
		for(int i:a)
            s.add(i);
		for(int i:b) {
			if(s.contains(i)) {
				count++;
				s.remove(i);
			}
		}
		return count;
	}
	
	public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> s=new HashSet<Integer>();
        for(int i:a)
            s.add(i);
        for(int i:b)
            s.add(i);
        System.out.println("Union of arrays ->  "+s);
        return (s.size());
    }
}
