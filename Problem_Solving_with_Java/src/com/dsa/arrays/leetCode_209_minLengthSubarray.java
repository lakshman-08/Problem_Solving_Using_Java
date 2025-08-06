package com.dsa.arrays;
import java.util.*;
/*
 * 
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:
1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 */

public class leetCode_209_minLengthSubarray {
	
	public int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;
        int temp=0;
        int ans=Integer.MAX_VALUE;
        int l=0;
        
        for(int r=0;r<n;r++)
        {
            temp+=nums[r];
            
            while(temp>=target)
            {
                ans=Math.min(ans,r-l+1);
                temp=temp-nums[l];
                l++;
                
            }
        }

        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
        
    }

}
