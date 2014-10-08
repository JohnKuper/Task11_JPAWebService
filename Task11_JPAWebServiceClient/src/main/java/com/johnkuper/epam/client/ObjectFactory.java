
package com.johnkuper.epam.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.johnkuper.epam.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHi_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "sayHi");
    private final static QName _FindCarByName_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarByName");
    private final static QName _SayHiResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "sayHiResponse");
    private final static QName _FindCarByNameResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.johnkuper.epam.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCarByNameResponse }
     * 
     */
    public FindCarByNameResponse createFindCarByNameResponse() {
        return new FindCarByNameResponse();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link FindCarByName }
     * 
     */
    public FindCarByName createFindCarByName() {
        return new FindCarByName();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link CarWeb }
     * 
     */
    public CarWeb createCarWeb() {
        return new CarWeb();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCarByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCarByName")
    public JAXBElement<FindCarByName> createFindCarByName(FindCarByName value) {
        return new JAXBElement<FindCarByName>(_FindCarByName_QNAME, FindCarByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCarByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCarByNameResponse")
    public JAXBElement<FindCarByNameResponse> createFindCarByNameResponse(FindCarByNameResponse value) {
        return new JAXBElement<FindCarByNameResponse>(_FindCarByNameResponse_QNAME, FindCarByNameResponse.class, null, value);
    }

}
