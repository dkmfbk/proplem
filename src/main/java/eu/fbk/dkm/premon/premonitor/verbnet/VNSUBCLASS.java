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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "members",
    "themroles",
    "frames",
    "subclasses"
})
@XmlRootElement(name = "VNSUBCLASS")
public class VNSUBCLASS {

    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "MEMBERS", required = true)
    protected MEMBERS members;
    @XmlElement(name = "THEMROLES", required = true)
    protected THEMROLES themroles;
    @XmlElement(name = "FRAMES", required = true)
    protected FRAMES frames;
    @XmlElement(name = "SUBCLASSES", required = true)
    protected SUBCLASSES subclasses;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link MEMBERS }
     *     
     */
    public MEMBERS getMEMBERS() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link MEMBERS }
     *     
     */
    public void setMEMBERS(MEMBERS value) {
        this.members = value;
    }

    /**
     * Gets the value of the themroles property.
     * 
     * @return
     *     possible object is
     *     {@link THEMROLES }
     *     
     */
    public THEMROLES getTHEMROLES() {
        return themroles;
    }

    /**
     * Sets the value of the themroles property.
     * 
     * @param value
     *     allowed object is
     *     {@link THEMROLES }
     *     
     */
    public void setTHEMROLES(THEMROLES value) {
        this.themroles = value;
    }

    /**
     * Gets the value of the frames property.
     * 
     * @return
     *     possible object is
     *     {@link FRAMES }
     *     
     */
    public FRAMES getFRAMES() {
        return frames;
    }

    /**
     * Sets the value of the frames property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRAMES }
     *     
     */
    public void setFRAMES(FRAMES value) {
        this.frames = value;
    }

    /**
     * Gets the value of the subclasses property.
     * 
     * @return
     *     possible object is
     *     {@link SUBCLASSES }
     *     
     */
    public SUBCLASSES getSUBCLASSES() {
        return subclasses;
    }

    /**
     * Sets the value of the subclasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBCLASSES }
     *     
     */
    public void setSUBCLASSES(SUBCLASSES value) {
        this.subclasses = value;
    }

}
