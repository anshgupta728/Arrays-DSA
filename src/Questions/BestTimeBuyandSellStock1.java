//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit=-1;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minsofar=Math.min(minsofar,prices[i]);
            int profit=prices[i]-minsofar;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
