public class solution 
{
	public int minDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		int left =  minDepth(root.left);
		int right = minDepth(root.right);
		//At each node we are storing it's value of L and R recursively and the parent node gets the min val of L and R respectively!

		return (left==0 || right ==0 )? left + right +1 : Math.min(left, right) + 1;

		//if only one of the left and right are null then we send the additive of L and R because min will always be zero ad it will not make sense because 0 is clearly not the min depth in that case
	}
}


---------------------------------------------------------------
c++ solution
---------------------------------------------------------------

class solution {
	public :

	int minDepth(TreeNode root)
	{
		if(!root)
			return 0;
		if(!root->left) 
			return 1 + minDepth(root->right);
		//doing for the parents whose one of the child node's are not present to recursively travel the tree just like the same concept if one of the L or R is zero
		if(!root->right)
			return 1+ minDepth(root->left);
		//just like abobe the math min fuction for the parents whose child nodes are not zero
		return 1 + min(minDepth(root->left), minDepth(root->right));
	}
}