public int numberOfBoomerangs(int[][] points) 
{
	int res=0;

	Map<Integer, Integer> map = new HashMap<>();
	for (int i=0;i<points.length();i++ )
	{
	  for (int j=0;j<points.length();j++ )
	   {
	  	 if(i==j)
	  	 	continue;

	  	 int d = getDistance(points[i],points[j]);
	  	 map.put(d,map.getOrDefault(d,0)+1);			
	   }

	   for(int val: map.values())
	   	res+=val*(val-1);
	   //Bacially doing NP2 generating permuation(with order) for j&k

	   	map.clear();
	   	// clearing the map after we have takey each case of j&k for their respective i;	
	}

	private int getDistance(int[] a,int[] b)
	{
		int dx=a[0]-a[1];
		int dy=b[0]-b[1];

		return dx*dx +dy*dy;
		//not square rooting the distance as it will take extra computation and approximation;
	}
}			