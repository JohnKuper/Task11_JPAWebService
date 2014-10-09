package com.johnkuper.epam.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.daoimpl.CarDAOImpl;
import com.johnkuper.epam.daoimpl.CustomerDAOImpl;
import com.johnkuper.epam.daoimpl.MerchantDAOImpl;
import com.johnkuper.epam.daoimpl.SaleDAOImpl;
import com.johnkuper.epam.domain.CarDomain;
import com.johnkuper.epam.domain.CustomerDomain;
import com.johnkuper.epam.domain.MerchantDomain;
import com.johnkuper.epam.domain.SaleDomain;
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
	private SaleDAOImpl saleDaoImpl;
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public JPAWebServiceImpl() {
		this.mapper = new Mapper(new DomainServiceFieldRegistator());
		this.carDaoImpl = new CarDAOImpl();
		this.custDaoImpl = new CustomerDAOImpl();
		this.merchDaoImpl = new MerchantDAOImpl();
		this.saleDaoImpl = new SaleDAOImpl();
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
	public String createCar(CarWeb carWeb) {

		logger.debug(calledMethod("createCar"));
		CarDomain carDomain = mapper.map(carWeb, CarDomain.class);
		carDaoImpl.create(carDomain);

		return "New car was successfully create";
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
	public String createCustomer(CustomerWeb customer) {

		logger.debug(calledMethod("createCustomer"));
		CustomerDomain custDomain = mapper.map(customer, CustomerDomain.class);
		custDaoImpl.create(custDomain);

		return "New customer was successfully create";

	}

	@Override
	public CustomerWeb findCustomer(int id) {

		logger.debug(calledMethod("findCustomer"));
		CustomerDomain custDomain = custDaoImpl.findOne(id);
		CustomerWeb custWeb = mapper.map(custDomain, CustomerWeb.class);
		logger.debug("CustomerWeb: {}", custWeb);

		return custWeb;
	}

	// Merchant methods
	@Override
	public MerchantWeb findMerchant(int id) {

		logger.debug(calledMethod("findMerchant"));
		MerchantDomain merchDomain = merchDaoImpl.findOne(id);
		MerchantWeb merchWeb = mapper.map(merchDomain, MerchantWeb.class);
		logger.debug("MerchantWeb: {}", merchWeb);

		return merchWeb;

	}

	@Override
	public String createMerchant(MerchantWeb merchant) {

		logger.debug(calledMethod("createMerchant"));
		MerchantDomain merchDomain = mapper.map(merchant, MerchantDomain.class);
		merchDaoImpl.create(merchDomain);

		return "New merchant was successfully create";
	}

	// Sale methods
	@Override
	public String buyCar(CarWeb car, CustomerWeb customer,
			MerchantWeb merchant, BigDecimal price) {

		logger.debug(calledMethod("buyCar"));

		Calendar calendar = Calendar.getInstance();

		java.util.Date now = calendar.getTime();
		java.sql.Date currentDate = new java.sql.Date(now.getTime());

		SaleWeb saleWeb = new SaleWeb(car, customer, merchant, price,
				currentDate);
		SaleDomain saleDomain = mapper.map(saleWeb, SaleDomain.class);
		saleDaoImpl.create(saleDomain);

		String status = "New sale was created";
		logger.debug("{}", saleWeb);

		return status;

	}

}
