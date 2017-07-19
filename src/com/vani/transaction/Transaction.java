package com.dovetailsystems.transaction;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	static List<String> transactionList = new ArrayList<String>();

	public String performTransaction(String originator,String vendor,String amount, String currencySymbol){
		
		StringBuilder stringBuilder = new StringBuilder();
		String fwdString = "Success";
		System.out.println("the Originator"+originator);
		stringBuilder.append(originator);
		stringBuilder.append("-");
		stringBuilder.append(vendor);
		stringBuilder.append("-");
		stringBuilder.append(amount);
		stringBuilder.append("-");
		stringBuilder.append(currencySymbol);
		System.out.println("the appended String"+stringBuilder.toString());
		transactionList.add(stringBuilder.toString());
		transactionList.add("Alen-Paypal-350-$");
		transactionList.add("Steve-Nextel-400-$");
		transactionList.add("John Smith-Vodafone-100-$");
		System.out.println("the transaction List"+transactionList);
		return fwdString;
	}
}
