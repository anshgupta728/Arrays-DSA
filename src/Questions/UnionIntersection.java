package Questions;
//https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
import java.util.*;
public class UnionIntersection {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
	    int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
	    System.out.println("Number of elements in union ->  "+doUnion(a,a.length,b,b.length));
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
