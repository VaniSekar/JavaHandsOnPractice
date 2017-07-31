package com.vani.dispute;

import java.util.ArrayList;
import java.util.List;

public class DisputeTransaction {

	public DisputeTransaction() {
		// TODO Auto-generated constructor stub
	}
	static List<String> disputeList = new ArrayList<String>();
	public String performDisputeTransaction(String originator, String vendor, String dispute){
		
		if(disputeList!=null)
		for(int i=0;i<disputeList.size();i++){
			if(disputeList.get(i).contains(dispute)){
				return dispute;
			}
			else{
				disputeList.add(originator+"-"+vendor+"-"+dispute);
			}
			
		}
		
		
		return dispute;
	}

}
