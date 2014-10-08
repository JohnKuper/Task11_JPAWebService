package com.johnkuper.epam.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPAWebServiceClient {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	final static QName qName = new QName("http://jpa.johnkuper/jpawebservice",
			"JPAWebService");
	final static String SERVICE_URL = "http://localhost:9000/JPAWebService?wsdl";

	static JPAWebServiceImpl jpaPort;

	public static void main(String[] args) {

		URL url = getWSDLURL(SERVICE_URL);
		portSetup(url);
		sayHi("This is Kuper!!!");
		findCarByName("Lada");

	}

	private static void portSetup(URL url) {

		JPAWebService jpaService = new JPAWebService(url, qName);
		jpaPort = jpaService.getJPAWebServicePort();
	}

	private static URL getWSDLURL(String urlStr) {
		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		return url;
	}

	private static String sayHi(String text) {

		String clientStr = text;
		clientStr = jpaPort.sayHi(clientStr);
		logger.debug("String after service response : {}", clientStr);
		return clientStr;
	}

	private static List<CarWeb> findCarByName(String name) {

		List<CarWeb> cars = jpaPort.findCarByName(name);
		for (CarWeb car : cars) {
			int id = car.getId();
			String car_mark = car.getCarMark();
			String car_model = car.getCarModel();
			String motorpower = car.getMotorpower();
			String car_color = car.getCarColor();
			logger.debug(
					"Found car: id = {}, car_mark = {}, car_model = {}, motorpower = {}, car_color = {}",
					id, car_mark, car_model, motorpower, car_color);
		}

		return cars;
	}

}
