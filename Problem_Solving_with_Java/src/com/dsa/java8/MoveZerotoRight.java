package com.dsa.java8;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerotoRight {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,0,-3,5,-2,0,8,0,-4);
		List<Integer> collectedNumbers=Stream.concat(numbers.stream().filter(n-> n!=0), 
				numbers.stream().filter(n -> n==0)).collect(Collectors.toList());
		
		System.out.println(collectedNumbers);
		
	}

}
