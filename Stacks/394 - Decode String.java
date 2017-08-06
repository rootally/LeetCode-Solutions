public class Solution {
    public String decodeString(String s) 
    {
    	String str = '';
    	Stack<String> str = new Stack<>();
    	Stack<Integer> count = new Stack<>();

    	int end =0;

    	while (end<s.length())
    	 {
    		if(Character.isDigit(s.charAt(end)))
    		{
    			int count =0;
    			while(Character.isDigit(s.charAt(end)))
    			{
    				count = count*10 + (s.charAt(end) - '0');
    				end++;
    			}
    			count.push(count);  
    		}

    		else if (s.charAt(end)=='[')
    		{
    			str.push(res);
    			str = '';
    			end++;
    		}

    		else if(s.charAt(end) == ']')
    		{
    			StringBuilder temp = new StringBuilder(str.pop());
    			int repeat = count.pop();

    			for (int i=0;i<repeat ;i++ )
    			{
    				temp.append(res);	
    			}

    			res = temp.toString();
    			end++;
    		}

    		else
    		{
    			res + = s.charAt(end);
    		}

    	 }
    	 return res;    
    }
}