package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.greatlearning.service.Service;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service = new Service();
		double stkPrice;
		boolean stkcompr;
		System.out.println("Enter the no of companies");
		Scanner sc = new Scanner(System.in);
		int compsize = sc.nextInt();
		ArrayList<Double> stkPriceList = new ArrayList();
		int countIncrease = 0;
		int countDecrease = 0;

		for (int i = 1; i <= compsize; i++) {

			System.out.println("Enter current stock price of the company " + i);
			stkPrice = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stkcompr = sc.nextBoolean();

			if (stkcompr == true)
				countIncrease++;
			else
				countDecrease++;

			stkPriceList.add(stkPrice);
			;

		}

		int option;
		do {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6.  press 0 to exit");

			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Stock prices in ascending order are :");
				service.sortAcscending(stkPriceList);
				break;
			case 2:
				System.out.println("Stock prices in descending order are :");
				service.sortDescending(stkPriceList);
				
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today is : " + countIncrease);

				break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today is  :" + countDecrease);

				break;
			case 5:
				System.out.println("Enter the key value");
				double enterdValue = sc.nextDouble();
				if (service.searchStock(stkPriceList, enterdValue))
					System.out.println("Stock of value " + enterdValue + " is present");
				else
					System.out.println("value not found");

				break;
			case 6:
				System.out.println(" press 0 to exit");

				int a = sc.nextInt();
				if (a == 0) {

					System.out.println("Exited successfully");
				}
				break;
			default:
				System.out.println("You have made an invalid choice");

			}

		} while (option != 6);

	}

}
