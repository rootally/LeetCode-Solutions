 -------------------------------------------------------------------
 Unoptimized Space (m*n)
--------------------------------------------------------------------
 public class Solution
 {
 	public int minPathSum(int [][] grid)
 	{
 		int m = grid.length;
 		int n = grid[0].length;

 		int [][] dp = new int [m][n];

 		for (int i=1;i<m ;i++ )
 		{
 		 	dp[i][0] = grid[i][0] + dp[i-1][0];
 		}

 		// Making sum row, so that if person traverses through row all sum get added up
 		for (int i=1;i<n ;i++ )
 		{
 			dp[0][i] = dp[0][i-1] + grid[0][i-1];	
 		}

 		for (int i=1;i<m;i++ )
 		{
 			for (int j=1;j<n ;j++ )
 			 {
 				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1] ) + grid[i][j];
 				//Always finding the minnimum of side row and column and choosing it to make least sum;		
 			 }	
 		}

 		return dp[m-1][n-1];
 	}
 }

---------------------------------------------------------------------------------
Optimized Space 0(min(m,n))
---------------------------------------------------------------------------------

class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<int> cur(m, grid[0][0]);
        for (int i = 1; i < m; i++)
            cur[i] = cur[i - 1] + grid[i][0]; 
        for (int j = 1; j < n; j++) {
            cur[0] += grid[0][j]; 
            //the curr before updating contains row at every step;
            //we don't need the full matrix, we just need i-1 and j-1 which is provided by the curr;
            for (int i = 1; i < m; i++)
                cur[i] = min(cur[i - 1], cur[i]) + grid[i][j];
        }
        return cur[m - 1];
    }
};
