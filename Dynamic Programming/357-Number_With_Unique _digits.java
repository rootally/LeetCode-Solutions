public class Solution
{
	public int countNumberWithUnqiueDigits(int n)
	{
		if(n==0)
			return 1;

		int avaliable_digits = 9;
		int res =10 ;
		//Countains number of unique digits from 1 to 10
		int unique_digits = 9;

		while(n-- > 1 && avaliable_digits >0)
		{
			unique_digits = unique_digits*avaliable_digits;
			res+=unique_digits;
			avaliable_digits--;
			//decreaseing the unique digits at every step as they are being used at each loop
		}

		//f(2) =9*9
		//f(3) =9*9*8 
	} 
}