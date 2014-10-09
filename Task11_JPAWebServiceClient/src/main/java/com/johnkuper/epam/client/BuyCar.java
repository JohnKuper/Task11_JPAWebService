
package com.johnkuper.epam.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buyCar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buyCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://jpa.johnkuper/jpawebservice}carWeb" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://jpa.johnkuper/jpawebservice}customerWeb" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://jpa.johnkuper/jpawebservice}merchantWeb" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buyCar", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class BuyCar {

    protected CarWeb arg0;
    protected CustomerWeb arg1;
    protected MerchantWeb arg2;
    protected BigDecimal arg3;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link CarWeb }
     *     
     */
    public CarWeb getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarWeb }
     *     
     */
    public void setArg0(CarWeb value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerWeb }
     *     
     */
    public CustomerWeb getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerWeb }
     *     
     */
    public void setArg1(CustomerWeb value) {
        this.arg1 = value;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantWeb }
     *     
     */
    public MerchantWeb getArg2() {
        return arg2;
    }

    /**
     * Sets the value of the arg2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantWeb }
     *     
     */
    public void setArg2(MerchantWeb value) {
        this.arg2 = value;
    }

    /**
     * Gets the value of the arg3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArg3() {
        return arg3;
    }

    /**
     * Sets the value of the arg3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArg3(BigDecimal value) {
        this.arg3 = value;
    }

}
