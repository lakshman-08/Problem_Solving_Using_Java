package com.dsa.java8;
import java.util.*;
import java.util.stream.Collectors;
//Q3-given list of integers,find duplicate integers using stream functions.
public class Top_25_Imp_Question_5 {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(10,20,50,55,45,65,43,45,65,43);
		Set<Integer> set=new HashSet<>();
		nums.stream().filter(num->!set.add(num)).forEach(System.out::println);
		
		//Q6-given list of integers,find max and min integers using stream functions.

		Optional<Integer> max= nums.stream().max(Integer::compareTo);
		Optional<Integer> min= nums.stream().min(Integer::compareTo);
		
		System.out.println(max.orElse(null)+" "+min.orElse(null));
		
		
		//Q7-given list of integers,sort the integers using stream functions-asked in accenture Interview.
        nums.stream().sorted().forEach(System.out::println);
        
      //Q8-given list of integers,sort the integers in descending order using stream functions-asked in accenture Interview.
        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        //Q9-check whether array contains duplicate value
        int[] arr= {1,2,5,1,2,4,5,8,7};
        if(Arrays.stream(arr).distinct().count()!=arr.length)
        {
        	System.out.println("It contains duplicate");
        	
        }
        else {
        	System.out.println("It is unquie");
        }
        
        //Q10-write Java 8 program to perform square on list elements and filter numbers greater than 50.
        nums.stream().map(num->num*num).filter(num->num>50).forEach(System.out::println);
       
				
	}

	
}
