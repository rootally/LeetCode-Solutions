----------------------------------------------------------------
Dynamic Programming - 440 ms
-----------------------------------------------------------------
public class Solution
{
	public int MinSquare(int n)
	{
		int [] dp = new int[n+1];
		//Stores least number of perfect squares which sum to i

		Arrays.fill(dp, Integer.MAX_VAL);

		dp[0] =0;
		for (int i=0;i<n ;i++ )
		{	
			// for each i (sum) we are finding the min num of squares
			for (int j=0; j*j<=i ; j++ )
			 {
			 	// we subtract the index j squared and find the min number of squares which took to find for that number
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);		
			 }	
		}

		return dp[n];
	}
}

--------------------------------------------------------------------------------------
Static Dynamic Programming -12ms
-----------------------------------------------------------------------------------

//static dp is much more faster than dp cauz we don't rebuild the table again and again when we call a function, on the other case we use 
//buil-in table again and again!
public class Solution
{
	public int MinSquare(int n)
	{
		List<Integer> list = new ArrayList<>();
		//List<Integer> list  = new ArrayList<>(asList(0));
		List.add(0);

		while(list.size() <= n)
		{
			int m = list.size();
			countPerSquar = Integer.MAX_VAL;

			for (int i=0;i*i<=m ;i++ )
			{
					countPerSquar = Math.min(countPerSquar, list[m-i*i]+1);	
			}
			list.add(countPerSquar);
		}


	}
}