package com.crossover.challenge;

import com.crossover.challenge.business.PaymentManager;
import com.crossover.challenge.model.Bill;
import com.crossover.challenge.model.payment.CreditPayment;
import com.crossover.challenge.model.payment.DebitPayment;
import com.crossover.challenge.model.payment.MoneyPayment;

public class GoodCodingExample {
	public static void main(String[] args) {

		Bill bill = new Bill(100.f, "smartphone");
		PaymentManager paymentManager = new PaymentManager();
		paymentManager.resolvePayment(bill, new MoneyPayment());
		paymentManager.resolvePayment(bill, new CreditPayment());
		paymentManager.resolvePayment(bill, new DebitPayment());

	}

}
