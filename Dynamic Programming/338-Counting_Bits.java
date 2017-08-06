public class Solution
{
	public int[] Number_of_Bits(int n)
	{
		int []dp = new int [n+1];

		for (int i=1;i<=n;i++ )
		{
			dp[i] = dp[i/2] + (i & 1);
			//Basically we are dividing number into parts eg -> 10110 
			//The LSB is used to identify weather the number is odd or even that is why we use i%2
			//Then we do right shift by 1 so as to avoid overlapping sub-problem and fetch the result is calculated before 	
		}

		return dp;
	}
}