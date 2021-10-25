package com.example.algopractice.Heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectRopes {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,11};
		int len=arr.length;
		
		mincostToConnectRopes(arr,len);
		
	}

	private static void mincostToConnectRopes(int[] arr, int len) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int totalCost=0;
		for(int e:arr)
		{
			pq.add(e);
		}
		
		int c=0;

		while(!pq.isEmpty())
		{
			int t1=0;
			int t2=0;
			if(pq.peek()!=null)
			{
			 t1=pq.remove();
			}
			 
			if(pq.peek()!=null)
			{
			t2=pq.remove();
			}
			int sum=t1+t2;
			totalCost+=sum;
			if(pq.peek()!=null)
			pq.add(sum);
		}
		
		System.out.println(totalCost);
	
		
	}
	
	
}
