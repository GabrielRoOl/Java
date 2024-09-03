package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		/* set<T> don't accept repetitions
		 * They may have order, but not position
		 * Provides set operations: intersection, union, difference
		 * 
		 * HashSet: more fast, not ordered
		 * TreeSet: more slow, ordered
		 * LinkedHashSet: it's not fast, it's not slow, insertion order
		 * */
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tablet");
		set.add("Notebook");
		set.add("TV");
		set.add("Monitor");
		
		// set.remove("Tablet");
		// set.removeIf(x -> x.length() >= 3);
		// set.removeIf(x -> x.charAt(0) == 'T'); 
		
		
		for(String p : set) {
			System.out.println(p);
		}
		
		
	}

}
