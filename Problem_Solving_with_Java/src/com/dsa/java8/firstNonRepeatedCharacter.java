package com.dsa.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class firstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str="swiss";
		Character result=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()))
				 .entrySet().stream()
			        .filter(e -> e.getValue() == 1)
			        .map(Map.Entry::getKey)
			        .findFirst()
			        .orElse(null);
                
		
		System.out.println(result);


	}

}
