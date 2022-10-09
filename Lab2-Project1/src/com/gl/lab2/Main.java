package com.gl.lab2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
	System.out.println("enter the size of transaction array");
	Scanner sc = new Scanner (System.in);
	int count = sc.nextInt();
	//create array
	int transactions[] = new int[count];
	//enter the values of array
	
	System.out.println("enter the values of transaction");
	for (int i=0; i<count; i++)
	{
		transactions[i] = sc.nextInt();
		
	}
	
	//enter the total no of targets that needs to be achieved

	System.out.println("enter the total no of targets that needs to be achieved");
	int targets = sc.nextInt();
	for (int j=0; j<targets; j++) {
		
	System.out.println("enter the value of target\r\n"
			+ "");
	int targetValue =  sc.nextInt();
	
	//search algorithm, if found print ,Target achieved after nth transactions 
	Search s1 = new Search();
	int ret = s1.search (targetValue, transactions);
	if (ret == -1) {
			System.out.println("Target not achieved");
	}
	else
	{
	System.out.println("Target achieved after transaction " + ret);
	}
	
	}
	
	
	
	
	
		
		
	}

}
