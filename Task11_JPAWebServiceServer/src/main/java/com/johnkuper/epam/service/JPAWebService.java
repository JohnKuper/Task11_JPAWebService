package com.johnkuper.epam.service;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.johnkuper.epam.servicemodel.CarWeb;
import com.johnkuper.epam.servicemodel.CustomerWeb;
import com.johnkuper.epam.servicemodel.MerchantWeb;
import com.johnkuper.epam.servicemodel.StoreWeb;

@WebService
public interface JPAWebService {

	// Car methods
	@WebMethod
	public List<CarWeb> findCarByName(@WebParam(name = "name") String name);

	@WebMethod
	public CarWeb findCar(@WebParam(name = "id") int id);

	@WebMethod
	public String createCar(@WebParam(name = "carWeb") CarWeb carWeb);

	@WebMethod
	public String updateCar(@WebParam(name = "carWeb") CarWeb carWeb);

	@WebMethod
	public List<CarWeb> findCarsByMotorPower(
			@WebParam(name = "minPower") int minPower,
			@WebParam(name = "maxPower") int maxPower);

	@WebMethod
	public List<StoreWeb> getAllCarsFromStore();

	// Customer methods
	@WebMethod
	public String createCustomer(
			@WebParam(name = "customer") CustomerWeb customer);

	@WebMethod
	public CustomerWeb findCustomer(@WebParam(name = "id") int id);

	// Merchant methods
	@WebMethod
	public MerchantWeb findMerchant(@WebParam(name = "id") int id);

	@WebMethod
	public String createMerchant(
			@WebParam(name = "merchant") MerchantWeb merchant);

	// Sales method
	@WebMethod
	public String buyCar(@WebParam(name = "car") CarWeb car,
			@WebParam(name = "customer") CustomerWeb customer,
			@WebParam(name = "merchant") MerchantWeb merchant,
			@WebParam(name = "price") BigDecimal price);

	// Store method
	@WebMethod
	public List<StoreWeb> findCarsBetweenPrices(
			@WebParam(name = "minPrice") BigDecimal minPrice,
			@WebParam(name = "maxPrice") BigDecimal maxPrice);

}
