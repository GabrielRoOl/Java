package stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Intermediary: filter, map, flatmap, peek, distinct, sorted, skip, limit(*)
		// Terminals: forEach, forEachOrdered, toArray, reduce, collect, min, max,
		// count, anyMatch(*), allMatch(*), noneMatch(*), findFirst(*), findAny(*)

		List<Integer> list = Arrays.asList(3, 5, 6, 10, 8);

		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));

		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob").map(x -> x.toUpperCase());
		System.out.println(Arrays.toString(st2.toArray()));

		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));

		Stream<Long> fib = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(fib.limit(10).toArray()));

	}

}
