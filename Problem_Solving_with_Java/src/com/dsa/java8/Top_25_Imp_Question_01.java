package com.dsa.java8;
import java.util.*;
//Q1-given list of integers to find the total number of elements present in a list using stream functions.
public class Top_25_Imp_Question_01 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,50,55,45);
		long count=nums.stream().count();
		System.out.println(count);

	}

}
