package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class containsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                return true;
            }
            else{
                hm.put(nums[i],i);
            }
            
          
        }
          return false;
    }

}
