package com.dsa.java8;
import java.util.*;
//Q2-given list of integers find the first element in the list using stream functions.
public class Top_25_Imp_Question_2 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,50,55,45);
		nums.stream().findFirst().ifPresent(System.out::print);

	}

}
