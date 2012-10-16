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
 * Information about a specific good or service purchased for which payment is being demanded, as part of a Bill
 * 
 * <p>Java class for BillLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}LinePurchase">
 *       &lt;group ref="{http://www.intuit.com/sb/cdm/v2}TxnLineReferenceGroup" minOccurs="0"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillLine", propOrder = {
    "txnId",
    "txnLineId"
})
public class BillLine
    extends LinePurchase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TxnId")
    protected IdType txnId;
    @XmlElement(name = "TxnLineId")
    protected IdType txnLineId;

    /**
     * Gets the value of the txnId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTxnId() {
        return txnId;
    }

    /**
     * Sets the value of the txnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnId(IdType value) {
        this.txnId = value;
    }

    /**
     * Gets the value of the txnLineId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getTxnLineId() {
        return txnLineId;
    }

    /**
     * Sets the value of the txnLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setTxnLineId(IdType value) {
        this.txnLineId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BillLine)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BillLine that = ((BillLine) object);
        {
            IdType lhsTxnId;
            lhsTxnId = this.getTxnId();
            IdType rhsTxnId;
            rhsTxnId = that.getTxnId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnId", lhsTxnId), LocatorUtils.property(thatLocator, "txnId", rhsTxnId), lhsTxnId, rhsTxnId)) {
                return false;
            }
        }
        {
            IdType lhsTxnLineId;
            lhsTxnLineId = this.getTxnLineId();
            IdType rhsTxnLineId;
            rhsTxnLineId = that.getTxnLineId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnLineId", lhsTxnLineId), LocatorUtils.property(thatLocator, "txnLineId", rhsTxnLineId), lhsTxnLineId, rhsTxnLineId)) {
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
            IdType theTxnId;
            theTxnId = this.getTxnId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnId", theTxnId), currentHashCode, theTxnId);
        }
        {
            IdType theTxnLineId;
            theTxnLineId = this.getTxnLineId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnLineId", theTxnLineId), currentHashCode, theTxnLineId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}