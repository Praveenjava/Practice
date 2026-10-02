package in.string;

import java.util.HashMap;
import java.util.IdentityHashMap;

//=> HashMap will use equals ( ) method to compare content of keys to find duplicate keys

//=> IdentityHashMap will use == operator to compare address of keys to find duplicate keys

public class Demo4 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();

		// HM will compare content of keys to find duplicate keys (equals())

		hm.put("ashok", 101); // 1 entry added
		hm.put("raja", 102); // 1 entry added
		hm.put("rani", 103); // 1 entry added
		hm.put(new String("ashok"), 104); // it will replace first entry value bcz key is duplicae
		hm.put("ashok", 105);

		System.out.println("HM - Size :: " + hm.size());
		System.out.println(hm);

		System.out.println("=================");
		
		IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();

		// IHM will compare address of keys to find duplicate keys (==)

		ihm.put("ashok", 101); // 1 entry added (scp)
		ihm.put("raja", 102); // 1 entry added
		ihm.put("rani", 103); // 1 entry added
		ihm.put(new String("ashok"), 104); // 1 entry added
		ihm.put("ashok", 105); // it will replace first entry value

		System.out.println("IHM - Size :: " + ihm.size());
		System.out.println(ihm);
	}
}
