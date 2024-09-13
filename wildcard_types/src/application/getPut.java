package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObject = new ArrayList<>();

		copy(myInts, myObject);
		printList(myObject);
		
		copy(myDouble, myObject);
		printList(myObject);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
