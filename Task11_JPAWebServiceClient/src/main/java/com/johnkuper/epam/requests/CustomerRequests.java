package com.johnkuper.epam.requests;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.client.CustomerWeb;
import com.johnkuper.epam.client.JPAWebServiceImpl;

public class CustomerRequests {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	private JPAWebServiceImpl jpaPort;

	public CustomerRequests(JPAWebServiceImpl serviceImpl) {
		this.jpaPort = serviceImpl;
	}

	private String calledMethod(String methodName) {
		return String.format("--- Client method '%s' was called", methodName);
	}

	private XMLGregorianCalendar getXMLGregorianCalendar()
			throws DatatypeConfigurationException {
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
		XMLGregorianCalendar now = datatypeFactory
				.newXMLGregorianCalendar(gregorianCalendar);
		return now;
	}

	public void createCustomer() {

		logger.debug(calledMethod("createCustomer"));

		try {

			CustomerWeb customer = new CustomerWeb();

			customer.setCustName("Алексей");
			customer.setCustSurname("Петров");
			customer.setCustPatronymic("Васильевич");
			customer.setPassportSeries("4466");
			customer.setPassportNumber("569090");

			XMLGregorianCalendar currentTime = getXMLGregorianCalendar();
			currentTime.setYear(1982);
			currentTime.setMonth(6);
			currentTime.setDay(22);
			customer.setDateOfBirth(currentTime);

			String status = jpaPort.createCustomer(customer);
			logger.debug(status);

		} catch (DatatypeConfigurationException e) {
			logger.error("Error during createCustomer", e);
		}

	}
	

}
