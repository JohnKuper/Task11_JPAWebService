package com.johnkuper.epam.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.johnkuper.epam.servicemodel.CarWeb;

@WebService
public interface JPAWebService {

	@WebMethod
	public String sayHi(@WebParam(name = "text") String text);

	@WebMethod
	public List<CarWeb> findCarByName(@WebParam(name = "name") String name);

}
