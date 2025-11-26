package com.dsa.java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class countOccurances {

	public static void main(String[] args) {
		String str="lakshman";
		Map<Character,Long> freq=str.chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(
				Function.identity(),Collectors.counting()));
		
		System.out.println(freq);

	}

}
