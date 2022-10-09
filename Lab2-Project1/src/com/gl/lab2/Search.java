package com.gl.lab2;

public class Search {
	public int search (int search, int transactions[] ) {
		//transactions[0] > search
		//transactions[0] + transactions[1] > search
		int ret = -1;
		int temp = 0;
		if (transactions[0] >=search) {
			ret = 1;
			
			}
		else {
		for (int k=1; k<transactions.length; k++)
		{
			
			 temp = temp + transactions[k];
				if (temp  >=search) {
					ret = k;
					break;
					
				}
		}
		//return ret+1;
		}
		return ret;
		
		
		
		
	} 

}
