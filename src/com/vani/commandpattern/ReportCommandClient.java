package com.vani.commandpattern;

import java.util.Random;

public class ReportCommandClient {

	public ReportCommandClient() {
	}

	public static void main(String[] args) {
		ReportAgent reportAgent = new ReportAgent();
		Order order = new Order();
		OrderManager orderManager = new OrderManager();
		IReportCommand resetReport = new ResetReportCommandImpl(orderManager);
		IReportCommand eodReport = new EodReportCommandImpl(orderManager);
		Random random = new Random();
		for(int i=0;i<=10;i++){
			order.setId(random.nextInt(100));
			orderManager.addOrder(order);
		}
		
	
		
		reportAgent.setCommand(eodReport);
		reportAgent.runReport();
		System.out.println(orderManager.maxOrder());
		System.out.println(orderManager.minOrder());
		reportAgent.setCommand(resetReport);
		reportAgent.runReport();
		
		

	}

}
