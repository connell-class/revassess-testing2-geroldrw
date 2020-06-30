package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr == null)
		{
			return 0;
		}
		if (arr.length > 0)
		{
			Integer total = 0;
			for (int i = 0; i < arr.length; i++)
			{
				total += arr[i];
			}
			return total;
		}else {
			
			return 0;
		}
		
	}
}
