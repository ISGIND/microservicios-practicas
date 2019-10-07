
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "currencyFrom",
    "currencyTo",
    "rateDate"
})
@XmlRootElement(name = "GetConversionRate")
public class GetConversionRate {

    @XmlElement(name = "CurrencyFrom")
    protected String currencyFrom;
    @XmlElement(name = "CurrencyTo")
    protected String currencyTo;
    @XmlElement(name = "RateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rateDate;

    /**
     * Obtiene el valor de la propiedad currencyFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyFrom() {
        return currencyFrom;
    }

    /**
     * Define el valor de la propiedad currencyFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyFrom(String value) {
        this.currencyFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyTo() {
        return currencyTo;
    }

    /**
     * Define el valor de la propiedad currencyTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyTo(String value) {
        this.currencyTo = value;
    }

    /**
     * Obtiene el valor de la propiedad rateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRateDate() {
        return rateDate;
    }

    /**
     * Define el valor de la propiedad rateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRateDate(XMLGregorianCalendar value) {
        this.rateDate = value;
    }

}
