
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para derivationControl.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="derivationControl">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="substitution"/>
 *     &lt;enumeration value="extension"/>
 *     &lt;enumeration value="restriction"/>
 *     &lt;enumeration value="list"/>
 *     &lt;enumeration value="union"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "derivationControl")
@XmlEnum
public enum DerivationControl {

    @XmlEnumValue("substitution")
    SUBSTITUTION("substitution"),
    @XmlEnumValue("extension")
    EXTENSION("extension"),
    @XmlEnumValue("restriction")
    RESTRICTION("restriction"),
    @XmlEnumValue("list")
    LIST("list"),
    @XmlEnumValue("union")
    UNION("union");
    private final String value;

    DerivationControl(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DerivationControl fromValue(String v) {
        for (DerivationControl c: DerivationControl.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
