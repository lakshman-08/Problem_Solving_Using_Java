package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int al=sc.nextInt();
		int[] a=new int[al];
		
		
		
		for(int i=0;i<al;i++)
		{
			a[i]=sc.nextInt();
		}
		int bl=sc.nextInt();
		int[] b=new int[bl];
		
		for(int i=0;i<bl;i++)
		{
			b[i]=sc.nextInt();
		}
		int cl=al+bl;
		int[] c=new int[cl];
		System.arraycopy(a, 0, c, 0, al);
		System.arraycopy(b, 0, c, al, bl);
		
		System.out.print(Arrays.toString(c));

	}

}
