package com.greatlearning.currency;

import java.util.Arrays;
import com.learning.utility.MergeSort;

public class CurrencyDenominationsCalculator 
{
	public static void calculateDenominations(int[] denominations, int amount)
	{
		int length = denominations.length;
		
		MergeSort.sort(denominations, 0,length-1);
				
		int amountLeft = amount;
		int[] currencyCounter = new int[length];
		
		try
		{
			for(int i=currencyCounter.length-1; i>=0; i--)
			{	
				if(amountLeft >= denominations[i])
				{
					currencyCounter[i] = amountLeft/denominations[i];
					amountLeft= amountLeft - (currencyCounter[i] * denominations[i]);
				}
			}

			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=currencyCounter.length-1; i>=0; i--)
			{
				if(currencyCounter[i] > 0)
					System.out.println(denominations[i] + " : " + currencyCounter[i]);				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception occured: " + ex);
		}
	}
}
