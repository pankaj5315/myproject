package com.array.demo.interview;

public class SumOfelementInArray {
	public static void main(String[] args) {
		int a[] = { 5, 3, 2, 4, 6 };
		int sum = 0;
		int sum1 = 0;// this use for fore each loop
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		// And another way used For each loop
		for (int value : a) {
			sum1 = sum1 + value;

		}
		System.out.println(sum1);

	}

}
