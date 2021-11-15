//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.05 at 03:09:02 PM CET 
//


package it.kdm.fatturaPA.it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDocumentoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumentoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="4"/>
 *     &lt;enumeration value="TD01"/>
 *     &lt;enumeration value="TD02"/>
 *     &lt;enumeration value="TD03"/>
 *     &lt;enumeration value="TD04"/>
 *     &lt;enumeration value="TD05"/>
 *     &lt;enumeration value="TD06"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumentoType")
@XmlEnum
public enum TipoDocumentoType {


    /**
     * Fattura
     * 
     */
    @XmlEnumValue("TD01")
    TD_01("TD01"),

    /**
     * Acconto / anticipo su fattura
     * 
     */
    @XmlEnumValue("TD02")
    TD_02("TD02"),

    /**
     * Acconto / anticipo su parcella
     * 
     */
    @XmlEnumValue("TD03")
    TD_03("TD03"),

    /**
     * Nota di credito
     * 
     */
    @XmlEnumValue("TD04")
    TD_04("TD04"),

    /**
     * Nota di debito
     * 
     */
    @XmlEnumValue("TD05")
    TD_05("TD05"),

    /**
     * Parcella
     * 
     */
    @XmlEnumValue("TD06")
    TD_06("TD06");
    private final String value;

    TipoDocumentoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumentoType fromValue(String v) {
        for (TipoDocumentoType c: TipoDocumentoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
