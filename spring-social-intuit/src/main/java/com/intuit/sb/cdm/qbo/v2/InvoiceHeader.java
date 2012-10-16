//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.12 at 06:01:42 PM PDT 
//


package com.intuit.sb.cdm.qbo.v2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Information that pertains to the entire Invoice
 * 
 * <p>Java class for InvoiceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}HeaderSales">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ARAccountReferenceGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}SalesTermReferenceGroup" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BillAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="ShipAddr" type="{http://www.intuit.com/sb/cdm/v2}PhysicalAddress" minOccurs="0"/>
 *         &lt;element name="BillEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ShipMethodReferenceGroup" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}QboDiscountGroup" minOccurs="0"/>
 *         &lt;element name="TxnId" type="{http://www.intuit.com/sb/cdm/v2}IdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceHeader", propOrder = {
    "arAccountId",
    "arAccountName",
    "salesTermId",
    "salesTermName",
    "dueDate",
    "billAddr",
    "shipAddr",
    "billEmail",
    "shipMethodId",
    "shipMethodName",
    "balance",
    "discountAmt",
    "discountRate",
    "discountAccountId",
    "discountAccountName",
    "discountTaxable",
    "txnId"
})
public class InvoiceHeader
    extends HeaderSales
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ARAccountId")
    protected IdType arAccountId;
    @XmlElement(name = "ARAccountName")
    protected String arAccountName;
    @XmlElement(name = "SalesTermId")
    protected IdType salesTermId;
    @XmlElement(name = "SalesTermName")
    protected String salesTermName;
    @XmlElement(name = "DueDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dueDate;
    @XmlElement(name = "BillAddr")
    protected PhysicalAddress billAddr;
    @XmlElement(name = "ShipAddr")
    protected PhysicalAddress shipAddr;
    @XmlElement(name = "BillEmail")
    protected String billEmail;
    @XmlElement(name = "ShipMethodId")
    protected IdType shipMethodId;
    @XmlElement(name = "ShipMethodName")
    protected String shipMethodName;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "DiscountAmt")
    protected BigDecimal discountAmt;
    @XmlElement(name = "DiscountRate")
    protected BigDecimal discountRate;
    @XmlElement(name = "DiscountAccountId")
    protected IdType discountAccountId;
    @XmlElement(name = "DiscountAccountName")
    protected String discountAccountName;
    @XmlElement(name = "DiscountTaxable")
    protected Boolean discountTaxable;
    @XmlElement(name = "TxnId")
    protected List<IdType> txnId;

    /**
     * Gets the value of the arAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getARAccountId() {
        return arAccountId;
    }

    /**
     * Sets the value of the arAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setARAccountId(IdType value) {
        this.arAccountId = value;
    }

    /**
     * Gets the value of the arAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARAccountName() {
        return arAccountName;
    }

    /**
     * Sets the value of the arAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARAccountName(String value) {
        this.arAccountName = value;
    }

    /**
     * Gets the value of the salesTermId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getSalesTermId() {
        return salesTermId;
    }

    /**
     * Sets the value of the salesTermId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setSalesTermId(IdType value) {
        this.salesTermId = value;
    }

    /**
     * Gets the value of the salesTermName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTermName() {
        return salesTermName;
    }

    /**
     * Sets the value of the salesTermName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTermName(String value) {
        this.salesTermName = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDate(Calendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the billAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getBillAddr() {
        return billAddr;
    }

    /**
     * Sets the value of the billAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setBillAddr(PhysicalAddress value) {
        this.billAddr = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setShipAddr(PhysicalAddress value) {
        this.shipAddr = value;
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
     * Gets the value of the shipMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getShipMethodId() {
        return shipMethodId;
    }

    /**
     * Sets the value of the shipMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setShipMethodId(IdType value) {
        this.shipMethodId = value;
    }

    /**
     * Gets the value of the shipMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipMethodName() {
        return shipMethodName;
    }

    /**
     * Sets the value of the shipMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipMethodName(String value) {
        this.shipMethodName = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the discountAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    /**
     * Sets the value of the discountAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAmt(BigDecimal value) {
        this.discountAmt = value;
    }

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountRate(BigDecimal value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the discountAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getDiscountAccountId() {
        return discountAccountId;
    }

    /**
     * Sets the value of the discountAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setDiscountAccountId(IdType value) {
        this.discountAccountId = value;
    }

    /**
     * Gets the value of the discountAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAccountName() {
        return discountAccountName;
    }

    /**
     * Sets the value of the discountAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAccountName(String value) {
        this.discountAccountName = value;
    }

    /**
     * Gets the value of the discountTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountTaxable() {
        return discountTaxable;
    }

    /**
     * Sets the value of the discountTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountTaxable(Boolean value) {
        this.discountTaxable = value;
    }

    /**
     * Gets the value of the txnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getTxnId() {
        if (txnId == null) {
            txnId = new ArrayList<IdType>();
        }
        return this.txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param txnId
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnId(List<IdType> txnId) {
        this.txnId = txnId;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InvoiceHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final InvoiceHeader that = ((InvoiceHeader) object);
        {
            IdType lhsARAccountId;
            lhsARAccountId = this.getARAccountId();
            IdType rhsARAccountId;
            rhsARAccountId = that.getARAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arAccountId", lhsARAccountId), LocatorUtils.property(thatLocator, "arAccountId", rhsARAccountId), lhsARAccountId, rhsARAccountId)) {
                return false;
            }
        }
        {
            String lhsARAccountName;
            lhsARAccountName = this.getARAccountName();
            String rhsARAccountName;
            rhsARAccountName = that.getARAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arAccountName", lhsARAccountName), LocatorUtils.property(thatLocator, "arAccountName", rhsARAccountName), lhsARAccountName, rhsARAccountName)) {
                return false;
            }
        }
        {
            IdType lhsSalesTermId;
            lhsSalesTermId = this.getSalesTermId();
            IdType rhsSalesTermId;
            rhsSalesTermId = that.getSalesTermId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermId", lhsSalesTermId), LocatorUtils.property(thatLocator, "salesTermId", rhsSalesTermId), lhsSalesTermId, rhsSalesTermId)) {
                return false;
            }
        }
        {
            String lhsSalesTermName;
            lhsSalesTermName = this.getSalesTermName();
            String rhsSalesTermName;
            rhsSalesTermName = that.getSalesTermName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesTermName", lhsSalesTermName), LocatorUtils.property(thatLocator, "salesTermName", rhsSalesTermName), lhsSalesTermName, rhsSalesTermName)) {
                return false;
            }
        }
        {
            Calendar lhsDueDate;
            lhsDueDate = this.getDueDate();
            Calendar rhsDueDate;
            rhsDueDate = that.getDueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dueDate", lhsDueDate), LocatorUtils.property(thatLocator, "dueDate", rhsDueDate), lhsDueDate, rhsDueDate)) {
                return false;
            }
        }
        {
            PhysicalAddress lhsBillAddr;
            lhsBillAddr = this.getBillAddr();
            PhysicalAddress rhsBillAddr;
            rhsBillAddr = that.getBillAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billAddr", lhsBillAddr), LocatorUtils.property(thatLocator, "billAddr", rhsBillAddr), lhsBillAddr, rhsBillAddr)) {
                return false;
            }
        }
        {
            PhysicalAddress lhsShipAddr;
            lhsShipAddr = this.getShipAddr();
            PhysicalAddress rhsShipAddr;
            rhsShipAddr = that.getShipAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipAddr", lhsShipAddr), LocatorUtils.property(thatLocator, "shipAddr", rhsShipAddr), lhsShipAddr, rhsShipAddr)) {
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
            IdType lhsShipMethodId;
            lhsShipMethodId = this.getShipMethodId();
            IdType rhsShipMethodId;
            rhsShipMethodId = that.getShipMethodId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipMethodId", lhsShipMethodId), LocatorUtils.property(thatLocator, "shipMethodId", rhsShipMethodId), lhsShipMethodId, rhsShipMethodId)) {
                return false;
            }
        }
        {
            String lhsShipMethodName;
            lhsShipMethodName = this.getShipMethodName();
            String rhsShipMethodName;
            rhsShipMethodName = that.getShipMethodName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipMethodName", lhsShipMethodName), LocatorUtils.property(thatLocator, "shipMethodName", rhsShipMethodName), lhsShipMethodName, rhsShipMethodName)) {
                return false;
            }
        }
        {
            BigDecimal lhsBalance;
            lhsBalance = this.getBalance();
            BigDecimal rhsBalance;
            rhsBalance = that.getBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balance", lhsBalance), LocatorUtils.property(thatLocator, "balance", rhsBalance), lhsBalance, rhsBalance)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountAmt;
            lhsDiscountAmt = this.getDiscountAmt();
            BigDecimal rhsDiscountAmt;
            rhsDiscountAmt = that.getDiscountAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAmt", lhsDiscountAmt), LocatorUtils.property(thatLocator, "discountAmt", rhsDiscountAmt), lhsDiscountAmt, rhsDiscountAmt)) {
                return false;
            }
        }
        {
            BigDecimal lhsDiscountRate;
            lhsDiscountRate = this.getDiscountRate();
            BigDecimal rhsDiscountRate;
            rhsDiscountRate = that.getDiscountRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountRate", lhsDiscountRate), LocatorUtils.property(thatLocator, "discountRate", rhsDiscountRate), lhsDiscountRate, rhsDiscountRate)) {
                return false;
            }
        }
        {
            IdType lhsDiscountAccountId;
            lhsDiscountAccountId = this.getDiscountAccountId();
            IdType rhsDiscountAccountId;
            rhsDiscountAccountId = that.getDiscountAccountId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountId", lhsDiscountAccountId), LocatorUtils.property(thatLocator, "discountAccountId", rhsDiscountAccountId), lhsDiscountAccountId, rhsDiscountAccountId)) {
                return false;
            }
        }
        {
            String lhsDiscountAccountName;
            lhsDiscountAccountName = this.getDiscountAccountName();
            String rhsDiscountAccountName;
            rhsDiscountAccountName = that.getDiscountAccountName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountName", lhsDiscountAccountName), LocatorUtils.property(thatLocator, "discountAccountName", rhsDiscountAccountName), lhsDiscountAccountName, rhsDiscountAccountName)) {
                return false;
            }
        }
        {
            Boolean lhsDiscountTaxable;
            lhsDiscountTaxable = this.isDiscountTaxable();
            Boolean rhsDiscountTaxable;
            rhsDiscountTaxable = that.isDiscountTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountTaxable", lhsDiscountTaxable), LocatorUtils.property(thatLocator, "discountTaxable", rhsDiscountTaxable), lhsDiscountTaxable, rhsDiscountTaxable)) {
                return false;
            }
        }
        {
            List<IdType> lhsTxnId;
            lhsTxnId = this.getTxnId();
            List<IdType> rhsTxnId;
            rhsTxnId = that.getTxnId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnId", lhsTxnId), LocatorUtils.property(thatLocator, "txnId", rhsTxnId), lhsTxnId, rhsTxnId)) {
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
            IdType theARAccountId;
            theARAccountId = this.getARAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arAccountId", theARAccountId), currentHashCode, theARAccountId);
        }
        {
            String theARAccountName;
            theARAccountName = this.getARAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arAccountName", theARAccountName), currentHashCode, theARAccountName);
        }
        {
            IdType theSalesTermId;
            theSalesTermId = this.getSalesTermId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermId", theSalesTermId), currentHashCode, theSalesTermId);
        }
        {
            String theSalesTermName;
            theSalesTermName = this.getSalesTermName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesTermName", theSalesTermName), currentHashCode, theSalesTermName);
        }
        {
            Calendar theDueDate;
            theDueDate = this.getDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueDate", theDueDate), currentHashCode, theDueDate);
        }
        {
            PhysicalAddress theBillAddr;
            theBillAddr = this.getBillAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billAddr", theBillAddr), currentHashCode, theBillAddr);
        }
        {
            PhysicalAddress theShipAddr;
            theShipAddr = this.getShipAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipAddr", theShipAddr), currentHashCode, theShipAddr);
        }
        {
            String theBillEmail;
            theBillEmail = this.getBillEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billEmail", theBillEmail), currentHashCode, theBillEmail);
        }
        {
            IdType theShipMethodId;
            theShipMethodId = this.getShipMethodId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipMethodId", theShipMethodId), currentHashCode, theShipMethodId);
        }
        {
            String theShipMethodName;
            theShipMethodName = this.getShipMethodName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipMethodName", theShipMethodName), currentHashCode, theShipMethodName);
        }
        {
            BigDecimal theBalance;
            theBalance = this.getBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balance", theBalance), currentHashCode, theBalance);
        }
        {
            BigDecimal theDiscountAmt;
            theDiscountAmt = this.getDiscountAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAmt", theDiscountAmt), currentHashCode, theDiscountAmt);
        }
        {
            BigDecimal theDiscountRate;
            theDiscountRate = this.getDiscountRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountRate", theDiscountRate), currentHashCode, theDiscountRate);
        }
        {
            IdType theDiscountAccountId;
            theDiscountAccountId = this.getDiscountAccountId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountId", theDiscountAccountId), currentHashCode, theDiscountAccountId);
        }
        {
            String theDiscountAccountName;
            theDiscountAccountName = this.getDiscountAccountName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountName", theDiscountAccountName), currentHashCode, theDiscountAccountName);
        }
        {
            Boolean theDiscountTaxable;
            theDiscountTaxable = this.isDiscountTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountTaxable", theDiscountTaxable), currentHashCode, theDiscountTaxable);
        }
        {
            List<IdType> theTxnId;
            theTxnId = this.getTxnId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnId", theTxnId), currentHashCode, theTxnId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}