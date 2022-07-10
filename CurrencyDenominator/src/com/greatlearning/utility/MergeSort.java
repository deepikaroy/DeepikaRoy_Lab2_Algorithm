package com.greatlearning.utility;

public class MergeSort
{ 
	public static int[] sort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			int mid = start + (end - start)/2;		
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			arr = merge(arr, start, mid, end);
		}	
		
		return arr;
	}

	public static int[] merge(int[] arr, int start,int mid, int end)
	{
		// take 2 temp arrays and put the data from main array into these left and right arrays
		int[] left = new int[mid - start + 1];
		int[] right = new int[end - (mid +1 ) + 1];

		for(int i=0; i< left.length; i++)
		{
			left[i] = arr[start + i];
		}
		for(int i=0; i< right.length; i++)
		{
			right[i] = arr[mid+1 + i];
		}

		// merge the temp arrays
		int k = start; int i=0, j=0;
		while(i< left.length && j < right.length)
		{
			if(left[i] <= right[j] )
			{
				arr[k] = left[i]; i++;
			}
			else
			{
				arr[k] = right[j]; j++;
			}

			k++;
		}

		//copy the remaining elements of left and right array into main array
		while(i < left.length)
		{
			arr[k] = left[i]; i++; k++;
		}
		while(j < right.length)
		{
			arr[k] = right[j]; j++; k++;
		}
		
		return arr;
	}	
}
