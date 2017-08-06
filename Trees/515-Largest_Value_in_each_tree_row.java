public class Solution 
{
	public List<Integer> largestValues(TreeNode root)
	{
		List<Integer> ls = new ArrayList<Integer>();
		helper(root, ls, 0);
		return ls;		
	}

	private void helper(TreeNode root, List<Integer> ls , int level)
	{
		if(root== null)
			return 0;

		if(d == ls.size())
			ls.add(root.val)
		else
			ls.set(d, Math.max(ls.get(d), root.val))

		helper(root.left, res, d+1)
		helper(root.right, res, d+1)
	}

}

-----------------------------------------------------------------------------------------
Another Approach
-----------------------------------------------------------------------------------------

public class Solution 
{
	public List<Integer> largestValues(TreeNode root)
	{
		List<Integer> res = new ArrayList<>();

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root.val);

		while(!queue.isEmpty())
		{	
			int max = Integer.MIN_VALUE;
			int size = queue.size();
			for (int i=0; i< size() ;i++ )
			{
				TreeNode node = queue.poll();
				max = Math.max(max,node.val);

				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);

			}

			res.add(max);
		}
		return res;
	}
}
	












