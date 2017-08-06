public class Solution
{
	public boolean Predict_Win(int[] nums)
	{
		return helper(int[] nums, 0, nums.length-1)>=0
	}

	private helper(int[] arr, int s, int e)
	{
		return s==e ? arr[e] : Math.max(helper(arr, s+1 ,e), helper(arr, s, e-1))
	}
}