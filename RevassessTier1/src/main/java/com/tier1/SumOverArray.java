package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr.length == 0)
		{
			return 0;
		}
		
		Integer total = 0;
		for (int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		return total;
	}
}
