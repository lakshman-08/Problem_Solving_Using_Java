package com.dsa.strings;
import java.util.*;
public class rotateString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String goal=sc.next();
		boolean result=rotateString(s,goal);
		System.out.println(result);
		

	}
	public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) 
            return false;
        
        String temp=s+s;
        for(int i=0;i<s.length();i++)
        {
            if(temp.substring(i,s.length()+i).equals(goal)){
                return true;
            }
        }
        return false;
        
    }
}
