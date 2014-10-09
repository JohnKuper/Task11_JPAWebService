package com.johnkuper.epam.requests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.johnkuper.epam.client.JPAWebServiceImpl;
import com.johnkuper.epam.client.MerchantWeb;

public class MerchantRequests {

	final static Logger logger = LoggerFactory.getLogger("JohnKuper");
	private JPAWebServiceImpl jpaPort;

	public MerchantRequests(JPAWebServiceImpl serviceImpl) {
		this.jpaPort = serviceImpl;
	}

	private String calledMethod(String methodName) {
		return String.format("--- Client method '%s' was called", methodName);
	}

	public void createMerchant() {

		logger.debug(calledMethod("createMerchant"));

		MerchantWeb merchant = new MerchantWeb();
		merchant.setMerchName("Михаил");
		merchant.setMerchSurname("Шишкин");
		merchant.setMerchPatronymic("Валентинович");

		String status = jpaPort.createMerchant(merchant);

		logger.debug(status);

	}

}
