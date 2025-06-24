package com.dsa.arrays;
/*
 * Problem No-1004 Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined. */
public class maxConsecutiveOnes {
	public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
       int ans=0;
       int l=0;
       for(int r=0;r<nums.length;r++)
       {
           if(nums[r]==0){
               temp++;
           }
           
           while(temp>k)
           {
               if(nums[l]==0)
               {
                   temp--;
               }
               l++;
           }
           
           ans=Math.max(ans,r-l+1);
       }

        return ans;
    }
}
