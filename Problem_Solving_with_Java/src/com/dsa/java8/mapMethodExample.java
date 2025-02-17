package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
public class mapMethodExample {

	public static void main(String[] args) {
		/*Map() Example */
		List<String> listValues=List.of("Satyanarayana","Ambarani","Kiran Kumar","Lakshman","Bhagya");
		List<Integer> listlen=listValues.stream().map(String::length).collect(Collectors.toList());
		listlen.forEach(System.out::println);
		
		/* flatMap() Example */
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("a", "b"),
				Arrays.asList("c", "d", "e"),
				Arrays.asList("f")
		);

		List<String> flattenedList = listOfLists.stream()
											.flatMap(Collection::stream) // Flatten the list of lists
											.collect(Collectors.toList());

		System.out.println("flatMap() Example:-"+flattenedList); // Output: [a, b, c, d, e, f]


	}

}
