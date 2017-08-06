
#####################################
String.valueOf(int/boolean/char)
Integer.valueOf(String)
-------------------------------------------------------------------
example->

public class Test {

   public static void main(String args[]) {
      double d = 102939939.939;
      boolean b = true;
      long l = 1232874;
      char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };

      System.out.println("Return Value : " + String.valueOf(d) );
      System.out.println("Return Value : " + String.valueOf(b) );
      System.out.println("Return Value : " + String.valueOf(l) );
      System.out.println("Return Value : " + String.valueOf(arr) );
   }
}

Output
Return Value : 1.02939939939E8
Return Value : true
Return Value : 1232874
Return Value : abcdefg

#####################################################################
Java Program to use keySet(), entrySet() and values()
------------------------------------------------------------

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> priceMap = new HashMap<>();

        priceMap.put("TV", 500);
        priceMap.put("Phone", 200);
        priceMap.put("Car", 20000);
        priceMap.put("Bike", 6000);
        priceMap.put("Furniture", 700);

        System.out.println("price map: " + priceMap);

        Set<String> keys = priceMap.keySet();
        Collection<Integer> values = priceMap.values();
        Set<Entry<String, Integer>> entries = priceMap.entrySet();

        System.out.println("keys of Map : " + keys);
        System.out.println("values from Map :" + values);
        System.out.println("entries from Map :" + entries);

    }
}

Output:
price map: {Car=20000, Phone=200, Bike=6000, Furniture=700, TV=500}
keys of Map : [Car, Phone, Bike, Furniture, TV]
values from Map :[20000, 200, 6000, 700, 500]
entries from Map :[Car=20000, Phone=200, Bike=6000, Furniture=700, TV=500]

#################################################################################
BigInteger
------------------------------------------------------------------
import java.math.BigInteger;


public class BigIntegerDemo {

 

    public static void main(String[] args) {
         
        BigInteger b1 = new BigInteger("987654321987654321000000000");

       BigInteger b2 = new BigInteger("987654321987654321000000000");
         
        BigInteger product = b1.multiply(b2);
        BigInteger division = b1.divide(b2);
     
        System.out.println("product = " + product);
        System.out.println("division = " + division);  // prints 1
    
    }
}

#####################################################################################

 Java orogram to demonstrate working of Queue
 -----------------------------------------------------------------------------------
import java.util.LinkedList;
import java.util.Queue;
 
public class QueueExample
{
  public static void main(String[] args)
  {
    Queue<Integer> q = new LinkedList<>();
 
    // Adds elements {0, 1, 2, 3, 4} to queue
    for (int i=0; i<5; i++)
     q.add(i);
 
    // Display contents of the queue.
    System.out.println("Elements of queue-"+q);
 
    // To remove the head of queue.
    int removedele = q.remove();
    System.out.println("removed element-" + removedele);
 
    System.out.println(q);
 
    // To view the head of queue
    int head = q.peek();
    System.out.println("head of queue-" + head);
 
    // Rest all methods of collection interface,
    // Like size and contains can be used with this
    // implementation.
    int size = q.size();
    System.out.println("Size of queue-" + size);
  }
}
#################################################################################
 Java program to demonstrate working of  binarySearch() method 
 Parameters :
arr – the array to be searched
fromIndex – the index of the first element (inclusive) to be searched
toIndex - the index of the last element (exclusive) to be searched
key  – the value to be searched
 ---------------------------------------------------------------------------------

import java.util.Arrays;
 
public class GFG
{
    public static void main(String[] args)
    {

        byte byteArr[] = {10,20,15,22,35};
        char charArr[] = {'g','p','q','c','i'};
        int intArr[] = {1,2,3,4,5,6};
        double doubleArr[] = {10.2,15.1,2.2,3.5};
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
        short shortArr[] = {10,20,15,22,35};
 
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);
 
        byte byteKey = 22;
        char charKey = 'p';
        int intKey = 3;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;
 
        System.out.println(byteKey + " found at index = "    +Arrays.binarySearch(byteArr,2,4,byteKey));
        System.out.println(charKey + " found at index = "
                        +Arrays.binarySearch(charArr,1,4,charKey));
        System.out.println(intKey + " found at index = "
                        +Arrays.binarySearch(intArr,1,4,intKey));
        System.out.println(doubleKey + " found at index = "
                        +Arrays.binarySearch(doubleArr,1,4,doubleKey));
        System.out.println(floatKey + " found at index = "
                        +Arrays.binarySearch(floatArr,1,4,floatKey));
        System.out.println(shortKey + " found at index = "
                        +Arrays.binarySearch(shortArr,0,4,shortKey));
    }
}
Output:

22 found at index = 3
p found at index = 3
3 found at index = 2
1.5 found at index = -2
35.0 found at index = -5
5 found at index = -1
--------------------------------------------------------------------------------


###################################################################################
Tips!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
----------------------------------------------------------------------------------------------------
Note that we used '\n' instead of endl, 
because endl forces a flush, which is unnecessary in our case and significantly slows down our program, causing TLE in the second subtask.


######################################################################################
Modular Expotentation
---------------------------------------------------------------------------------
for a^b
#define MOD 1000000007
void fast_exp( int a, int b)
{
	if(b==0)
		//base case
		return 1;

	int x = fast_exp(a, b/2);

	x = (x*x)%MOD;// to avoid overflow

	if(b&1)
		//if b is odd then we compensate 1 power by multiplying it!
		x = x*a;

	return x;
}



###############################################################