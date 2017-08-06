public class Solution {
    public String[] findWords(String[] words) {
 		
 		String []str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

 		Map<Character, Integer> map = new HashMap<>();

 		for (string w : str )
 		{
 			for (char c: str[i].toCharArray())
 			{
 				map.put(c,i);	
 			}
 		}

 		List<String> res = new LinkedList<>();

 		for (String w: words)
 		{
 			int index = map.get(w.toLoweCase().charAt(0));
 			for (char c: w.toLoweCase().toCharArray())
 			{
 				if(map.get(c)!=index)
 				{
 					index=-1;
 					break;
 				}
 			}
 			if(index!=-1)
 			{
 				res.add(w);
 			}	
 		}

 		return res.toArray(new String[0]);
 		//return res.toArray(new String[res.size()]);
 		//An another way of returning the linked list as an array! 

    }
}