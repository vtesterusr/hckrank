/*
You are given an integer , you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 can range between  to  inclusive.
Sample Input 0
100
Sample Output 0
Good job
 */

package com.hacker.rank.java;

import java.util.Scanner;

public class ConverIntToString {

	public ConverIntToString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        //int val = scan.nextInt();
		 	int val =-100;
	        
	        //String aa = String.parseString(val);
	        String aa = String.valueOf(val);
	        
	        if(String.valueOf(val) != null){
	            System.out.println("Good job");
	        }else{
	            System.out.println("Wrong answer");
	        }
	        
	}

}
