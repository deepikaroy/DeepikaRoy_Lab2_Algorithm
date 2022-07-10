package com.greatlearning.transactions;

public class TargetChecker 
{	
	static void checkTargetAchievement(int[] transactions, long target)
	{  
		int sum=0;
		for(int i=0; i<transactions.length; i++)
		{
			sum += transactions[i];
			if(sum>=target)
			{
				System.out.println("Target achieved after "+ (i+1) +" transactions");
				return;
			}
			else
			{
				continue;
			}
		}
		System.out.println("Given target is not achieved");
	}
}
