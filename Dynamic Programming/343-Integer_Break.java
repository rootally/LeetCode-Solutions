public class Solution
{
	public int IntegerBreak(int n)
	{
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		// only 1, 2 and 3 can be the factors and this can be proved ny finding the derivatie of the function!
		int product = 1;

		while (n>4)
		{ 
			product*=3;
			n-=3;	
		}
		// the solution should not contain not more than tow 2's as for 6 3*3>2*2*2
		product*=n;

		return product;
	}
}