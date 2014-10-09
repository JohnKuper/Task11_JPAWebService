
package com.johnkuper.epam.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for saleWeb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saleWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="car" type="{http://jpa.johnkuper/jpawebservice}car" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://jpa.johnkuper/jpawebservice}customer" minOccurs="0"/>
 *         &lt;element name="dateOfSale" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="merchant" type="{http://jpa.johnkuper/jpawebservice}merchant" minOccurs="0"/>
 *         &lt;element name="salePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saleWeb", propOrder = {
    "car",
    "customer",
    "dateOfSale",
    "id",
    "merchant",
    "salePrice"
})
public class SaleWeb {

    protected Car car;
    protected Customer customer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfSale;
    protected int id;
    protected Merchant merchant;
    protected BigDecimal salePrice;

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link Car }
     *     
     */
    public Car getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link Car }
     *     
     */
    public void setCar(Car value) {
        this.car = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the dateOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfSale() {
        return dateOfSale;
    }

    /**
     * Sets the value of the dateOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfSale(XMLGregorianCalendar value) {
        this.dateOfSale = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the salePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    /**
     * Sets the value of the salePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalePrice(BigDecimal value) {
        this.salePrice = value;
    }

}
