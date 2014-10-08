package com.johnkuper.epam.publish;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.service.JPAWebServiceImpl;

public class JPAWebServiceServer {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");

	protected JPAWebServiceServer() {

		logger.debug("Starting Server");
		JPAWebServiceImpl implementor = new JPAWebServiceImpl();
		String address = "http://localhost:9000/JPAWebService";
		Endpoint.publish(address, implementor);
		logger.debug("The web service is published at {}", address);

	}

	public static void main(String[] args) {

		new JPAWebServiceServer();
		logger.debug("Server is ready...");

		try {
			Thread.sleep(1000 * 60 * 60);
		} catch (InterruptedException e) {
			logger.error("Server thread was interrupted", e);

		}

		logger.debug("Server exiting");
		System.exit(0);
	}

}
