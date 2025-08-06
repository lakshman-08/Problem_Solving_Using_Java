package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
//Q3-given list of integers,find duplicate integers using stream functions.
public class Top_25_Imp_Question_5 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,50,55,45,65,43,45,65,43);
		Set<Integer> set=new HashSet<>();
		nums.stream().filter(num->!set.add(num)).forEach(System.out::println);
	}

}
