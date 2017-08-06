public class Solution
{
	public maxSubArray(int[] a, int size)
	{
		int max_so_far = 0;
		//This will contain the actual max sum possible which we get when we iterate through the array
		int max_ending = 0;
		//This variavle contains sum which is updated at every instance 

		for (int i=0; int < a.length ; i++ )
		{
			max_ending = max_ending + a[i];
			//Adding the curretn value to check if it exceeds the max sum so far or not

			if(max_so_far < max_ending)
				max_so_far = max_ending;

			if(max_ending < 0)
				max_ending =0;
			//if max_ending reaches zero it means it better to keep it zero instead of adding
		}

		return max_so_far;
	}
}