package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
//Q3-given list of integers find the even and odd of elements present in the list using stream functions.
public class Top_25_Imp_Question_3 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,50,55,45,65,43);
		nums.stream().filter(num->num%2!=0).forEach(System.out::println);
		nums.stream().filter(num->num%2==0).forEach(System.out::println);
	}

}
