//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.15 at 02:35:27 PM CET 
//


package eu.fbk.dkm.premon.premonitor.verbnet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "selrestrs"
})
@XmlRootElement(name = "PREP")
public class PREP {

    @XmlAttribute(name = "value")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlElement(name = "SELRESTRS", required = true)
    protected SELRESTRS selrestrs;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the selrestrs property.
     * 
     * @return
     *     possible object is
     *     {@link SELRESTRS }
     *     
     */
    public SELRESTRS getSELRESTRS() {
        return selrestrs;
    }

    /**
     * Sets the value of the selrestrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SELRESTRS }
     *     
     */
    public void setSELRESTRS(SELRESTRS value) {
        this.selrestrs = value;
    }

}