package com.dsa.virtusapratice;

public class rotateLeftArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int k=2;
		
		leftRotate(arr, k);
		for(int results:arr)
		{
			System.out.print(results+" ");
		}
	

	}
	
	public static void revereArray(int[] arr,int start,int end) {
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void leftRotate(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		
		//reverse first two elements
		revereArray(arr,0,k-1);
		
		//reverse remaining elements
		revereArray(arr,k,n-1);
		
		//reverse remaining all elements
		revereArray(arr, 0, n-1);
		
		
	}

}
