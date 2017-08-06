
import java.util.*;

public class HashMap {

	 public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		HashSet defaultInput = new HashSet(Arrays.asLists("Java","C++"));// copying content

		hm.put(21,"Twenty One");
		hm.put(22,"Twenty Two");

		// Reterivig value from hash map!
		
		int key =21;

		String show = hm.get(key);

		System.out.print("Key ->" + key + "Value ->" + show);
		System.out.println();

		//Iteration!

		Iterator it = (hm.entrySet()).iterator();

		while (it.hasNext()) {

			Map.Entry entery = (Map.Entry)it.next();
			System.out.print("Key ->" + entery.getKey() + "Value ->" + entery.getValue());
			System.out.println();
		}

		//Size of map

		System.out.println("Map Size" + hm.size());

	  	hm.clear(); // Clears hash map!

	  	hm.put(21,"Twenty One");
		hm.put(22,"Twenty Two");

	  	//Containes Values

	  	System.out.println("Does hash map cointains key 21" + hm.containsKey(21));
	  	System.out.println("Does hash map cointains value 21" + hm.containsValue(21));

	  	//Checking empty or not
	  	System.out.println("Is map empty " + hm.isEmpty());

	  	//Removing objects
	  	hm.remove(21);

	}
	
}