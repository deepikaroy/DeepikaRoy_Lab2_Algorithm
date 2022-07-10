package com.greatlearning.transactions;

import java.util.Scanner;

public class TargetDriver 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the size of transaction array");
		int numOfTransactions = sc.nextInt();
		int[] transactions = new int[numOfTransactions];

		System.out.println("Enter the values of array");
		for(int i=0; i<numOfTransactions; i++)
		{
			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int numOfTargets = sc.nextInt();	 

		for(int i=0; i< numOfTargets; i++)
		{
			System.out.println("Enter the value of target");
			long target = sc.nextInt();
			TargetChecker.checkTargetAchievement(transactions, target);
		}
	}

	
}
