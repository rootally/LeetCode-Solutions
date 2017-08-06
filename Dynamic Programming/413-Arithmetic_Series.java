public class Solution
{
	public int no_of_arithmetic_series(int []a)
	{
		int curr=0, sum=0;

		for(int i =2 ;i< A.length; i++)
			if(a[i]-a[i-1] == a[i-1]-a[i-2])
				{
					curr++;
					//curr keeps track of the number of current arithmetic series going with any distruption in between
					sum+=curr;
					//sum automatically keeps track of the number of slices as every time curr increases the number of combination of 
					// the slices formed using at least 3 integers;
					//eg a[1,2,3,4] returns 3 adding 5 to the sequence forms arithmetic series [3,4,5], [2,3,4,5] ,[1,2,3,4,5] which is 3
					//and is added to the sum in next step! 
				}
			else
				curr=0;
	}
	return sum;

}