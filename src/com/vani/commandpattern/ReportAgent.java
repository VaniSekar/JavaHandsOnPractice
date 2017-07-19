package com.vani.commandpattern;

public class ReportAgent {

	private IReportCommand command;

	public ReportAgent() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(IReportCommand command){
		this.command = command;
		
	}
	
	public void runReport(){
		command.execute();
	}

}
