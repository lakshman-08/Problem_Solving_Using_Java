package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
public class removeNulls {

	public static void main(String[] args) {
		
      List<String> values=Arrays.asList("Lakshman",null,"Sai","Bhagya",null);
      List<String> removedNulls=values.stream().filter(Objects::nonNull).collect(Collectors.toList());
      System.out.println(removedNulls);
	}

}
