package Questions;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeBuyandSellStock1 {
	
	public static int maxProfit(int prices[]) {
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

	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));
	}

}
