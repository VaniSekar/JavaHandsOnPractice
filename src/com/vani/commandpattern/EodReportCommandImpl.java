package com.vani.commandpattern;

public class EodReportCommandImpl implements IReportCommand {
	OrderManager orderManager;

	public EodReportCommandImpl(OrderManager orderManager) {
		this.orderManager = orderManager;
	}

	@Override
	public void execute() {
		orderManager.eodReport();
	}

}
