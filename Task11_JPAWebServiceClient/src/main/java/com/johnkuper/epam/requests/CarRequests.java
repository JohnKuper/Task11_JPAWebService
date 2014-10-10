package com.johnkuper.epam.requests;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.client.CarWeb;
import com.johnkuper.epam.client.CustomerWeb;
import com.johnkuper.epam.client.JPAWebServiceImpl;
import com.johnkuper.epam.client.MerchantWeb;
import com.johnkuper.epam.client.StoreWeb;

public class CarRequests {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	private JPAWebServiceImpl jpaPort;

	public CarRequests(JPAWebServiceImpl serviceImpl) {
		this.jpaPort = serviceImpl;
	}

	private String calledMethod(String methodName) {
		return String.format("--- Client method '%s' was called", methodName);
	}

	private void getCarsInfo(List<CarWeb> cars) {

		for (CarWeb car : cars) {
			int id = car.getId();
			String car_mark = car.getCarMark();
			String car_model = car.getCarModel();
			int motorpower = car.getMotorpower();
			String car_color = car.getCarColor();
			logger.debug(
					"id = {}, car_mark = {}, car_model = {}, motorpower = {}, car_color = {}",
					id, car_mark, car_model, motorpower, car_color);
		}

	}

	private void getCarInfo(CarWeb car) {

		int id = car.getId();
		String car_mark = car.getCarMark();
		String car_model = car.getCarModel();
		int motorpower = car.getMotorpower();
		String car_color = car.getCarColor();
		logger.debug(
				"id = {}, car_mark = {}, car_model = {}, motorpower = {}, car_color = {}",
				id, car_mark, car_model, motorpower, car_color);

	}

	public void findCarByName(String name) {

		logger.debug(calledMethod("findCarByName"));
		List<CarWeb> cars = jpaPort.findCarByName(name);

		if (cars.size() != 0) {
			logger.debug("Found car by name {}:", name);
			getCarsInfo(cars);
		} else {
			logger.debug("Car with name '{}' doesn't exists", name);

		}

	}

	public void createCar() {

		logger.debug(calledMethod("createCar"));

		CarWeb carWeb = new CarWeb();
		carWeb.setCarMark("Chevrolet");
		carWeb.setCarModel("Corvette");
		carWeb.setMotorpower(560);
		carWeb.setCarColor("Red");
		String status = jpaPort.createCar(carWeb);

		logger.debug(status);
	}

	public void findCarsByMotorPower() {

		logger.debug(calledMethod("findCarsByMotorPower"));

		int minPower = 100;
		int maxPower = 300;
		List<CarWeb> cars = jpaPort.findCarsByMotorPower(minPower, maxPower);
		logger.debug("Found car between {} and {} motor power: ", minPower,
				maxPower);
		getCarsInfo(cars);
	}

	public void buyCar() {

		logger.debug(calledMethod("buyCar"));

		// Assume that the customer want to buy this car
		List<CarWeb> car = jpaPort.findCarByName("Toyota");
		CarWeb oneCar = null;
		if (car.size() == 1) {
			oneCar = car.get(0);
		}
		// Assume that the current user wants to buy a car
		CustomerWeb customer = jpaPort.findCustomer(1);
		// Assume that the customer likes this merchant and want to cooperate
		// with him
		MerchantWeb merchant = jpaPort.findMerchant(1);
		BigDecimal price = new BigDecimal(1050000.90);

		String status = jpaPort.buyCar(oneCar, customer, merchant, price);

		logger.debug(status);
	}

	public void findCarsBetweenPrices() {

		logger.debug(calledMethod("findCarsBetweenPrices"));
		BigDecimal minPrice = new BigDecimal(500000);
		BigDecimal maxPrice = new BigDecimal(1000000);

		List<StoreWeb> webStores = jpaPort.findCarsBetweenPrices(minPrice,
				maxPrice);
		logger.debug("--- {} cars between {} and {} prices was found ---",
				webStores.size(), minPrice, maxPrice);

	}

	public void updateCar() {

		logger.debug(calledMethod("updateCar"));
		CarWeb car = jpaPort.findCar(2);
		car.setCarColor("Пурпурный");
		String status = jpaPort.updateCar(car);
		logger.debug(status);
	}

	public List<StoreWeb> getAllCarsFromStore() {

		logger.debug(calledMethod("getAllCarsFromStore"));

		List<StoreWeb> stores = jpaPort.getAllCarsFromStore();
		CarWeb car;
		int count;
		BigDecimal price = null;
		boolean testDrive;

		if (stores.size() != 0) {
			for (StoreWeb store : stores) {
				car = store.getCar();
				count = store.getAmount();
				price = store.getCarPrice();
				testDrive = store.isTestDrive();
				logger.debug("Found car in store:");
				getCarInfo(car);
				logger.debug("amount = {}, price = {}, testDrive = {}", count,
						price, testDrive);
			}
		}

		return stores;

	}
}
