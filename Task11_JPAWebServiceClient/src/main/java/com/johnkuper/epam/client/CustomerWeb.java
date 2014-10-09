
package com.johnkuper.epam.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customerWeb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerWeb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custPatronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerWeb", propOrder = {
    "custName",
    "custPatronymic",
    "custSurname",
    "dateOfBirth",
    "id",
    "passportNumber",
    "passportSeries"
})
public class CustomerWeb {

    protected String custName;
    protected String custPatronymic;
    protected String custSurname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected int id;
    protected String passportNumber;
    protected String passportSeries;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the custPatronymic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustPatronymic() {
        return custPatronymic;
    }

    /**
     * Sets the value of the custPatronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustPatronymic(String value) {
        this.custPatronymic = value;
    }

    /**
     * Gets the value of the custSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSurname() {
        return custSurname;
    }

    /**
     * Sets the value of the custSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSurname(String value) {
        this.custSurname = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the passportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportSeries() {
        return passportSeries;
    }

    /**
     * Sets the value of the passportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportSeries(String value) {
        this.passportSeries = value;
    }

}
