package com.gl.lab2.project2;

import java.util.Arrays;
import java.util.Scanner;

public class denominations {
	public static void main(String[] args) {
		
		
		
		System.out.println("Input number of denominations");
		
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		int[] denomination = new int[number]; 
		
		System.out.println("Input all the currency denominations");
		
		for (int i=0; i<number; i++)
		{
			
			denomination[i]  = sc.nextInt();
			
		}
		//denomination.sort;
		MergeSort M1 = new MergeSort ();  
		M1.mergeSort(denomination, 0, number-1);
	    System.out.println("Sorted Array:");
	    System.out.println(Arrays.toString(denomination));

		
		System.out.println("Input the amount that you want to pay");
		int amount = sc.nextInt();
		int reminder = amount;
		//System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j=denomination.length -1; j>=0; j--) {
		int division = reminder / denomination[j];
		reminder = reminder % denomination[j];
		
		}
		
		if (reminder ==0)
		{
		reminder = amount;
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j=denomination.length -1; j>=0; j--) {
		int division = reminder / denomination[j];
		if (division>0)
		{
			System.out.println(denomination[j] + ": " + division);
		}
		
		
		reminder = reminder % denomination[j];
		
		}
		}
		
				
		if (reminder > 0)
			System.out.println("Your amount cannot be exactly made");
		
		
	}

}
