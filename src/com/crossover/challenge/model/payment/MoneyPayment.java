package com.crossover.challenge.model.payment;

import com.crossover.challenge.model.Bill;

public class MoneyPayment implements Payment {
	private final Float moneyTax = 1.0f;

	@Override
	public void pay(Bill bill) {
		String paymentInfo = "Paying " + bill.getName();
		String moneyInfo = " money with value ";
		Float finalValue = bill.getValue() * moneyTax;
		System.out.println(paymentInfo + moneyInfo + finalValue);
	}
}
