package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvariantGenerics {

	public static void main(String[] args) {
		
//		List<?> myObjs = new ArrayList<Object>(); // ? is a supertype
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers; //--> does not work, case List<Object>

		List<Integer> myInts = Arrays.asList(5, 2, 10);
		
		printList(myInts);
		
		List<String> myStrings = Arrays.asList("maria", "julia");

		printList(myStrings);
	}
	
	public static void printList(List<?> list){ // using a type joker i can to this,
		// list.add(3); // but i can't insert it
		for(Object obj : list) {
			System.out.print(obj + " "); 	// printing any types
		}
	}

}
