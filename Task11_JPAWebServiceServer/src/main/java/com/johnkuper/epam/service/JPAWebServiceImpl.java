package com.johnkuper.epam.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.daoimpl.CarDAOImpl;
import com.johnkuper.epam.daoimpl.CustomerDAOImpl;
import com.johnkuper.epam.daoimpl.MerchantDAOImpl;
import com.johnkuper.epam.domain.CarDomain;
import com.johnkuper.epam.domain.CustomerDomain;
import com.johnkuper.epam.domain.MerchantDomain;
import com.johnkuper.epam.mapper.DomainServiceFieldRegistator;
import com.johnkuper.epam.mapper.Mapper;
import com.johnkuper.epam.servicemodel.CarWeb;
import com.johnkuper.epam.servicemodel.CustomerWeb;
import com.johnkuper.epam.servicemodel.MerchantWeb;
import com.johnkuper.epam.servicemodel.SaleWeb;

@WebService(serviceName = "JPAWebService", portName = "JPAWebServicePort", targetNamespace = "http://jpa.johnkuper/jpawebservice")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class JPAWebServiceImpl implements JPAWebService {

	private Mapper mapper;
	private CarDAOImpl carDaoImpl;
	private CustomerDAOImpl custDaoImpl;
	private MerchantDAOImpl merchDaoImpl;
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public JPAWebServiceImpl() {
		this.mapper = new Mapper(new DomainServiceFieldRegistator());
		this.carDaoImpl = new CarDAOImpl();
		this.custDaoImpl = new CustomerDAOImpl();
		this.merchDaoImpl = new MerchantDAOImpl();
	}

	private String calledMethod(String methodName) {
		return String.format("Service method '%s' was called", methodName);
	}

	public String sayHi(String text) {

		if (text.length() > 0) {
			logger.debug(calledMethod("sayHi"));
			return "Hello! " + text;
		} else {
			return "Please, enter correct text";
		}
	}

	// Car methods
	@Override
	public List<CarWeb> findCarByName(String name) {

		logger.debug(calledMethod("findCarByName"));
		List<CarDomain> carDomains = carDaoImpl.findByName(name);
		List<CarWeb> carWebs = new ArrayList<>();
		if (carDomains.size() != 0) {
			for (CarDomain car : carDomains) {
				carWebs.add(mapper.map(car, CarWeb.class));
			}
		}

		return carWebs;
	}

	@Override
	public void createCar(CarWeb carWeb) {

		logger.debug(calledMethod("createCar"));
		CarDomain carDomain = mapper.map(carWeb, CarDomain.class);
		carDaoImpl.create(carDomain);
	}

	@Override
	public List<CarWeb> findCarsByMotorPower(int minPower, int maxPower) {

		logger.debug(calledMethod("findCarsByMotorPower"));
		List<CarDomain> domainCars = carDaoImpl.findAll();
		List<CarWeb> webCars = new ArrayList<>();
		if (domainCars.size() != 0) {
			for (CarDomain car : domainCars) {
				int motorPower = Integer.valueOf(car.getMotorpower());
				if (motorPower >= minPower && motorPower <= maxPower) {
					webCars.add(mapper.map(car, CarWeb.class));
				}
			}
		}

		return webCars;
	}

	// Customer methods
	@Override
	public void createCustomer(CustomerWeb customer) {

		logger.debug(calledMethod("createCustomer"));
		CustomerDomain custDomain = mapper.map(customer, CustomerDomain.class);
		custDaoImpl.create(custDomain);

	}

	@Override
	public CustomerWeb findCustomer(int id) {

		logger.debug(calledMethod("findCustomer"));
		CustomerDomain custDomain = custDaoImpl.findOne(id);
		CustomerWeb custWeb = mapper.map(custDomain, CustomerWeb.class);

		return custWeb;
	}

	// Merchant methods
	@Override
	public MerchantWeb findMerchant(int id) {

		logger.debug(calledMethod("findMerchant"));
		MerchantDomain merchDomain = merchDaoImpl.findOne(id);
		MerchantWeb merchWeb = mapper.map(merchDomain, MerchantWeb.class);

		return merchWeb;

	}

	@Override
	public SaleWeb buyCar(CarWeb car, CustomerWeb customer, MerchantWeb merchant,
			BigDecimal price) {
		// TODO Auto-generated method stub
		return null;
	}

}
