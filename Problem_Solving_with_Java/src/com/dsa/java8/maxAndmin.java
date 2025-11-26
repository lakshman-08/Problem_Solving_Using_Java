package com.dsa.java8;
import java.util.*;
public class maxAndmin {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,33,4,5);
	OptionalInt max=list.stream().mapToInt(i->i).max();
	OptionalInt min=list.stream().mapToInt(i->i).min();
    System.out.println(max.getAsInt() +" "+min.getAsInt());

	}

}
