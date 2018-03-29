package com.crossover.challenge.model;

public class Bill {
	private Float value;
	private String name;

	public Bill(Float value, String name) {
		this.setValue(value);
		this.setName(name);
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showBillInfo() {
		String nameInfo = "Name: " + getName();
		String valueInfo = "Value: " + getValue();

		System.out.println(nameInfo + " " + valueInfo);
	}
}
