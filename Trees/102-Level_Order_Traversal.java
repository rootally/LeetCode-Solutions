public class Solution
{
	public List<List<Integer>> levelOrder(TreeNode root)
	{
		Queue<Integer> queue = new LinkedList<>();
		List<List<Integer>> wraplist = new LinkedList<>();

		if(root== null)
			return ;

		queue.offer(root);

		while (queue.isEmpty())

		{
			int size = queue.size();
			List<Integer> sub = new LinkedList<>();

			for (int i=0; i<size; i++ )
			 {
			 	TreeNode node = queue.poll()
			 	if(node.left != null)
			 		queue.offer(node.left);
			 	if(node.right != null)
			 		queue.offer(node.right);

			 	sub.add(node.val);		
			 }

			 wraplist.add(sub);	
		}
		return wraplist;
	} 
}