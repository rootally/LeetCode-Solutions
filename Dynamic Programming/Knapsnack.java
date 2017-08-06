-------------------------------------------------------------------------------
Recursive Solution
-------------------------------------------------------------------------------

public class Solution
{
	public int Knapsnack(int[] weight, int[] val, int w, int itemNo)
	{
		if(w == 0 || itemNo == weight.length)
			return 0;
		//if weight =0 or we have reached the end of the list, means our search is complete
		if(weight[itemNo] > w)
			return Knapsnack(weight, val, w, itemNo+1);

		int include = val[itemNo] + Knapsnack(weight, val, w - weight[itemNo], itemNo+1);
		//We include the specific weight so we add it's value and calculate the remaining weight

		int exclude = Knapsnack(weight, val, w, itemNo+1);
		//We exclude the weight and move to other one

		return Math.max(include, exclude);

	}
}

--------------------------------------------------------------------------------
Dynamic Approach
--------------------------------------------------------------------------------

public class Solution 
{   
	public int BottomUp(int[] val, int[] weight, int W)
	{
		int [][] arr = new int [weight.length + 1][W + 1];
		//Row can be of any length either weight or value as both have same length

		for (int i=0; i<=weight.length ; i++)
		{
			for (int j=0;j<val.length+1 ;j++ )
			 {
				if(i==0|| j==0)
					{
						arr[i][j] = 0;
						continue;
					}
					// if weight or value is zero then the subsequent total max value is also zero

				if(j - wt[i-1]>=0)
					arr[i][j] = Math.max(arr[i-1][j], arr[i-1][j-wt[i-1]] + val[i-1]);
				//if the weight is greater than the subsequent total weight than we have 2 choices as usual, so we find the max by finding
				//either to include the value of to exclude the value

				else
					arr[i][j] = arr[i-1][j];		
			 }	
		}
		return arr[weight.length][val.length];
	}
}