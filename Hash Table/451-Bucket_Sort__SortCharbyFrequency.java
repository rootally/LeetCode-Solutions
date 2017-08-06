public String frequencySort(String s) 
{
	if(s.length()<3)
		return s;

	int max=0;

	int[] freq = new int[26];
	//creating an array to store the frequecy of the letter

	for (char c:s.toCharArray)
	{
		freq[c-'a']++;
		max=Math.max(max,freq[c-'a']);
		//finding the max frequency of the letter
	}

	String[] buckets = new String[max+1];
	//creating buckets equivalent to max frequency of letter, to store them accordingly in their respective occurence 

	for (int i=0;i<26;i++)
	{
		String str = buckets[freq[i]];
		if(freq[i]>0)
			buckets[freq[i]] = str==NULL ? "" + (char)(i+'a') : str + (char)(i +'a');
			//joining chars in the same bucket	
	}

	StringBuilder strr = new StringBuilder();
	for (int i=max; i>0 ;i++)
	{
		if(buckets[i]!=NULL)
		for (char c: buckets[i].toCharArray())
		{
			for (int j=0;j<i;j++)
			{
				strr.append(char c);
				//appending th char in descending order, int number of times they occured!
			}
		}
	}

	return strr.toString();

}