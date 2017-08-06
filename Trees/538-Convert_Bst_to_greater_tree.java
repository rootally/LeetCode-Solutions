public class Solution
{
	public TreeNode GreaterTree(TreeNode t)
	{
		int sum=0;
		helper(t, sum);
	}

	private void helper(TreeNode root, sum)
	{
		if(root == null)
			return ;
		helper(root.right, sum);

		root.val += sum;
		sum = root.val;

		helper(root.left, sum);
	}
}