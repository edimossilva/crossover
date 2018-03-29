package com.crossover.badcoding1;

public class Bill {
	private Float value;

	public Bill(Float value) {
		this.value = value;
	}

	public void pay(String type) {
		if (type.equals("cash")) {
			payInCash();
		} else if (type.equals("debit")) {
			payInDedit();
		} else if (type.equals("credit")) {
			payInCredit();
		} else {
			throw new IllegalAccessError("The choosen payment type doesn't exists");
		}
	}

	public void payInCash() {
		System.out.println(" Paying in cash value = " + value);
	}

	public void payInDedit() {
		System.out.println(" Paying in debit value = " + value * 1.1);
	}

	public void payInCredit() {
		System.out.println(" Paying in credit value = " + value * 1.2);
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}
