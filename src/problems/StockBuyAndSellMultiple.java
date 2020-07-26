package problems;

/**
 * SOURCE : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class StockBuyAndSellMultiple
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[]{7,1,5,3,6,4};
		int[] arr2 = new int[]{1,2,3,4,5};
		int[] arr3 = new int[]{7,6,4,3,1};

		HrcMaxProfitN2(arr1);
		HrcMaxProfitN2(arr2);
		HrcMaxProfitN2(arr3);
	}

	// TODO : @Prashant and @Mohit, please add your solutions here

	/*
		BY : Hrishikesh
		RUNNING TIME : O(n^2) => NOT EFFICIENT!!!
		DESCRIPTION : Uses dynamic programming via memorization. Iterate from reverse, buy happens at i,
		iterate from j=i+1 to maxIdx, sale happens at j, extra sales happen from (j+1,maxIdx] for which max profit is memorized.
		LEARNING : DO NOT GO TO DYNAMIC PROGRAMMING AT FIRST STEP ITSELF!!!!
	 */
	public static int HrcMaxProfitN2(int[] prices)
	{
		int maxIdx = prices.length - 1;

		if (maxIdx <= 0)
			return 0;

		int[] profArr = new int[maxIdx + 1];
		profArr[maxIdx] = 0;
		int maxProfit = 0;
		for (int i = maxIdx - 1; i >= 0; i--)
		{
			int buyPrice = prices[i];

			for (int j = i + 1; j <= maxIdx; j++)
			{
				int sellPrice = prices[j];
				maxProfit = Math.max(maxProfit, sellPrice - buyPrice + profArr[j]);
			}

			profArr[i] = maxProfit;
		}

		return profArr[0];
	}

} /*end of StockBuyAndSellMultiple.java*/ 