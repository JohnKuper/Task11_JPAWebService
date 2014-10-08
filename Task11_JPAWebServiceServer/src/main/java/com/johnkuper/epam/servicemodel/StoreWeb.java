package com.johnkuper.epam.servicemodel;

import java.math.BigDecimal;

import com.johnkuper.epam.entity.Car;

public class StoreWeb {

	private int id;
	private Car car;
	private int amount;
	private BigDecimal carPrice;
	private boolean testDrive;

	public StoreWeb() {
	}

	public StoreWeb(Car car, int amount, BigDecimal carPrice,
			boolean testDrive) {
		this.car = car;
		this.amount = amount;
		this.carPrice = carPrice;
		this.testDrive = testDrive;
	}

	@Override
	public String toString() {
		return "StoreWeb: {id = " + id + "; amount = " + amount
				+ "; carPrice = " + carPrice + "; testDrive = " + testDrive
				+ "%n" + car + "%n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BigDecimal getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(BigDecimal carPrice) {
		this.carPrice = carPrice;
	}

	public boolean isTestDrive() {
		return testDrive;
	}

	public void setTestDrive(boolean testDrive) {
		this.testDrive = testDrive;
	}

}
