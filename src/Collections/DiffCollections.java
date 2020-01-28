package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class DiffCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List mut=new Vector();
		mut.add(0,"1");
		
		System.out.println(mut.get(0));
		
		
		
		
		
		List<String> muthuList = new ArrayList<String>();
		muthuList.add("muthu");

		muthuList.get(0);
		muthuList.set(0, "kumar");

		Set<String> muthuSet = new TreeSet<String>();

		muthuSet.add("muthu");
		muthuSet.add("kumar");

		Iterator it = muthuSet.iterator();
		while (it.hasNext()) {

			System.out.println(it.next().toString());
		}
		
		Map<Integer,String> muthuMap = new HashMap<Integer,String>();
		muthuMap.put(1,"muthu");
		muthuMap.put(0, "kumar");
		
	System.out.println(muthuMap.get(0));
	}

}
