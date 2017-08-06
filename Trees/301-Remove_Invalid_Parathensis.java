public class Solution {
    public List<String> removeInvalidParentheses(String s) 
    {
    	List<Integer> ans = new ArrayList<>();

    	remove(s, ans, 0, 0, new char[]{ '(', ')'})    
    }
}