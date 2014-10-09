package com.johnkuper.epam.service;

import java.math.BigDecimal;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.johnkuper.epam.servicemodel.CarWeb;
import com.johnkuper.epam.servicemodel.CustomerWeb;
import com.johnkuper.epam.servicemodel.MerchantWeb;

@WebService
public interface JPAWebService {

	// Car methods
	@WebMethod
	public List<CarWeb> findCarByName(@WebParam(name = "name") String name);

	@WebMethod
	public String createCar(@WebParam(name = "carWeb") CarWeb carWeb);

	@WebMethod
	public List<CarWeb> findCarsByMotorPower(
			@WebParam(name = "minPower") int minPower,
			@WebParam(name = "maxPower") int maxPower);

	// Customer methods
	@WebMethod
	public String createCustomer(
			@WebParam(name = "customer") CustomerWeb customer);

	@WebMethod
	public CustomerWeb findCustomer(@WebParam(name = "id") int it);

	// Merchant methods
	@WebMethod
	public MerchantWeb findMerchant(@WebParam(name = "id") int id);

	@WebMethod
	public String createMerchant(
			@WebParam(name = "merchant") MerchantWeb merchant);

	// Sales methods
	@WebMethod
	public String buyCar(@WebParam(name = "car") CarWeb car,
			@WebParam(name = "customer") CustomerWeb customer,
			@WebParam(name = "merchant") MerchantWeb merchant,
			@WebParam(name = "price") BigDecimal price);
}
