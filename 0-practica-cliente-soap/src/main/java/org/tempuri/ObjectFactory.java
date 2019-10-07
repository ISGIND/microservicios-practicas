
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _DateTime_QNAME = new QName("http://tempuri.org/", "dateTime");
    private final static QName _DataSet_QNAME = new QName("http://tempuri.org/", "DataSet");
    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _ArrayOfString_QNAME = new QName("http://tempuri.org/", "ArrayOfString");
    private final static QName _Decimal_QNAME = new QName("http://tempuri.org/", "decimal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCurrencyRatesResponse }
     * 
     */
    public GetCurrencyRatesResponse createGetCurrencyRatesResponse() {
        return new GetCurrencyRatesResponse();
    }

    /**
     * Create an instance of {@link ConvertDataTableColumnResponse }
     * 
     */
    public ConvertDataTableColumnResponse createConvertDataTableColumnResponse() {
        return new ConvertDataTableColumnResponse();
    }

    /**
     * Create an instance of {@link ConvertDataTableColumn }
     * 
     */
    public ConvertDataTableColumn createConvertDataTableColumn() {
        return new ConvertDataTableColumn();
    }

    /**
     * Create an instance of {@link GetLastUpdateDate }
     * 
     */
    public GetLastUpdateDate createGetLastUpdateDate() {
        return new GetLastUpdateDate();
    }

    /**
     * Create an instance of {@link DataSet }
     * 
     */
    public DataSet createDataSet() {
        return new DataSet();
    }

    /**
     * Create an instance of {@link GetCurrencyRate }
     * 
     */
    public GetCurrencyRate createGetCurrencyRate() {
        return new GetCurrencyRate();
    }

    /**
     * Create an instance of {@link GetLastUpdateDateResponse }
     * 
     */
    public GetLastUpdateDateResponse createGetLastUpdateDateResponse() {
        return new GetLastUpdateDateResponse();
    }

    /**
     * Create an instance of {@link GetCurrencies }
     * 
     */
    public GetCurrencies createGetCurrencies() {
        return new GetCurrencies();
    }

    /**
     * Create an instance of {@link GetCurrenciesResponse }
     * 
     */
    public GetCurrenciesResponse createGetCurrenciesResponse() {
        return new GetCurrenciesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetCurrencyRates }
     * 
     */
    public GetCurrencyRates createGetCurrencyRates() {
        return new GetCurrencyRates();
    }

    /**
     * Create an instance of {@link GetCurrencyRatesResponse.GetCurrencyRatesResult }
     * 
     */
    public GetCurrencyRatesResponse.GetCurrencyRatesResult createGetCurrencyRatesResponseGetCurrencyRatesResult() {
        return new GetCurrencyRatesResponse.GetCurrencyRatesResult();
    }

    /**
     * Create an instance of {@link GetConversionAmount }
     * 
     */
    public GetConversionAmount createGetConversionAmount() {
        return new GetConversionAmount();
    }

    /**
     * Create an instance of {@link GetCultureInfoResponse }
     * 
     */
    public GetCultureInfoResponse createGetCultureInfoResponse() {
        return new GetCultureInfoResponse();
    }

    /**
     * Create an instance of {@link GetConversionRateResponse }
     * 
     */
    public GetConversionRateResponse createGetConversionRateResponse() {
        return new GetConversionRateResponse();
    }

    /**
     * Create an instance of {@link GetConversionRate }
     * 
     */
    public GetConversionRate createGetConversionRate() {
        return new GetConversionRate();
    }

    /**
     * Create an instance of {@link ConvertDataTableColumnResponse.Ds }
     * 
     */
    public ConvertDataTableColumnResponse.Ds createConvertDataTableColumnResponseDs() {
        return new ConvertDataTableColumnResponse.Ds();
    }

    /**
     * Create an instance of {@link ConvertDataTableColumn.Ds }
     * 
     */
    public ConvertDataTableColumn.Ds createConvertDataTableColumnDs() {
        return new ConvertDataTableColumn.Ds();
    }

    /**
     * Create an instance of {@link GetCurrencyRateResponse }
     * 
     */
    public GetCurrencyRateResponse createGetCurrencyRateResponse() {
        return new GetCurrencyRateResponse();
    }

    /**
     * Create an instance of {@link GetConversionAmountResponse }
     * 
     */
    public GetConversionAmountResponse createGetConversionAmountResponse() {
        return new GetConversionAmountResponse();
    }

    /**
     * Create an instance of {@link GetCultureInfo }
     * 
     */
    public GetCultureInfo createGetCultureInfo() {
        return new GetCultureInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DataSet")
    public JAXBElement<DataSet> createDataSet(DataSet value) {
        return new JAXBElement<DataSet>(_DataSet_QNAME, DataSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

}
