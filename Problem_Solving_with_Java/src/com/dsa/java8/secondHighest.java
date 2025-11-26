package com.dsa.java8;
import java.util.*;
public class secondHighest {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,33,4,5);
		int secHighest=list.stream().
				sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.orElse(-1);
		
		System.out.println(secHighest);

	}

}
