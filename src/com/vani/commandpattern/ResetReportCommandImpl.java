package com.vani.commandpattern;

public class ResetReportCommandImpl implements IReportCommand {
	OrderManager orderManager;
	public ResetReportCommandImpl(OrderManager orderManager)  {
	this.orderManager = orderManager;
	}

	@Override
	public void execute() {
		orderManager.resetReport();
	}

}
