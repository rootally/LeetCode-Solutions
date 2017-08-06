public class Solution 
{
	public int numTrees(int n)
	{
		int[] dp = new int[n+1];
		dp[0] = 0; dp[1] = 1;

		for (int i=2; i<=n ;i++ )
		{
			for (int j=1 ;j <=i ;j++ )
			 {
				dp[i] = dp[j-1] * dp[i-j];		
			 }	
		}
		return dp[n];
	}
}

These Numberes are called Catalan Numbers - 1,1,2,5....
They also give the no. of parathensis combination possible for a given n - ()()(), (())(), ()(()), ((())), (()())
-----------------------------------------------------------------
Explanation
-----------------------------------------------------------------
G(n) = F(1, n) + F(2, n) + ... + F(n, n). 
Particularly, the bottom cases, there is only one combination to construct a BST out of a sequence of length 1 (only a root) or 
0 (empty tree).
i.e.

G(0)=1, G(1)=1. 
Given a sequence 1…n, we pick a number i out of the sequence as the root, then the number of unique BST with the specified root F(i), 
is the cartesian product of the number of BST for its left and right subtrees. For example, F(3, 7): the number of unique BST tree with number
3 as its root. To construct an unique BST out of the entire sequence [1, 2, 3, 4, 5, 6, 7] with 3 as the root, which is to say, we need to 
construct an unique BST out of its left subsequence [1, 2] and another BST out of the right subsequence [4, 5, 6, 7], and then combine them
 together (i.e. cartesian product). The tricky part is that we could consider the number of unique BST out of sequence [1,2] as G(2), and the
  number of of unique BST out of sequence [4, 5, 6, 7] as G(4). Therefore, F(3,7) = G(2) * G(4).

