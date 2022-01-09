package com.array.demo.interview;

import java.util.Arrays;

public class CheckingTwoArraysAreEqualsOrNot {
	public static void main(String[] args) {
		

	int a1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int a2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	boolean status=Arrays.equals(a1,a2);
	if(status==true) {
		System.out.println("Two Arrays are Equals");
	}
	if(status==false) {
		System.out.println("Two Arrays are not Equals");
	}
	}
}
