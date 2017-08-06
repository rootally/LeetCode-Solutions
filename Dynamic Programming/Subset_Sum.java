---------------------------------------------------------------------------------
Recursive Solution
---------------------------------------------------------------------------------

public Solution
{
	boolean isSubset(int arr[], int n, int sum)
	{
		if(sum==0)
			return true;
			//base cases -> when we have reached the desired sum
		if( n<0 || sum<0 )
			return false;

			//As usal 2 cases, one in which we iclude the element and the other in which we exclude the element
		boolean include = isSubset(arr, n-1, sum-arr[n]);

		boolean excude = isSubset(arr, n-1, sum);

		return include || excude;
	} 
}


----------------------------------------------------------------------------------
Dyanamic Solution
----------------------------------------------------------------------------------

public class Subsetsum
{
	public boolean SubsetSum(int arr[], int total)
	{
		boolean [][] sum = new boolean[arr.length() +1][total +1];

		for (int i=0;i<=arr.length ;i++ )
		{
			sum[i][0] = true;
		}

		for (int i = 1;i<=arr.length ;i++ )
		 {
			for (int j = 1;j<=total ;j++ )
			 {
				if(j- arr[i-1] >= 0)
					sum[i][j] = sum[i-1][j] || sum[i-1][j-arr[i-1]];
				//if the i is smaller or equal than total than as usal we have to option either to take it or not, if we don't take it we 
				//get the value from the aboe row having the same total and the other choice we go i steps back in other words we decrease 
				//total by i and check if making that sum is possible . eg if total =11, i=8 the subtracting we get 3 means we are checking 
				//if sum 3 was possible in the previous row!
				else
					sum[i][j] = sum[i-1][j];
				//if i is greater than total, it is impoosible for it to be part of the sumset, so we just get the value from above
			 }
		 }
		 return [arr.length][total];
	}
}

-----------------------------------------------------------------------------------------------------------------
Print all the Subsets Possible
-----------------------------------------------------------------------------------------------------------------

public void printSubset(int[] arr, int i, int sum, List<Integer> p, int[][] dp)
{
	//if u reached the very first row and still sum !=0 but if the first row contains a number equal to sum
	//then it's part of a subset 
	if(i==0 && sum!=0 && dp[0][sum])
	{
		p.add(arr[i]);
		System.out.println(p);
		return;
	}
	//if u reached the first row and sum ==0, means u have found your subset back
	if(i==0 && sum==0)
	{
		System.out.println(p);
		return;
	}

	//Checking if the sum can be achieved by ignoring the current element
	//if it is possible we go on cheking the upper number further
	if(dp[i-1][sum])
	{
		List<Integer> list = ArrayList<>();
		printSubset(arr, i-1, sum, list, dp);
	}

	//if given sum can be achieved after considering the current element 
	if(sum >= arr[i] && dp[i-1][sum - arr[i]])
	{
		p.add(arr[i]);
		printSubset(arr, i-1, sum-arr[i], p, dp)
	}
} 

--------------------------------------------------------------------------------------------------------------