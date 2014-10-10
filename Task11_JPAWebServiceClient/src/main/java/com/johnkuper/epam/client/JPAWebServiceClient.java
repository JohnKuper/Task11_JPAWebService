package com.johnkuper.epam.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.requests.CarRequests;
import com.johnkuper.epam.requests.CustomerRequests;
import com.johnkuper.epam.requests.MerchantRequests;

public class JPAWebServiceClient {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	final static QName qName = new QName("http://jpa.johnkuper/jpawebservice",
			"JPAWebService");
	final static String SERVICE_URL = "http://localhost:9000/JPAWebService?wsdl";

	static JPAWebServiceImpl jpaPort;

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

	public static void main(String[] args) {

		URL url = getWSDLURL(SERVICE_URL);

		if (jpaPort == null) {
			portSetup(url);
		}

		carRequests();
		customerRequests();
		merchantRequests();

	}

	private static void carRequests() {

		CarRequests requests = new CarRequests(jpaPort);

		requests.findCarByName("Lada");
		requests.updateCar();
		requests.createCar();
		requests.findCarsByMotorPower();
		requests.buyCar();
		requests.findCarsBetweenPrices();

		requests.getAllCarsFromStore();
	}

	private static void customerRequests() {

		CustomerRequests requests = new CustomerRequests(jpaPort);

		requests.createCustomer();
	}

	private static void merchantRequests() {

		MerchantRequests requests = new MerchantRequests(jpaPort);

		requests.createMerchant();
	}

}
