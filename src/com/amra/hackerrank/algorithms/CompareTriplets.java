package com.amra.hackerrank.algorithms;

import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a0 = input.nextInt();
		int a1 = input.nextInt();
		int a2 = input.nextInt();
		int b0 = input.nextInt();
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		input.close();
		int[] result = solve(a0,a1,a2,b0,b1,b2);
		for(int i=0 ; i < result.length;i++){
			System.out.println(result[i]+ (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");
	}

	 static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] arrResult = {0,0};
		int[] a = {a0,a1,a2};
		int[] b = {b0,b1,b2};
		
		//Compare the results of A & B
		for(int i=0;i<3;i++){
			if(a[i] > b[i]){
				arrResult[0] = arrResult[0]+1;
			}else if(a[i] < b[i])
				arrResult[1] = arrResult[1]+1;
			//System.out.println(arrResult);	
		}
		return arrResult;
	}
}
