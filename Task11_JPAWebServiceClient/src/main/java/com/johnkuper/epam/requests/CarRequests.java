package com.johnkuper.epam.requests;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.client.CarWeb;
import com.johnkuper.epam.client.CustomerWeb;
import com.johnkuper.epam.client.JPAWebServiceImpl;
import com.johnkuper.epam.client.MerchantWeb;

public class CarRequests {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	private JPAWebServiceImpl jpaPort;

	public CarRequests(JPAWebServiceImpl serviceImpl) {
		this.jpaPort = serviceImpl;
	}

	private String calledMethod(String methodName) {
		return String.format("--- Client method '%s' was called", methodName);
	}

	private void getCarInfo(List<CarWeb> cars) {

		for (CarWeb car : cars) {
			int id = car.getId();
			String car_mark = car.getCarMark();
			String car_model = car.getCarModel();
			String motorpower = car.getMotorpower();
			String car_color = car.getCarColor();
			logger.debug(
					"id = {}, car_mark = {}, car_model = {}, motorpower = {}, car_color = {}",
					id, car_mark, car_model, motorpower, car_color);
		}

	}

	public void findCarByName(String name) {

		logger.debug(calledMethod("findCarByName"));
		List<CarWeb> cars = jpaPort.findCarByName(name);
		logger.debug("Found car by name {}:", name);
		getCarInfo(cars);

	}

	public void createCar() {

		logger.debug(calledMethod("createCar"));
		CarWeb carWeb = new CarWeb();
		carWeb.setCarMark("Chevrolet");
		carWeb.setCarModel("Corvette");
		carWeb.setMotorpower("560");
		carWeb.setCarColor("Red");
		String status = jpaPort.createCar(carWeb);
		logger.debug(status);
	}

	public void findCarsByMotorPower() {

		logger.debug(calledMethod("findCarsByMotorPower"));
		int minPower = 50;
		int maxPower = 300;
		List<CarWeb> cars = jpaPort.findCarsByMotorPower(minPower, maxPower);
		logger.debug("Found car between {} and {} motor power: ", minPower,
				maxPower);
		getCarInfo(cars);

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
}
