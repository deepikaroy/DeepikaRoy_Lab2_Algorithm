package com.greatlearning.currency;

import java.util.Scanner;

public class CurrencyDriver
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the size of currency denominations");
		int numOfCurrencyDenominations = sc.nextInt();
		int[] denominations = new int[numOfCurrencyDenominations];

		System.out.println("Enter the currency denominations value");
		for(int i=0; i<numOfCurrencyDenominations; i++)
		{
			denominations[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		CurrencyDenominationsCalculator.calculateDenominations(denominations, amount);
	}

}
