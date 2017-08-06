public class Solution
{
	public int hammingDistance(int x, int y)
	{
		return Integer.bitCount(x ^y);
		//Integer.bitCount is a inbuilt function that counts the number of 1's in the number
	}
}

-----------------------------------------------------------------------------------------------
Another Approach
-----------------------------------------------------------------------------------------------

public class Solution
{
	public int hammingDistance(intx, int y)
	{
		int dist =0 , int n = x^y;

		while(n)
		{
			dist++;
			n = n & (n-1);
			// n & = n-1 is used to set the right most bit to zero and dist keeps increasing until all the bits are set to zero.
			//n = 10101, and dist = 0 asccording to above code of @pengr7.

			//Before we go into the while loop. n = 10101, dist = 0
			//Loop 1. dist = 1, n =10101 & 10100 = 10100
			//Loop 2. dist = 2, n =10100 & 10011 = 10000
			//Loop 3. dist = 3, n =10000 & (0)1111 = 0
			//Loop ends. dist = 3
		}
	}
}