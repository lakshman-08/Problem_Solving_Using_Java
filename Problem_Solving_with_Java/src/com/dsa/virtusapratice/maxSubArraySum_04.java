package com.dsa.virtusapratice;
/* - [ ]  **Maximum subarray sum (Kadane's Algorithm)**
    
    **Problem:** Find max sum of contiguous subarray.
    
    **Example:** [-2,1,-3,4,-1,2,1,-5,4] → 6*/
public class maxSubArraySum_04 {

	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int maxSum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(maxSum<sum)
			{
				maxSum=sum;
			}
			
			if(sum<0)
			{
				sum=0;
			}
		}
		
		System.out.println(maxSum);

	}

}
