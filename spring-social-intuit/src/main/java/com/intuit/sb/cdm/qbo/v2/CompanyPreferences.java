//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Defines a wrapper for rest response substitution in Preferences api. see CompanyPreferences element in RestDataFilter.xsd 
 * 
 * <p>Java class for CompanyPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyPreferences">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmComplexBase">
 *       &lt;sequence>
 *         &lt;element name="Preferences" type="{http://www.intuit.com/sb/cdm/v2}Preferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyPreferences", propOrder = {
    "preferences"
})
public class CompanyPreferences
    extends CdmComplexBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Preferences")
    protected Preferences preferences;

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CompanyPreferences)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CompanyPreferences that = ((CompanyPreferences) object);
        {
            Preferences lhsPreferences;
            lhsPreferences = this.getPreferences();
            Preferences rhsPreferences;
            rhsPreferences = that.getPreferences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferences", lhsPreferences), LocatorUtils.property(thatLocator, "preferences", rhsPreferences), lhsPreferences, rhsPreferences)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Preferences thePreferences;
            thePreferences = this.getPreferences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferences", thePreferences), currentHashCode, thePreferences);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}