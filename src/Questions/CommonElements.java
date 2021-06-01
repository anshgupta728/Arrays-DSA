//https://practice.geeksforgeeks.org/problems/common-elements1132/1
class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0, j = 0, k = 0;
        HashSet<Integer> s=new HashSet<Integer>();
        while (i < A.length && j < B.length && k < C.length)
        {
             if (A[i] == B[j] && B[j] == C[k])
             {      
                s.add(A[i]);
                i++; j++; k++; 
             }
             else if (A[i] < B[j])
                 i++;
             else if (B[j] < C[k])
                 j++;
             else
                 k++;
        }
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int ele:s)
            a.add(ele);
        Collections.sort(a);
        return a;
    }
}
