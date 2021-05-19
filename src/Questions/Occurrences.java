package Questions;
//https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class Occurrences
{
	public static void main(String[] args) {
	    Set<Integer> s=new HashSet<Integer>();
	    int arr[]={1,2,3,1,2,4,5,4,6,5,7,2,8,9,9,1};
	    for(int i:arr)
	        s.add(i);
		Iterator<Integer> iter= s.iterator();
		System.out.println("Element    Occurrences");
        while(iter.hasNext())
        {
            int d=iter.next();
            int count=0;
            for(int i:arr)
                if(i==d)
                    count++;
            System.out.println(d+"\t->\t"+count);
        }
	}
}