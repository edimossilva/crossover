package com.crossover.goodcoding1.model.payment;

import com.crossover.goodcoding1.model.Bill;

public class MoneyPayment implements Payment {
	private final Float moneyTax = 1.0f;

	@Override
	public void pay(Bill bill) {
		System.out.println(" Paying in money value = " + bill.getValue() * moneyTax);
	}
}
