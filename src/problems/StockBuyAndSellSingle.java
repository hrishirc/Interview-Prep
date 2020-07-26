package problems;

/**
 * SOURCE : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class StockBuyAndSellSingle
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[]{7,1,5,3,6,4};
		int[] arr2 = new int[]{7,6,4,3,1};

		HrcmaxProfit(arr1);
		HrcmaxProfit(arr2);
	}

	// TODO : @Prashant and @Mohit, please add your solutions here

	/*
		BY : Hrishikesh
		RUNNING TIME : O(n)
		DESCRIPTION :  iterate from reverse, buy happens at i, use maximum sellable price for (i,maxIdx] to calc profit,
		update max profit if required
 	*/
	public static int HrcmaxProfit(int[] prices)
	{
		int maxIdx = prices.length - 1;

		if (maxIdx <= 0)
			return 0;

		int maxSellPrice = prices[maxIdx];
		int maxProfit = 0;
		int currentBuyPrice;
		for (int i = maxIdx - 1; i >= 0; i--)
		{
			currentBuyPrice = prices[i];
			maxProfit = Math.max(maxProfit, maxSellPrice - currentBuyPrice);
			maxSellPrice = Math.max(maxSellPrice, currentBuyPrice);
		}

		return maxProfit;
	}
} /*end of StockBuyAndSellSingle.java*/