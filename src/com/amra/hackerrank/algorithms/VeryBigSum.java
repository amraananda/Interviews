package com.amra.hackerrank.algorithms;

import java.util.Scanner;

public class VeryBigSum {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		long[] arr = new long[n];
		for(int arr_i = 0 ; arr_i < n ;arr_i++){
			arr[arr_i] = input.nextLong();
		}
		input.close();
		long result = aVeryBigSum(n,arr);
		System.out.println(result);
	}

	static long aVeryBigSum(int n, long[] arr) {
		long bigSum = 0;
		for(int i =0 ; i< arr.length;i++){
			bigSum = bigSum + arr[i];
		}
		return bigSum;
	}

}
