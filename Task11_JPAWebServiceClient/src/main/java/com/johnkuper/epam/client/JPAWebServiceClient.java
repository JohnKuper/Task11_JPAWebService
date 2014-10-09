package com.johnkuper.epam.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.requests.CarRequests;

public class JPAWebServiceClient {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	final static QName qName = new QName("http://jpa.johnkuper/jpawebservice",
			"JPAWebService");
	final static String SERVICE_URL = "http://localhost:9000/JPAWebService?wsdl";

	static JPAWebServiceImpl jpaPort;

	// wsimport -keep -p com.johnkuper.epam.client
	// http://localhost:9000/JPAWebService?wsdl

	public static void main(String[] args) {

		URL url = getWSDLURL(SERVICE_URL);
		portSetup(url);
		sayHi("This is Kuper!!!");
		carRequests();

	}

	private static void carRequests() {

		CarRequests requests = new CarRequests(jpaPort);

		requests.findCarByName("Lada");
		requests.createCar();
		requests.findCarsByMotorPower();
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

}
