package com.swapnumber.demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number");
		int num = scanner.nextInt();
		int count=0;
		if(num>1) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("The no is Prime Number");
			
		}
		else {
			System.out.println("This no is Not Prime no");
		}

	}
	}
}
