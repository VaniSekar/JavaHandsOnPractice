package com.vani.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
	private static OrderManager orderManager;
	private static List<Integer> orderList = new ArrayList<Integer>();

	public OrderManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static OrderManager getInstance() {
		if (orderManager == null) {
			orderManager = new OrderManager();
		}
		return orderManager;

	}

	public List<Integer> addOrder(Order order) {
		orderList.add(order.getId());
		return orderList;
	}

	public List<Integer> eodReport() {
		System.out.println("the list of Orders for the day"+orderList);

		return orderList;
	}

	public List<Integer> resetReport() {
		System.out.println("Report resetted");
		return new ArrayList<Integer>();
	}

	public Integer maxOrder() {
		int maxOrder = orderList.get(0);
		for (int i = 0; i < orderList.size(); i++) {
			if (maxOrder <= orderList.get(i)) {
				maxOrder = orderList.get(i);
			}

		}
System.out.println("the maximum Order"+maxOrder);
		return maxOrder;
	}

	public Integer minOrder() {
		int minOrder = orderList.get(0);
		for (int i = 0; i < orderList.size(); i++) {
			if (minOrder >= orderList.get(i)) {
				minOrder = orderList.get(i);
			}

		}
		System.out.println("The minimum Order"+minOrder);
		return minOrder;

	}

}
