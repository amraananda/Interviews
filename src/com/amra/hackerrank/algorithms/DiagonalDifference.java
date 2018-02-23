package com.amra.hackerrank.algorithms;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for(int a_i=0 ; a_i<n;a_i++){
			for(int a_j = 0;a_j<n;a_j++){
				a[a_i][a_j] = in.nextInt();
			}
		}
		in.close();
		
		//sum of primary and secondary diagonal
		//diagonal1 = a[0][0]+a[1][1]+a[2][2]
		//diagonal2 = a[0][2]+
		int result = diffOfDiagonal(n,a);
		System.out.println(result);
	}

	static int diffOfDiagonal(int n, int[][] a) {
		int diff = 0;
		int sum1 = 0;
		int sum2 = 0;
	
		for(int i=0;i < n ;i++){
			for(int j=0;j<n ;j++){
				if(i==j){
					sum1 = sum1 +a[i][j]; 
				}
				if(i+j==n-1){
					sum2 = sum2 + a[i][j];
				}
			}
		}
		System.out.println("D1 sum:"+sum1);
		System.out.println("D2 sum:"+sum2);
		diff = Math.abs(sum1-sum2);
		return diff;
	}

}
