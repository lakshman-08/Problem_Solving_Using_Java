
/*Problem No-438(Sliding Window Approach)
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

Example 1:
Input: s = "cbaebabacd", p = "abc"

Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

Example 2:
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:
1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */


package com.dsa.strings;
import java.util.*;

public class leetCode_438 {
	public List<Integer> findAnagrams(String s, String p) {


        HashMap<Character,Integer> hma=new HashMap<>();
        HashMap<Character,Integer> hmb=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        int l=0;

        for(int i=0;i<k;i++)
        {
            char ch=p.charAt(i);
            hmb.put(ch,hmb.getOrDefault(ch,0)+1);
        }

        for(int r=0;r<n;r++)
        {
        	//Intialise the value-Step 1
            char ch=s.charAt(r);
            hma.put(ch,hma.getOrDefault(ch,0)+1);

            //Checking the condition to remove the value and move the l for one step-step 2
            if(r-l==k)
            {
             char chl=s.charAt(l);
             hma.put(chl,hma.get(chl)-1);

             if(hma.get(chl)==0)
             {
                hma.remove(chl);
             }
             l++;
            }


            //Checking for Final answer-step 3 
            if(r-l+1==k)
            {
                if(valid(hma,hmb)==true)
                {
                  list.add(l);
                }
            }


        }
        return list;

        
    }


    public static boolean valid(HashMap<Character,Integer> hma,HashMap<Character,Integer> hmb){
        if(hma.size()!=hmb.size()){
            return false;
        }

        for(char key:hma.keySet())
        {
            if(!hmb.containsKey(key)){
                return false;
            }

            int a=hma.get(key);
            int b=hmb.get(key);

            if(a!=b){
                return false;
            }
        }
        return true;

    }
}
