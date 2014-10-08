package com.johnkuper.epam.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.daoimpl.CarDAOImpl;
import com.johnkuper.epam.domain.CarDomain;
import com.johnkuper.epam.mapper.DomainServiceFieldRegistator;
import com.johnkuper.epam.mapper.Mapper;
import com.johnkuper.epam.servicemodel.CarWeb;

@WebService(serviceName = "JPAWebService", portName = "JPAWebServicePort", targetNamespace = "http://jpa.johnkuper/jpawebservice")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public class JPAWebServiceImpl implements JPAWebService {

	private Mapper mapper;
	private CarDAOImpl carDaoImpl;
	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	public JPAWebServiceImpl() {
		this.mapper = new Mapper(new DomainServiceFieldRegistator());
		this.carDaoImpl = new CarDAOImpl();
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
}
