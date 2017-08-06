public class Solution
{
	public int LPalin(char[] str, i, j)
	{
		if(i==j)
			return 1;
		//if there is only 1 char left

		if(str[i]==str[j] && i+1==j)
			return 2;
		//if there is only 2 char left and next to each other

		//Above to conditions handle all the even and all the odd cases

		if(str[i]==str[j])
			return 2 + LPalin(str, i+1, j-1);
		//if first and last char match proced further

		return Math.max(LPalin(seq, i, j-1), LPalin(seq, i+1, j));
		//if first or last char don't match

	}
}
------------------------------------------------------------------------------------
Another Recursive Approach
------------------------------------------------------------------------------------
 public int calculateRecursive(char str[],int start,int len){
        if(len == 1){
            return 1;
        }
        if(len ==0){
            return 0;
        }
        if(str[start] == str[start+len-1]){
            return 2 + calculateRecursive(str,start+1,len-2);
        }else{
            return Math.max(calculateRecursive(str, start+1, len-1), calculateRecursive(str, start, len-1));
        }
    }

---------------------------------------------------------------------------------------
Dynamic Approach
---------------------------------------------------------------------------------------

public class LPS
{
	public int helper(char[] str)
	{
		int[][] arr = new int [str.length][str.length];

		for (int i=0;i<str.length ;i++ )
		 {
			arr[i][j] = 1;
			//We are taking each char in a string as a single char is itself a pallindrome of len 1	
		 }

		 for (l =2 ;l<= str.length ;l++ )
		 {	
		 	for (int i=0; i<str.length - l + 1 ;i++ )
		 	 {
		 		int j = i + l - 1
		 		// j is calcualted to get the required substring for processing

		 		if(l==2 && str[i]==str[j])
		 			arr[i][j] = 2;
		 		// if there are only 2 chars next to each other
		 		if( str[i] == str[j])
		 			arr[i][j] = (2 + arr[i-1][j-1])
		 		//if the chars match then get the max value of obtained from the inner string 
		 		
		 		else
		 			arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
		 			// if the chars don't match then we get the max vaue 2 choice either by skipping the first or the last letter 		
		 	 }	
		 }
		 return arr[0][str.length];
	}
}