/**
 * 
 */
package com.hacker.rank.java;

import java.util.Scanner;
/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string , print Yes if it is a palindrome, print No otherwise.
Constraints
 will consist at most  lower case english letters.
Sample Input
madam
Sample Output
Yes
 * 
 */


/**
 * @author vijendra
 *
 */
public class ReverseString {

	/**
	 * 
	 */
	public ReverseString() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String wd="";
        //System.out.println(word);
        //System.out.println(word.length());
        for(int i=word.length();i>0;i--){
            wd=wd+word.substring(i-1, i);
        }
        //System.out.println(wd);
        if(word.equalsIgnoreCase(wd)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
	}

}
