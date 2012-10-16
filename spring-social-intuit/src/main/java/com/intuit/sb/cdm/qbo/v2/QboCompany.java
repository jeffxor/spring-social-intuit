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
 * <p>Java class for QboCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QboCompany">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}Organization">
 *       &lt;sequence>
 *         &lt;element name="UseDefaultChartOfAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BillingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserAuthId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QboCompany", namespace = "http://www.intuit.com/sb/cdm/qbo", propOrder = {
    "useDefaultChartOfAccounts",
    "billingCode",
    "userName",
    "userAuthId"
})
public class QboCompany
    extends Organization
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UseDefaultChartOfAccounts")
    protected Boolean useDefaultChartOfAccounts;
    @XmlElement(name = "BillingCode")
    protected String billingCode;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "UserAuthId")
    protected String userAuthId;

    /**
     * Gets the value of the useDefaultChartOfAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultChartOfAccounts() {
        return useDefaultChartOfAccounts;
    }

    /**
     * Sets the value of the useDefaultChartOfAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultChartOfAccounts(Boolean value) {
        this.useDefaultChartOfAccounts = value;
    }

    /**
     * Gets the value of the billingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCode() {
        return billingCode;
    }

    /**
     * Sets the value of the billingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCode(String value) {
        this.billingCode = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the userAuthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAuthId() {
        return userAuthId;
    }

    /**
     * Sets the value of the userAuthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAuthId(String value) {
        this.userAuthId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof QboCompany)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final QboCompany that = ((QboCompany) object);
        {
            Boolean lhsUseDefaultChartOfAccounts;
            lhsUseDefaultChartOfAccounts = this.isUseDefaultChartOfAccounts();
            Boolean rhsUseDefaultChartOfAccounts;
            rhsUseDefaultChartOfAccounts = that.isUseDefaultChartOfAccounts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "useDefaultChartOfAccounts", lhsUseDefaultChartOfAccounts), LocatorUtils.property(thatLocator, "useDefaultChartOfAccounts", rhsUseDefaultChartOfAccounts), lhsUseDefaultChartOfAccounts, rhsUseDefaultChartOfAccounts)) {
                return false;
            }
        }
        {
            String lhsBillingCode;
            lhsBillingCode = this.getBillingCode();
            String rhsBillingCode;
            rhsBillingCode = that.getBillingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billingCode", lhsBillingCode), LocatorUtils.property(thatLocator, "billingCode", rhsBillingCode), lhsBillingCode, rhsBillingCode)) {
                return false;
            }
        }
        {
            String lhsUserName;
            lhsUserName = this.getUserName();
            String rhsUserName;
            rhsUserName = that.getUserName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userName", lhsUserName), LocatorUtils.property(thatLocator, "userName", rhsUserName), lhsUserName, rhsUserName)) {
                return false;
            }
        }
        {
            String lhsUserAuthId;
            lhsUserAuthId = this.getUserAuthId();
            String rhsUserAuthId;
            rhsUserAuthId = that.getUserAuthId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userAuthId", lhsUserAuthId), LocatorUtils.property(thatLocator, "userAuthId", rhsUserAuthId), lhsUserAuthId, rhsUserAuthId)) {
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
            Boolean theUseDefaultChartOfAccounts;
            theUseDefaultChartOfAccounts = this.isUseDefaultChartOfAccounts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "useDefaultChartOfAccounts", theUseDefaultChartOfAccounts), currentHashCode, theUseDefaultChartOfAccounts);
        }
        {
            String theBillingCode;
            theBillingCode = this.getBillingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingCode", theBillingCode), currentHashCode, theBillingCode);
        }
        {
            String theUserName;
            theUserName = this.getUserName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userName", theUserName), currentHashCode, theUserName);
        }
        {
            String theUserAuthId;
            theUserAuthId = this.getUserAuthId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userAuthId", theUserAuthId), currentHashCode, theUserAuthId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}