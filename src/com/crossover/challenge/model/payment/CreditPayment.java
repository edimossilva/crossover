package com.crossover.challenge.model.payment;

import com.crossover.challenge.model.Bill;

public class CreditPayment implements Payment {
	private final Float creditTax = 1.2f;

	public void pay(Bill bill) {
		String paymentInfo = "Paying " + bill.getName();
		String moneyInfo = " credit with value " ;
		Float finalValue = bill.getValue() * creditTax;
		System.out.println(paymentInfo + moneyInfo + finalValue);
	}
}
