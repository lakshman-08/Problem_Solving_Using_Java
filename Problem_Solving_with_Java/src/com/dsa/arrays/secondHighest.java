package com.dsa.arrays;

import java.util.*;

public class secondHighest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int al=sc.nextInt();
		int[] a=new int[al];
		for(int i=0;i<al;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Set<Integer> set=new TreeSet<>();
		for(int result:a)
		{
			set.add(result);
		}
		
		List<Integer> list=new ArrayList<>(set);
		System.out.println(list.get(list.size()-2));

	}

}
