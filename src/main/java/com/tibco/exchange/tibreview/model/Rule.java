//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.13 at 12:00:36 AM CEST 
//


package com.tibco.exchange.tibreview.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impl" type="{exchange.tibco.com/tibreview}impl"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ruleset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prority" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule", propOrder = {
    "impl"
})
public class Rule {

    @XmlElement(required = true)
    protected Impl impl;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "ruleset")
    protected String ruleset;
    @XmlAttribute(name = "prority")
    protected Integer prority;
    @XmlAttribute(name = "description")
    protected String description;

    /**
     * Gets the value of the impl property.
     * 
     * @return
     *     possible object is
     *     {@link Impl }
     *     
     */
    public Impl getImpl() {
        return impl;
    }

    /**
     * Sets the value of the impl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Impl }
     *     
     */
    public void setImpl(Impl value) {
        this.impl = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ruleset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleset() {
        return ruleset;
    }

    /**
     * Sets the value of the ruleset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleset(String value) {
        this.ruleset = value;
    }

    /**
     * Gets the value of the prority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrority() {
        return prority;
    }

    /**
     * Sets the value of the prority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrority(Integer value) {
        this.prority = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
