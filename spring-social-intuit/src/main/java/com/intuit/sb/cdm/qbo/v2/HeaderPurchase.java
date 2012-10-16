//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Financial Transaction information that pertains to the entire Bill.
 * 
 * <p>Java class for HeaderPurchase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderPurchase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}VendorReferenceGroup" minOccurs="0"/>
 *         &lt;element name="BillEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderPurchase", propOrder = {
    "vendorId",
    "vendorName",
    "billEmail",
    "replyEmail",
    "totalAmt"
})
@XmlSeeAlso({
    BillHeader.class,
    PurchaseOrderHeader.class,
    VendorCreditHeader.class,
    ItemReceiptHeader.class
})
public class HeaderPurchase
    extends HeaderBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VendorId")
    protected IdType vendorId;
    @XmlElement(name = "VendorName")
    protected String vendorName;
    @XmlElement(name = "BillEmail")
    protected String billEmail;
    @XmlElement(name = "ReplyEmail")
    protected String replyEmail;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setVendorId(IdType value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the billEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillEmail() {
        return billEmail;
    }

    /**
     * Sets the value of the billEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillEmail(String value) {
        this.billEmail = value;
    }

    /**
     * Gets the value of the replyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyEmail() {
        return replyEmail;
    }

    /**
     * Sets the value of the replyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyEmail(String value) {
        this.replyEmail = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof HeaderPurchase)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final HeaderPurchase that = ((HeaderPurchase) object);
        {
            IdType lhsVendorId;
            lhsVendorId = this.getVendorId();
            IdType rhsVendorId;
            rhsVendorId = that.getVendorId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorId", lhsVendorId), LocatorUtils.property(thatLocator, "vendorId", rhsVendorId), lhsVendorId, rhsVendorId)) {
                return false;
            }
        }
        {
            String lhsVendorName;
            lhsVendorName = this.getVendorName();
            String rhsVendorName;
            rhsVendorName = that.getVendorName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorName", lhsVendorName), LocatorUtils.property(thatLocator, "vendorName", rhsVendorName), lhsVendorName, rhsVendorName)) {
                return false;
            }
        }
        {
            String lhsBillEmail;
            lhsBillEmail = this.getBillEmail();
            String rhsBillEmail;
            rhsBillEmail = that.getBillEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billEmail", lhsBillEmail), LocatorUtils.property(thatLocator, "billEmail", rhsBillEmail), lhsBillEmail, rhsBillEmail)) {
                return false;
            }
        }
        {
            String lhsReplyEmail;
            lhsReplyEmail = this.getReplyEmail();
            String rhsReplyEmail;
            rhsReplyEmail = that.getReplyEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replyEmail", lhsReplyEmail), LocatorUtils.property(thatLocator, "replyEmail", rhsReplyEmail), lhsReplyEmail, rhsReplyEmail)) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt)) {
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
            IdType theVendorId;
            theVendorId = this.getVendorId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorId", theVendorId), currentHashCode, theVendorId);
        }
        {
            String theVendorName;
            theVendorName = this.getVendorName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorName", theVendorName), currentHashCode, theVendorName);
        }
        {
            String theBillEmail;
            theBillEmail = this.getBillEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billEmail", theBillEmail), currentHashCode, theBillEmail);
        }
        {
            String theReplyEmail;
            theReplyEmail = this.getReplyEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replyEmail", theReplyEmail), currentHashCode, theReplyEmail);
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}