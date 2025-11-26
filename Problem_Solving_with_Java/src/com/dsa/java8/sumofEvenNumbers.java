package com.dsa.java8;
import java.util.*;
public class sumofEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		int sum=list.stream().filter(i->i%2==0).map(i->i*i).reduce(0, Integer::sum);
		System.out.println(sum);

	}

}
