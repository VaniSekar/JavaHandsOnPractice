package com.vani.transaction;

import java.util.Scanner;

public class TransactionClient {

	public TransactionClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  String originator = "";
		  String vendor = "";
		  String amount = "";
		  String currencySymbol = "";
		  TransactionManager transactionManager = new TransactionManager();  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Originator:");
		 originator = scanner.nextLine();
		//System.out.println("print the sample"+sample);
		System.out.println("Enter the Vendor:");
		 vendor = scanner.nextLine();
		System.out.println("Enter the Amount:");
		 amount = scanner.nextLine();
		System.out.println("Enter the CurrencySymbol:");
		 currencySymbol = scanner.nextLine();
		scanner.close();
		transactionManager.manageTransaction(originator,vendor,amount,currencySymbol);
	}

}
