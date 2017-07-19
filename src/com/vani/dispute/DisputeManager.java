package com.dovetailsystems.dispute;

public class DisputeManager {

	public DisputeManager() {
		// TODO Auto-generated constructor stub
	}

	public String manageDisputeTransaction(String originator, String vendor, String dispute) {
		DisputeTransaction disputeTransaction = new DisputeTransaction();
		return disputeTransaction.performDisputeTransaction(originator,vendor,dispute);

	}
}
