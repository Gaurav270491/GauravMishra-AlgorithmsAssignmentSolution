package com.greatlearning.service;

import java.util.Collections;
import java.util.List;

public class Service {

	public void sortAcscending(List<Double> stkList) {
		Collections.sort(stkList);
		System.out.println("Stock prices in ascending order are :  " + stkList.toString());

	}

	public void sortDescending(List<Double> stkList) {
		Collections.sort(stkList);
		Collections.reverse(stkList);
		System.out.println("Stock prices in descending order are :  " + stkList.toString());

	}

	public boolean searchStock(List<Double> stkList, Double stock) {
		return stkList.contains(stock);

	}
}
