package com.crossover.goodcoding1.model.payment;

import com.crossover.goodcoding1.model.Bill;

public class CreditPayment implements Payment {
	private final Float creditTax = 1.2f;

	public void pay(Bill bill) {
		System.out.println(" Paying in credit value = " + bill.getValue() * creditTax);
	}
}
