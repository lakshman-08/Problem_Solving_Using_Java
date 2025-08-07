package com.dsa.arrays;
//Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]),
//such that 0 <= i < j < n and nums[i] < nums[j].
//Return the maximum difference. If no such i and j exists, return -1.
//Example 1:
//Input: nums = [7,1,5,4]
//Output: 4
//Explanation:
//The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
//Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.

//Example 2:
//Input: nums = [9,4,3,2]
//Output: -1
//Explanation:
//There is no i and j such that i < j and nums[i] < nums[j].

//Example 3:
//Input: nums = [1,5,2,10]
//Output: 9
//Explanation:
//The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.
public class leetCode_2016 {
	 public int maximumDifference(int[] nums) {
	        //Brute Force Approach
	        // int n=nums.length;
	        // int diff=0;
	        // int ans=0;
	        // for(int i=0;i<n;i++)
	        // {
	        //     for(int j=i+1;j<n;j++)
	        //     {
	        //         if(nums[i]<nums[j])
	        //         {
	        //             diff=nums[j]-nums[i];
	        //             ans=Math.max(diff,ans);
	        //         }
	        //     }
	        // }

	        // if(ans==0)
	        // {
	        //     return -1;
	        // }

	        // return ans;


	        //o(n) approach
	        int n=nums.length;
	        int min=nums[0];
	        int max=-1;
	        for(int i=1;i<n;i++)
	        {
	            int val=nums[i];
	            if(min<val)
	            {
	                max=Math.max(max,val-min);
	            }

	            min=Math.min(min,val);
	        }

	        return max;
	        
	    }
}
