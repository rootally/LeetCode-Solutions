------------------------------------------------------------
Similar to Knapsnack Problem
-------------------------------------------------------------

public class Solution
{
	public int MaxMoney(int[] nums, int n)
	{
		int[] dp = new int [n];

		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		for (int i=2;i<n; i++ )
		{
			dp[i] = Math.max(dp[i-1], d[i-2]+ nums[i]);	
			//dp[i-1] means we are not robbing cauz the sum is still more than the sum adding the i-2 hosue + current house;
		}

		return dp[n-1];
	}
}



------------------------------------------------------------------
More Optimized Space 0(2) Solution
------------------------------------------------------------------
public class Solution 
{
	public int MaxMoney(int[] nums, int n )
	{
		int a =0;
		int b =0;
		//we don't need the while matrix we just need the last 2 values ie -> i-1 & i-2 to evaluate result, hence we use a & b;
		for (int i=0;i<n;i++ )
		 {
			if( i&1 ==0)
			{
				a = Math.max(a + nums[i], b);
			}

			else
			{
				b = Math.max(b + nums[i], a);
			}

		 }

		 return Math.max(a,b); 
	}
}