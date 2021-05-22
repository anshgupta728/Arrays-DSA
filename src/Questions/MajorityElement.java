//https://leetcode.com/problems/majority-element/
class Solution {
    static int isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return cand;
        else
            return -1;
    }
    public int majorityElement(int[] a) {
        int maj_index = 0, count = 1;
        int i,size=a.length;
        for (i = 1; i < size; i++) {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0) {
                maj_index = i;
                count = 1;
            }
        }
        int cand=isMajority(a,size,a[maj_index]);
        return cand;
    }
}
