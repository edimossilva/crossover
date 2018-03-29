package com.crossover.challenge.model.payment;

import com.crossover.challenge.model.Bill;

public interface Payment {
	public void pay(Bill bill);
}
