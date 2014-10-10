
package com.johnkuper.epam.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for storeWeb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="car" type="{http://jpa.johnkuper/jpawebservice}carWeb" minOccurs="0"/>
 *         &lt;element name="carPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testDrive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeWeb", propOrder = {
    "amount",
    "car",
    "carPrice",
    "id",
    "testDrive"
})
public class StoreWeb {

    protected int amount;
    protected CarWeb car;
    protected BigDecimal carPrice;
    protected int id;
    protected boolean testDrive;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarWeb }
     *     
     */
    public CarWeb getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarWeb }
     *     
     */
    public void setCar(CarWeb value) {
        this.car = value;
    }

    /**
     * Gets the value of the carPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarPrice() {
        return carPrice;
    }

    /**
     * Sets the value of the carPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarPrice(BigDecimal value) {
        this.carPrice = value;
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
     * Gets the value of the testDrive property.
     * 
     */
    public boolean isTestDrive() {
        return testDrive;
    }

    /**
     * Sets the value of the testDrive property.
     * 
     */
    public void setTestDrive(boolean value) {
        this.testDrive = value;
    }

}
