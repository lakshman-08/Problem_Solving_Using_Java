package com.dsa.java8;

import java.util.*;
import java.util.stream.Collectors;

public class findDuplicates_01 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,1,2,3,6);
		Set<Integer> duplicates=values.stream().filter(i-> Collections.frequency(values,i)>1).collect(Collectors.toSet());
		
		System.out.println(duplicates);
		

	}

}
