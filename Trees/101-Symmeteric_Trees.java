public boolean isSymm(TreeNode root)
{
	return root == null || isSymmHelp(root.left, root.right); 
}

private boolean isSymmHelp(TreeNode left, right)
{
	if(left == null && right == null)
		return true;
	if(left == null || right== null || left!=right )
		return false;

	//Checking the sub nodes of the tree to be symm. && symbol is used because if any false statment is there it will 
	//automatically be rejected for the rest of the recurisve calls!

	 return (isSymmHelp(left.left, right.right) && isSymmHelp(left.right, right.left)); 
	 
}