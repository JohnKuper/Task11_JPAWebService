
package com.johnkuper.epam.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JPAWebService", targetNamespace = "http://jpa.johnkuper/jpawebservice", wsdlLocation = "http://localhost:9000/JPAWebService?wsdl")
public class JPAWebService
    extends Service
{

    private final static URL JPAWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException JPAWEBSERVICE_EXCEPTION;
    private final static QName JPAWEBSERVICE_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "JPAWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/JPAWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JPAWEBSERVICE_WSDL_LOCATION = url;
        JPAWEBSERVICE_EXCEPTION = e;
    }

    public JPAWebService() {
        super(__getWsdlLocation(), JPAWEBSERVICE_QNAME);
    }

    public JPAWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JPAWEBSERVICE_QNAME, features);
    }

    public JPAWebService(URL wsdlLocation) {
        super(wsdlLocation, JPAWEBSERVICE_QNAME);
    }

    public JPAWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JPAWEBSERVICE_QNAME, features);
    }

    public JPAWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JPAWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JPAWebServiceImpl
     */
    @WebEndpoint(name = "JPAWebServicePort")
    public JPAWebServiceImpl getJPAWebServicePort() {
        return super.getPort(new QName("http://jpa.johnkuper/jpawebservice", "JPAWebServicePort"), JPAWebServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JPAWebServiceImpl
     */
    @WebEndpoint(name = "JPAWebServicePort")
    public JPAWebServiceImpl getJPAWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jpa.johnkuper/jpawebservice", "JPAWebServicePort"), JPAWebServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JPAWEBSERVICE_EXCEPTION!= null) {
            throw JPAWEBSERVICE_EXCEPTION;
        }
        return JPAWEBSERVICE_WSDL_LOCATION;
    }

}
