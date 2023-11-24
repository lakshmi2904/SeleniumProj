package com.selenium.pack1;

public class NestedExpl {

	public static void main(String[] args) {
		
		int  max_translimit = 3 ;
		int Max_amountpertrans = 10000;
		
		if(1<=max_translimit) {
		
			
		System.out.println("enter amount");
		
		if(5000<=Max_amountpertrans) {
		
		System.out.println("cash out");
		
		}else {
			
			System.out.println("max amount withdraw should be less than 10k only");
		}
			

	}else {
		
		System.out.println("max transections per day excceded");
	}

}
}