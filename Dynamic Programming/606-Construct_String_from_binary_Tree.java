public class Solution
{
	public String tree2str(TreeNode t)
	{
		StringBuilder sb = new StringBuilder();
		helper(sb, t);
		return sb.toString();
	}

    private void helper(StringBuilder sb ,TreeNode root)
    {
    	if(root != null)
    	{
    		sb.append(root.val);
    		if(root.left != null || root.right != null)
    		{
    			sb.append("(");
    			helper(sb, root);
    			sb.append(")");

    			if(root.right != null)
    			{
    				sb.append("(");
    				helper(sb, root);
    				sb.append(")");
    			}
    		}
    	}
    } 
}