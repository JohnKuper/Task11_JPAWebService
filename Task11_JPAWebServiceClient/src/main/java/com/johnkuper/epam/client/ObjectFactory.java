
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
    private final static QName _FindCustomer_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCustomer");
    private final static QName _BuyCar_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "buyCar");
    private final static QName _FindCarByName_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarByName");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createCustomerResponse");
    private final static QName _CreateCustomer_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createCustomer");
    private final static QName _SayHiResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "sayHiResponse");
    private final static QName _FindCarsByMotorPower_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarsByMotorPower");
    private final static QName _FindMerchantResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findMerchantResponse");
    private final static QName _FindCustomerResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCustomerResponse");
    private final static QName _FindMerchant_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findMerchant");
    private final static QName _CreateMerchant_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createMerchant");
    private final static QName _BuyCarResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "buyCarResponse");
    private final static QName _CreateCarResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createCarResponse");
    private final static QName _CreateMerchantResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createMerchantResponse");
    private final static QName _FindCarsByMotorPowerResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarsByMotorPowerResponse");
    private final static QName _CreateCar_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "createCar");
    private final static QName _FindCarByNameResponse_QNAME = new QName("http://jpa.johnkuper/jpawebservice", "findCarByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.johnkuper.epam.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCarsByMotorPower }
     * 
     */
    public FindCarsByMotorPower createFindCarsByMotorPower() {
        return new FindCarsByMotorPower();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link FindCarByName }
     * 
     */
    public FindCarByName createFindCarByName() {
        return new FindCarByName();
    }

    /**
     * Create an instance of {@link FindCustomer }
     * 
     */
    public FindCustomer createFindCustomer() {
        return new FindCustomer();
    }

    /**
     * Create an instance of {@link BuyCar }
     * 
     */
    public BuyCar createBuyCar() {
        return new BuyCar();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link CreateCar }
     * 
     */
    public CreateCar createCreateCar() {
        return new CreateCar();
    }

    /**
     * Create an instance of {@link FindCarByNameResponse }
     * 
     */
    public FindCarByNameResponse createFindCarByNameResponse() {
        return new FindCarByNameResponse();
    }

    /**
     * Create an instance of {@link CreateMerchantResponse }
     * 
     */
    public CreateMerchantResponse createCreateMerchantResponse() {
        return new CreateMerchantResponse();
    }

    /**
     * Create an instance of {@link FindCarsByMotorPowerResponse }
     * 
     */
    public FindCarsByMotorPowerResponse createFindCarsByMotorPowerResponse() {
        return new FindCarsByMotorPowerResponse();
    }

    /**
     * Create an instance of {@link BuyCarResponse }
     * 
     */
    public BuyCarResponse createBuyCarResponse() {
        return new BuyCarResponse();
    }

    /**
     * Create an instance of {@link CreateCarResponse }
     * 
     */
    public CreateCarResponse createCreateCarResponse() {
        return new CreateCarResponse();
    }

    /**
     * Create an instance of {@link FindMerchant }
     * 
     */
    public FindMerchant createFindMerchant() {
        return new FindMerchant();
    }

    /**
     * Create an instance of {@link CreateMerchant }
     * 
     */
    public CreateMerchant createCreateMerchant() {
        return new CreateMerchant();
    }

    /**
     * Create an instance of {@link FindMerchantResponse }
     * 
     */
    public FindMerchantResponse createFindMerchantResponse() {
        return new FindMerchantResponse();
    }

    /**
     * Create an instance of {@link FindCustomerResponse }
     * 
     */
    public FindCustomerResponse createFindCustomerResponse() {
        return new FindCustomerResponse();
    }

    /**
     * Create an instance of {@link MerchantWeb }
     * 
     */
    public MerchantWeb createMerchantWeb() {
        return new MerchantWeb();
    }

    /**
     * Create an instance of {@link CustomerWeb }
     * 
     */
    public CustomerWeb createCustomerWeb() {
        return new CustomerWeb();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCustomer")
    public JAXBElement<FindCustomer> createFindCustomer(FindCustomer value) {
        return new JAXBElement<FindCustomer>(_FindCustomer_QNAME, FindCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "buyCar")
    public JAXBElement<BuyCar> createBuyCar(BuyCar value) {
        return new JAXBElement<BuyCar>(_BuyCar_QNAME, BuyCar.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCarsByMotorPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCarsByMotorPower")
    public JAXBElement<FindCarsByMotorPower> createFindCarsByMotorPower(FindCarsByMotorPower value) {
        return new JAXBElement<FindCarsByMotorPower>(_FindCarsByMotorPower_QNAME, FindCarsByMotorPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMerchantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findMerchantResponse")
    public JAXBElement<FindMerchantResponse> createFindMerchantResponse(FindMerchantResponse value) {
        return new JAXBElement<FindMerchantResponse>(_FindMerchantResponse_QNAME, FindMerchantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCustomerResponse")
    public JAXBElement<FindCustomerResponse> createFindCustomerResponse(FindCustomerResponse value) {
        return new JAXBElement<FindCustomerResponse>(_FindCustomerResponse_QNAME, FindCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMerchant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findMerchant")
    public JAXBElement<FindMerchant> createFindMerchant(FindMerchant value) {
        return new JAXBElement<FindMerchant>(_FindMerchant_QNAME, FindMerchant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMerchant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createMerchant")
    public JAXBElement<CreateMerchant> createCreateMerchant(CreateMerchant value) {
        return new JAXBElement<CreateMerchant>(_CreateMerchant_QNAME, CreateMerchant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "buyCarResponse")
    public JAXBElement<BuyCarResponse> createBuyCarResponse(BuyCarResponse value) {
        return new JAXBElement<BuyCarResponse>(_BuyCarResponse_QNAME, BuyCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createCarResponse")
    public JAXBElement<CreateCarResponse> createCreateCarResponse(CreateCarResponse value) {
        return new JAXBElement<CreateCarResponse>(_CreateCarResponse_QNAME, CreateCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMerchantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createMerchantResponse")
    public JAXBElement<CreateMerchantResponse> createCreateMerchantResponse(CreateMerchantResponse value) {
        return new JAXBElement<CreateMerchantResponse>(_CreateMerchantResponse_QNAME, CreateMerchantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCarsByMotorPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "findCarsByMotorPowerResponse")
    public JAXBElement<FindCarsByMotorPowerResponse> createFindCarsByMotorPowerResponse(FindCarsByMotorPowerResponse value) {
        return new JAXBElement<FindCarsByMotorPowerResponse>(_FindCarsByMotorPowerResponse_QNAME, FindCarsByMotorPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jpa.johnkuper/jpawebservice", name = "createCar")
    public JAXBElement<CreateCar> createCreateCar(CreateCar value) {
        return new JAXBElement<CreateCar>(_CreateCar_QNAME, CreateCar.class, null, value);
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
