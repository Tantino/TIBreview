//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.13 at 12:00:36 AM CEST 
//


package com.tibco.exchange.tibreview.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tibrules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tibrules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="process" type="{exchange.tibco.com/tibreview}process" minOccurs="0"/>
 *         &lt;element name="xpathfunctions" type="{exchange.tibco.com/tibreview}xpathfunctions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tibrules", propOrder = {
    "process",
    "xpathfunctions"
})
public class Tibrules {

    protected Process process;
    protected Xpathfunctions xpathfunctions;

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link Process }
     *     
     */
    public Process getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link Process }
     *     
     */
    public void setProcess(Process value) {
        this.process = value;
    }

    /**
     * Gets the value of the xpathfunctions property.
     * 
     * @return
     *     possible object is
     *     {@link Xpathfunctions }
     *     
     */
    public Xpathfunctions getXpathfunctions() {
        return xpathfunctions;
    }

    /**
     * Sets the value of the xpathfunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xpathfunctions }
     *     
     */
    public void setXpathfunctions(Xpathfunctions value) {
        this.xpathfunctions = value;
    }

}
