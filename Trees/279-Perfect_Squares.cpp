 class Solution
{
	private:
		int isSquare(int n)
		{
			int sqrt_n = int(sqrt(n));
			return (squrt_n * squrt_n == n) ;
		}

	public:
		{
			//Based on the fermat's solution there are only 4 solutions 1,2,3,4
			int numSquares(int n)
			{
				if(isSquare(int n))
					return 1;
			}

			//If a number is a form of 4^k(8m+7), then the result is 4
			while((n&3)==0)
			{
				n >> = 2;
			}

			if((n&7)==7)
				return 4;

			int squrt_n = int(sqrt(n));

			for (int i = 1; i < =squrt_n; ++i)
			{
				if(isSquare(n-i*i))
					return 2;

			}
			return 3;
		} 

};

------------------------------------------------------------------------------------------------------
BFS Solution
------------------------------------------------------------------------------------------------------
class Solution
{
public:
	int numSquares(int n)
	{
		if(n<=0)
			return 0;

		vector<int> perfectSquares(n);
		//Contains perfect squares smaller or equal to n
		vector<int> countperfectsquares(n);
		//least number of perfect squares to reach i

		//Get all perfect sqaures equal or smaller than n

		for (int i = 0; i*i <= n; ++i)
		{
			perfectSquares.push_back(i*i);
			countperfectsquares[i*i-1]=1;
		}

		//if n is a perfect sqaure number return it immediately

		if(perfectSquares.back()==n)
			return 1;

		// Consider a graph which consists of number 0, 1,...,n as
        // its nodes. Node j is connected to node i via an edge if  
        // and only if either j = i + (a perfect square number) or 
        // i = j + (a perfect square number). Starting from node 0, 
        // do the breadth-first search. If we reach node n at step 
        // m, then the least number of perfect square numbers which 
        // sum to n is m. Here since we have already obtained the 
        // perfect square numbers, we have actually finished the 
        // search at step 1.
        queue<int> searchQ;
        for (auto& i : perfectSquares)
        {
            searchQ.push(i);
        }
        
        int currCntPerfectSquares = 1;
        while (!searchQ.empty())
        {
            currCntPerfectSquares++;
            
            int searchQSize = searchQ.size();
            
            for (int i = 0; i < searchQSize; i++)
            {
                int tmp = searchQ.front();
                // Check the neighbors of node tmp which are the sum 
                // of tmp and a perfect square number.
                for (auto& j : perfectSquares)
                {
                    if (tmp + j == n)
                    {
                        // We have reached node n.
                        return currCntPerfectSquares;
                    }
                    else if ((tmp + j < n) && (cntPerfectSquares[tmp + j - 1] == 0))
                    {
                        // If cntPerfectSquares[tmp + j - 1] > 0, this is not 
                        // the first time that we visit this node and we should 
                        // skip the node (tmp + j).
                        cntPerfectSquares[tmp + j - 1] = currCntPerfectSquares;
                        searchQ.push(tmp + j);
                    }
                    else if (tmp + j > n)
                    {
                        // We don't need to consider the nodes which are greater ]
                        // than n.
                        break;
                    }
                }
                
                searchQ.pop();
            }
        }
        
        return 0;

	}
}