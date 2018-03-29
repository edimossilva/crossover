package com.crossover.challenge.business;

import com.crossover.challenge.model.Bill;
import com.crossover.challenge.model.payment.Payment;

public class PaymentManager {
	public void resolvePayment(Bill bill, Payment payment) {
		payment.pay(bill);
	}
}
