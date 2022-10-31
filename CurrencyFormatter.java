package com.hacker.rank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public CurrencyFormatter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        // Write your code here.
	        Locale currentLocale = Locale.US;
	        //Currency currentCurrency = Currency.getInstance(currentLocale);
	        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	        //System.out.println(currentLocale.getDisplayName()); //French (France)
	        //System.out.println(currentCurrency.getDisplayName());   //Euro
	        //System.out.println(currencyFormatter.format(payment)); 
	        System.out.println("US: " + currencyFormatter.format(payment));
	        
	        currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
	        System.out.println("India: " + currencyFormatter.format(payment));
	        
	        currentLocale = Locale.CHINA;
	        //currentCurrency = Currency.getInstance(currentLocale);
	        currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	        System.out.println("China: " + currencyFormatter.format(payment));
	        
	        currentLocale = Locale.FRANCE;
	        //currentCurrency = Currency.getInstance(currentLocale);
	        currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	        System.out.println("France: " + currencyFormatter.format(payment));
	        scanner.close();
        
        
	}

}
