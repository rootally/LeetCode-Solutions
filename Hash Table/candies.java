import java.util.*;

public class candies {
    public int distributeCandies(int[] candies) {
        
    HashSet<Integer> set = new HashSet <Integer>();

    for (int candy:candies ) {
    	set.add(candy);
    }

    	return Math.min(set.size(),candies.length/2);

    }
    

    
};
