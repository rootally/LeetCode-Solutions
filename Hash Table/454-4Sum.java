public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

	Map<Integer, Integer> map = new HashMap<>();

	for (int i=0;i<A.length() ;i++ )
	{	
		for (int j=0;j<B.length ;j++ )
		{
			int sum = A[i] + B[j];
			map.put(sum, map.getOrDefault(sum,0)+1);
			//Storing all the possible combinations of sum of these 2 arrays and if same sum occurs more than once storing it's frequency!
		}
		
	}

	int res=0;
	for (int i=0;i<C.length() ;i++ )
	{	
		for (int j=0;j<D.length ;j++ )
		{
			int sum = C[i] + D[j];
			res+=map.getOrDefault(-1*sum,0);
			//Checking if -ve of this sum is stored in the map to make it zero and updating the result with the number of times the sum occured!
		}
		
	}
	//Above code will still work if the length of the all the 4 array's is different.
	return res;
}