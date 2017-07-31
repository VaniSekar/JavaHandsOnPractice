package com.vani.transaction;

import com.vani.dispute.DisputeManager;

public class TransactionManager {

	public TransactionManager() {

	}

	public void manageTransaction(String originator,String vendor,String amount,String currencySymbol){
		Transaction transaction = new Transaction();
		String fwdString = transaction.performTransaction(originator,vendor,amount,currencySymbol);
		if(fwdString.equalsIgnoreCase("Success")){
			System.out.println("The Transaction was Successfull");
		}
		else{
			String dispute = "failed Transaction";
			DisputeManager disputeManager = new DisputeManager();
			String disputeStatement = disputeManager.manageDisputeTransaction(originator,vendor,dispute);
			System.out.println("...>"+disputeStatement);
		}

	}


}
