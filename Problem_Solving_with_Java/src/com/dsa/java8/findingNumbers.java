package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;

/*Using filter() Method 
 * It is intermediate method like filter
 * The Program should be ended with terminary Method like collect()*/

public class findingNumbers {

	public static void main(String[] args) {
		List<Integer> list=List.of(11,12,52,63,54,78);
		List<Integer> evenValues=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		evenValues.forEach(System.out::println);

	}

}
