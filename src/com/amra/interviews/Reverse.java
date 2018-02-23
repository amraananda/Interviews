package com.amra.interviews;

import java.util.Scanner;

public class Reverse {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string you want to reverese" );
		String input = scan.nextLine();
		String result = callReverseString(input);
		System.out.println("After reversing: "+result);
	}
	public static String callReverseString(String scannedInp){
		String[] strArr = scannedInp.split(" ");
		int lenght = strArr.length;
		/*//Without using Sting Buffer
		String amra = "";
		String[] strArr = scannedInp.split(" ");
		int lenght = strArr.length;
		
		for(int i = lenght - 1 ; i >= 0 ;i --){
			amra = amra + strArr[i] + " ";
		}
		return amra;
		*/
		StringBuilder revsb = new StringBuilder();
		for(int i = lenght - 1 ; i >= 0 ;i --){
			revsb.append(strArr[i]);
			revsb.append(" ");
		}
		return revsb.toString();
//		StringBuffer sb1 = new StringBuffer(scannedInp);
//		sb1.reverse();
//		amra = sb1.toString();
//		//amra = strArr[1]+" "+strArr[0];		
//		
//		return amra;
//		//return amra.substring(5);
	}
}



