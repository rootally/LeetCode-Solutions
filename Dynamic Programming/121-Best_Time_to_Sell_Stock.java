public class Solution
{
	public int MaxProfit(List<Integer> prices)
	{
		int max_Price = 0;
		int min_Price = Integer.MAX_VALUE;

		for (int i=0;i<n ; i++)
		{
			min_Price = Math.min(min_Price, prices[i]);
			max_Price = Math.max(max_Price, prices[i] - min_Price); 	
		}
		// We are essentially finding the max value possible by finding the min value and the max for the subsequent max

		return max_Price;
	}
}