package com.crossover.goodcoding1.model.payment;

import com.crossover.goodcoding1.model.Bill;

public class DebitPayment implements Payment {
	private final Float debitTax = 1.1f;

	public void pay(Bill bill) {
		System.out.println(" Paying in debit value = " + bill.getValue() * debitTax);
	}

}
