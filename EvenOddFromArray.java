package com.array.demo.interview;

public class EvenOddFromArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		System.out.println("Even Number are ");
		for (int i = 1; i < a.length; i++) {
			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}
			
		}
		System.out.println("Odd Number are ");
		for(int i=1;i<a.length;i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}

		}
		//use for each loop
	/*	for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}*/
		

	}

}
