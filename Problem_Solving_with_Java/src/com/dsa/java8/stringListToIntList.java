package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
public class stringListToIntList {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("1","2","3","4");
		List<Integer> intList=strList.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(intList);

	}

}
