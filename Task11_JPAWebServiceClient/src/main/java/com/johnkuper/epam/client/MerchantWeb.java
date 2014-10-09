
package com.johnkuper.epam.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for merchantWeb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="merchantWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="merchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchPatronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "merchantWeb", propOrder = {
    "id",
    "merchName",
    "merchPatronymic",
    "merchSurname"
})
public class MerchantWeb {

    protected int id;
    protected String merchName;
    protected String merchPatronymic;
    protected String merchSurname;

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
     * Gets the value of the merchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchName() {
        return merchName;
    }

    /**
     * Sets the value of the merchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchName(String value) {
        this.merchName = value;
    }

    /**
     * Gets the value of the merchPatronymic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchPatronymic() {
        return merchPatronymic;
    }

    /**
     * Sets the value of the merchPatronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchPatronymic(String value) {
        this.merchPatronymic = value;
    }

    /**
     * Gets the value of the merchSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchSurname() {
        return merchSurname;
    }

    /**
     * Sets the value of the merchSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchSurname(String value) {
        this.merchSurname = value;
    }

}
