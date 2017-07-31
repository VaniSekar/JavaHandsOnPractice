package com.vani.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnyRandomDisputeManager {

	static List<String> disputes = new ArrayList<>();

	static {

		disputes.add("Not a valid userr");
		disputes.add("Insufficient fund");
		disputes.add("Invalid password");
		disputes.add("Success");
	}

	public static void main(String[] args) {
		System.out.println("the dispute String" + AnyRandomDisputeManager.getAnyRandomDispute());
	}

	/**
	 * This method selects and returns a Random dispute
	 * 
	 * @param dispute
	 *            A set of disputes are sent as input
	 * @return disputeString
	 */
	public static String getAnyRandomDispute() {
		Random random = new Random();

		return disputes.get(random.nextInt(disputes.size()));
	}

}
