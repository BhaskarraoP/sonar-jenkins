package com.firstcode;

public class Firstcode {

	static void armstrong(int n) {
		int temp=n,sum=0,r;
		while(n>0) {
		r=n%10;
		sum = (sum * 10)+r;
		n=n/10;
		System.out.println(n);
		}
		
		if(temp==sum) {
		  System.out.println("is prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	
	public static void main(String[] args) {
		int n = 454;
		armstrong(n);
	}

}
