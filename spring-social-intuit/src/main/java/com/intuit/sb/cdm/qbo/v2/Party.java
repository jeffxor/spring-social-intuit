//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *  Specifies the base Party that describes the party model 
 * 
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}PartyGroup"/>
 *         &lt;element name="Role" type="{http://www.intuit.com/sb/cdm/v2}roleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomField" type="{http://www.intuit.com/sb/cdm/v2}CustomField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "typeOf",
    "name",
    "address",
    "phone",
    "webSite",
    "email",
    "externalId",
    "role",
    "customField"
})
public class Party
    extends CdmBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TypeOf", required = true)
    protected PartyType typeOf;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Address")
    protected List<PhysicalAddress> address;
    @XmlElement(name = "Phone")
    protected List<TelephoneNumber> phone;
    @XmlElement(name = "WebSite")
    protected List<WebSiteAddress> webSite;
    @XmlElement(name = "Email")
    protected List<EmailAddress> email;
    @XmlElement(name = "ExternalId")
    protected String externalId;
    @XmlElement(name = "Role")
    protected List<RoleType> role;
    @XmlElement(name = "CustomField")
    protected List<CustomField> customField;

    /**
     * Gets the value of the typeOf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTypeOf() {
        return typeOf;
    }

    /**
     * Sets the value of the typeOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTypeOf(PartyType value) {
        this.typeOf = value;
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
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<PhysicalAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneNumber }
     * 
     * 
     */
    public List<TelephoneNumber> getPhone() {
        if (phone == null) {
            phone = new ArrayList<TelephoneNumber>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebSiteAddress }
     * 
     * 
     */
    public List<WebSiteAddress> getWebSite() {
        if (webSite == null) {
            webSite = new ArrayList<WebSiteAddress>();
        }
        return this.webSite;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddress }
     * 
     * 
     */
    public List<EmailAddress> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailAddress>();
        }
        return this.email;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRole() {
        if (role == null) {
            role = new ArrayList<RoleType>();
        }
        return this.role;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param address
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setAddress(List<PhysicalAddress> address) {
        this.address = address;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param phone
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhone(List<TelephoneNumber> phone) {
        this.phone = phone;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param webSite
     *     allowed object is
     *     {@link WebSiteAddress }
     *     
     */
    public void setWebSite(List<WebSiteAddress> webSite) {
        this.webSite = webSite;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param email
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmail(List<EmailAddress> email) {
        this.email = email;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param role
     *     allowed object is
     *     {@link RoleType }
     *     
     */
    public void setRole(List<RoleType> role) {
        this.role = role;
    }

    /**
     * Sets the value of the customField property.
     * 
     * @param customField
     *     allowed object is
     *     {@link CustomField }
     *     
     */
    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Party)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Party that = ((Party) object);
        {
            PartyType lhsTypeOf;
            lhsTypeOf = this.getTypeOf();
            PartyType rhsTypeOf;
            rhsTypeOf = that.getTypeOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeOf", lhsTypeOf), LocatorUtils.property(thatLocator, "typeOf", rhsTypeOf), lhsTypeOf, rhsTypeOf)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            List<PhysicalAddress> lhsAddress;
            lhsAddress = this.getAddress();
            List<PhysicalAddress> rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            List<TelephoneNumber> lhsPhone;
            lhsPhone = this.getPhone();
            List<TelephoneNumber> rhsPhone;
            rhsPhone = that.getPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone)) {
                return false;
            }
        }
        {
            List<WebSiteAddress> lhsWebSite;
            lhsWebSite = this.getWebSite();
            List<WebSiteAddress> rhsWebSite;
            rhsWebSite = that.getWebSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSite", lhsWebSite), LocatorUtils.property(thatLocator, "webSite", rhsWebSite), lhsWebSite, rhsWebSite)) {
                return false;
            }
        }
        {
            List<EmailAddress> lhsEmail;
            lhsEmail = this.getEmail();
            List<EmailAddress> rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId)) {
                return false;
            }
        }
        {
            List<RoleType> lhsRole;
            lhsRole = this.getRole();
            List<RoleType> rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            List<CustomField> lhsCustomField;
            lhsCustomField = this.getCustomField();
            List<CustomField> rhsCustomField;
            rhsCustomField = that.getCustomField();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customField", lhsCustomField), LocatorUtils.property(thatLocator, "customField", rhsCustomField), lhsCustomField, rhsCustomField)) {
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
            PartyType theTypeOf;
            theTypeOf = this.getTypeOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeOf", theTypeOf), currentHashCode, theTypeOf);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            List<PhysicalAddress> theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            List<TelephoneNumber> thePhone;
            thePhone = this.getPhone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phone", thePhone), currentHashCode, thePhone);
        }
        {
            List<WebSiteAddress> theWebSite;
            theWebSite = this.getWebSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSite", theWebSite), currentHashCode, theWebSite);
        }
        {
            List<EmailAddress> theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
        }
        {
            String theExternalId;
            theExternalId = this.getExternalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "externalId", theExternalId), currentHashCode, theExternalId);
        }
        {
            List<RoleType> theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            List<CustomField> theCustomField;
            theCustomField = this.getCustomField();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customField", theCustomField), currentHashCode, theCustomField);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}