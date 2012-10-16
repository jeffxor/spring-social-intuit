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
import javax.xml.bind.annotation.XmlRootElement;
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
 * Represents an "item" that can be sold.
 * 
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intuit.com/sb/cdm/v2}CdmBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}ItemParentReferenceGroup" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UnitPrice" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.intuit.com/sb/cdm/v2}ItemTypeEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.intuit.com/sb/cdm/v2}UOMReferenceGroup" minOccurs="0"/>
 *         &lt;element name="IncomeAccountRef" type="{http://www.intuit.com/sb/cdm/v2}AccountRef" minOccurs="0"/>
 *         &lt;element name="PurchaseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseCost" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="ExpenseAccountRef" type="{http://www.intuit.com/sb/cdm/v2}AccountRef" minOccurs="0"/>
 *         &lt;element name="COGSAccountRef" type="{http://www.intuit.com/sb/cdm/v2}AccountRef" minOccurs="0"/>
 *         &lt;element name="AssetAccountRef" type="{http://www.intuit.com/sb/cdm/v2}AccountRef" minOccurs="0"/>
 *         &lt;element name="PrefVendorRef" type="{http://www.intuit.com/sb/cdm/v2}VendorRef" minOccurs="0"/>
 *         &lt;element name="AvgCost" type="{http://www.intuit.com/sb/cdm/v2}Money" minOccurs="0"/>
 *         &lt;element name="QtyOnHand" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QtyOnPurchaseOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QtyOnSalesOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReorderPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ManPartNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "Item", namespace = "http://www.intuit.com/sb/cdm/v2")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "itemParentId",
    "itemParentName",
    "name",
    "desc",
    "taxable",
    "active",
    "unitPrice",
    "type",
    "uomId",
    "uomAbbrv",
    "incomeAccountRef",
    "purchaseDesc",
    "purchaseCost",
    "expenseAccountRef",
    "cogsAccountRef",
    "assetAccountRef",
    "prefVendorRef",
    "avgCost",
    "qtyOnHand",
    "qtyOnPurchaseOrder",
    "qtyOnSalesOrder",
    "reorderPoint",
    "manPartNum"
})
public class Item
    extends CdmBase
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemParentId")
    protected IdType itemParentId;
    @XmlElement(name = "ItemParentName")
    protected String itemParentName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Taxable")
    protected Boolean taxable;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "UnitPrice")
    protected Money unitPrice;
    @XmlElement(name = "Type")
    protected ItemTypeEnum type;
    @XmlElement(name = "UOMId")
    protected IdType uomId;
    @XmlElement(name = "UOMAbbrv")
    protected String uomAbbrv;
    @XmlElement(name = "IncomeAccountRef")
    protected AccountRef incomeAccountRef;
    @XmlElement(name = "PurchaseDesc")
    protected String purchaseDesc;
    @XmlElement(name = "PurchaseCost")
    protected Money purchaseCost;
    @XmlElement(name = "ExpenseAccountRef")
    protected AccountRef expenseAccountRef;
    @XmlElement(name = "COGSAccountRef")
    protected AccountRef cogsAccountRef;
    @XmlElement(name = "AssetAccountRef")
    protected AccountRef assetAccountRef;
    @XmlElement(name = "PrefVendorRef")
    protected VendorRef prefVendorRef;
    @XmlElement(name = "AvgCost")
    protected Money avgCost;
    @XmlElement(name = "QtyOnHand")
    protected BigDecimal qtyOnHand;
    @XmlElement(name = "QtyOnPurchaseOrder")
    protected BigDecimal qtyOnPurchaseOrder;
    @XmlElement(name = "QtyOnSalesOrder")
    protected BigDecimal qtyOnSalesOrder;
    @XmlElement(name = "ReorderPoint")
    protected BigDecimal reorderPoint;
    @XmlElement(name = "ManPartNum")
    protected String manPartNum;

    /**
     * Gets the value of the itemParentId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getItemParentId() {
        return itemParentId;
    }

    /**
     * Sets the value of the itemParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setItemParentId(IdType value) {
        this.itemParentId = value;
    }

    /**
     * Gets the value of the itemParentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemParentName() {
        return itemParentName;
    }

    /**
     * Sets the value of the itemParentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemParentName(String value) {
        this.itemParentName = value;
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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnitPrice(Money value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTypeEnum }
     *     
     */
    public ItemTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTypeEnum }
     *     
     */
    public void setType(ItemTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the uomId property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getUOMId() {
        return uomId;
    }

    /**
     * Sets the value of the uomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setUOMId(IdType value) {
        this.uomId = value;
    }

    /**
     * Gets the value of the uomAbbrv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUOMAbbrv() {
        return uomAbbrv;
    }

    /**
     * Sets the value of the uomAbbrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUOMAbbrv(String value) {
        this.uomAbbrv = value;
    }

    /**
     * Gets the value of the incomeAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getIncomeAccountRef() {
        return incomeAccountRef;
    }

    /**
     * Sets the value of the incomeAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setIncomeAccountRef(AccountRef value) {
        this.incomeAccountRef = value;
    }

    /**
     * Gets the value of the purchaseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDesc() {
        return purchaseDesc;
    }

    /**
     * Sets the value of the purchaseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDesc(String value) {
        this.purchaseDesc = value;
    }

    /**
     * Gets the value of the purchaseCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPurchaseCost() {
        return purchaseCost;
    }

    /**
     * Sets the value of the purchaseCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPurchaseCost(Money value) {
        this.purchaseCost = value;
    }

    /**
     * Gets the value of the expenseAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getExpenseAccountRef() {
        return expenseAccountRef;
    }

    /**
     * Sets the value of the expenseAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setExpenseAccountRef(AccountRef value) {
        this.expenseAccountRef = value;
    }

    /**
     * Gets the value of the cogsAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getCOGSAccountRef() {
        return cogsAccountRef;
    }

    /**
     * Sets the value of the cogsAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setCOGSAccountRef(AccountRef value) {
        this.cogsAccountRef = value;
    }

    /**
     * Gets the value of the assetAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link AccountRef }
     *     
     */
    public AccountRef getAssetAccountRef() {
        return assetAccountRef;
    }

    /**
     * Sets the value of the assetAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountRef }
     *     
     */
    public void setAssetAccountRef(AccountRef value) {
        this.assetAccountRef = value;
    }

    /**
     * Gets the value of the prefVendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link VendorRef }
     *     
     */
    public VendorRef getPrefVendorRef() {
        return prefVendorRef;
    }

    /**
     * Sets the value of the prefVendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorRef }
     *     
     */
    public void setPrefVendorRef(VendorRef value) {
        this.prefVendorRef = value;
    }

    /**
     * Gets the value of the avgCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAvgCost() {
        return avgCost;
    }

    /**
     * Sets the value of the avgCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAvgCost(Money value) {
        this.avgCost = value;
    }

    /**
     * Gets the value of the qtyOnHand property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * Sets the value of the qtyOnHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnHand(BigDecimal value) {
        this.qtyOnHand = value;
    }

    /**
     * Gets the value of the qtyOnPurchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnPurchaseOrder() {
        return qtyOnPurchaseOrder;
    }

    /**
     * Sets the value of the qtyOnPurchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnPurchaseOrder(BigDecimal value) {
        this.qtyOnPurchaseOrder = value;
    }

    /**
     * Gets the value of the qtyOnSalesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtyOnSalesOrder() {
        return qtyOnSalesOrder;
    }

    /**
     * Sets the value of the qtyOnSalesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtyOnSalesOrder(BigDecimal value) {
        this.qtyOnSalesOrder = value;
    }

    /**
     * Gets the value of the reorderPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReorderPoint() {
        return reorderPoint;
    }

    /**
     * Sets the value of the reorderPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReorderPoint(BigDecimal value) {
        this.reorderPoint = value;
    }

    /**
     * Gets the value of the manPartNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManPartNum() {
        return manPartNum;
    }

    /**
     * Sets the value of the manPartNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManPartNum(String value) {
        this.manPartNum = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Item)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Item that = ((Item) object);
        {
            IdType lhsItemParentId;
            lhsItemParentId = this.getItemParentId();
            IdType rhsItemParentId;
            rhsItemParentId = that.getItemParentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemParentId", lhsItemParentId), LocatorUtils.property(thatLocator, "itemParentId", rhsItemParentId), lhsItemParentId, rhsItemParentId)) {
                return false;
            }
        }
        {
            String lhsItemParentName;
            lhsItemParentName = this.getItemParentName();
            String rhsItemParentName;
            rhsItemParentName = that.getItemParentName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemParentName", lhsItemParentName), LocatorUtils.property(thatLocator, "itemParentName", rhsItemParentName), lhsItemParentName, rhsItemParentName)) {
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
            String lhsDesc;
            lhsDesc = this.getDesc();
            String rhsDesc;
            rhsDesc = that.getDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "desc", lhsDesc), LocatorUtils.property(thatLocator, "desc", rhsDesc), lhsDesc, rhsDesc)) {
                return false;
            }
        }
        {
            Boolean lhsTaxable;
            lhsTaxable = this.isTaxable();
            Boolean rhsTaxable;
            rhsTaxable = that.isTaxable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxable", lhsTaxable), LocatorUtils.property(thatLocator, "taxable", rhsTaxable), lhsTaxable, rhsTaxable)) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive)) {
                return false;
            }
        }
        {
            Money lhsUnitPrice;
            lhsUnitPrice = this.getUnitPrice();
            Money rhsUnitPrice;
            rhsUnitPrice = that.getUnitPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitPrice", lhsUnitPrice), LocatorUtils.property(thatLocator, "unitPrice", rhsUnitPrice), lhsUnitPrice, rhsUnitPrice)) {
                return false;
            }
        }
        {
            ItemTypeEnum lhsType;
            lhsType = this.getType();
            ItemTypeEnum rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            IdType lhsUOMId;
            lhsUOMId = this.getUOMId();
            IdType rhsUOMId;
            rhsUOMId = that.getUOMId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomId", lhsUOMId), LocatorUtils.property(thatLocator, "uomId", rhsUOMId), lhsUOMId, rhsUOMId)) {
                return false;
            }
        }
        {
            String lhsUOMAbbrv;
            lhsUOMAbbrv = this.getUOMAbbrv();
            String rhsUOMAbbrv;
            rhsUOMAbbrv = that.getUOMAbbrv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uomAbbrv", lhsUOMAbbrv), LocatorUtils.property(thatLocator, "uomAbbrv", rhsUOMAbbrv), lhsUOMAbbrv, rhsUOMAbbrv)) {
                return false;
            }
        }
        {
            AccountRef lhsIncomeAccountRef;
            lhsIncomeAccountRef = this.getIncomeAccountRef();
            AccountRef rhsIncomeAccountRef;
            rhsIncomeAccountRef = that.getIncomeAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incomeAccountRef", lhsIncomeAccountRef), LocatorUtils.property(thatLocator, "incomeAccountRef", rhsIncomeAccountRef), lhsIncomeAccountRef, rhsIncomeAccountRef)) {
                return false;
            }
        }
        {
            String lhsPurchaseDesc;
            lhsPurchaseDesc = this.getPurchaseDesc();
            String rhsPurchaseDesc;
            rhsPurchaseDesc = that.getPurchaseDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseDesc", lhsPurchaseDesc), LocatorUtils.property(thatLocator, "purchaseDesc", rhsPurchaseDesc), lhsPurchaseDesc, rhsPurchaseDesc)) {
                return false;
            }
        }
        {
            Money lhsPurchaseCost;
            lhsPurchaseCost = this.getPurchaseCost();
            Money rhsPurchaseCost;
            rhsPurchaseCost = that.getPurchaseCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purchaseCost", lhsPurchaseCost), LocatorUtils.property(thatLocator, "purchaseCost", rhsPurchaseCost), lhsPurchaseCost, rhsPurchaseCost)) {
                return false;
            }
        }
        {
            AccountRef lhsExpenseAccountRef;
            lhsExpenseAccountRef = this.getExpenseAccountRef();
            AccountRef rhsExpenseAccountRef;
            rhsExpenseAccountRef = that.getExpenseAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expenseAccountRef", lhsExpenseAccountRef), LocatorUtils.property(thatLocator, "expenseAccountRef", rhsExpenseAccountRef), lhsExpenseAccountRef, rhsExpenseAccountRef)) {
                return false;
            }
        }
        {
            AccountRef lhsCOGSAccountRef;
            lhsCOGSAccountRef = this.getCOGSAccountRef();
            AccountRef rhsCOGSAccountRef;
            rhsCOGSAccountRef = that.getCOGSAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cogsAccountRef", lhsCOGSAccountRef), LocatorUtils.property(thatLocator, "cogsAccountRef", rhsCOGSAccountRef), lhsCOGSAccountRef, rhsCOGSAccountRef)) {
                return false;
            }
        }
        {
            AccountRef lhsAssetAccountRef;
            lhsAssetAccountRef = this.getAssetAccountRef();
            AccountRef rhsAssetAccountRef;
            rhsAssetAccountRef = that.getAssetAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assetAccountRef", lhsAssetAccountRef), LocatorUtils.property(thatLocator, "assetAccountRef", rhsAssetAccountRef), lhsAssetAccountRef, rhsAssetAccountRef)) {
                return false;
            }
        }
        {
            VendorRef lhsPrefVendorRef;
            lhsPrefVendorRef = this.getPrefVendorRef();
            VendorRef rhsPrefVendorRef;
            rhsPrefVendorRef = that.getPrefVendorRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prefVendorRef", lhsPrefVendorRef), LocatorUtils.property(thatLocator, "prefVendorRef", rhsPrefVendorRef), lhsPrefVendorRef, rhsPrefVendorRef)) {
                return false;
            }
        }
        {
            Money lhsAvgCost;
            lhsAvgCost = this.getAvgCost();
            Money rhsAvgCost;
            rhsAvgCost = that.getAvgCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avgCost", lhsAvgCost), LocatorUtils.property(thatLocator, "avgCost", rhsAvgCost), lhsAvgCost, rhsAvgCost)) {
                return false;
            }
        }
        {
            BigDecimal lhsQtyOnHand;
            lhsQtyOnHand = this.getQtyOnHand();
            BigDecimal rhsQtyOnHand;
            rhsQtyOnHand = that.getQtyOnHand();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qtyOnHand", lhsQtyOnHand), LocatorUtils.property(thatLocator, "qtyOnHand", rhsQtyOnHand), lhsQtyOnHand, rhsQtyOnHand)) {
                return false;
            }
        }
        {
            BigDecimal lhsQtyOnPurchaseOrder;
            lhsQtyOnPurchaseOrder = this.getQtyOnPurchaseOrder();
            BigDecimal rhsQtyOnPurchaseOrder;
            rhsQtyOnPurchaseOrder = that.getQtyOnPurchaseOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qtyOnPurchaseOrder", lhsQtyOnPurchaseOrder), LocatorUtils.property(thatLocator, "qtyOnPurchaseOrder", rhsQtyOnPurchaseOrder), lhsQtyOnPurchaseOrder, rhsQtyOnPurchaseOrder)) {
                return false;
            }
        }
        {
            BigDecimal lhsQtyOnSalesOrder;
            lhsQtyOnSalesOrder = this.getQtyOnSalesOrder();
            BigDecimal rhsQtyOnSalesOrder;
            rhsQtyOnSalesOrder = that.getQtyOnSalesOrder();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qtyOnSalesOrder", lhsQtyOnSalesOrder), LocatorUtils.property(thatLocator, "qtyOnSalesOrder", rhsQtyOnSalesOrder), lhsQtyOnSalesOrder, rhsQtyOnSalesOrder)) {
                return false;
            }
        }
        {
            BigDecimal lhsReorderPoint;
            lhsReorderPoint = this.getReorderPoint();
            BigDecimal rhsReorderPoint;
            rhsReorderPoint = that.getReorderPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reorderPoint", lhsReorderPoint), LocatorUtils.property(thatLocator, "reorderPoint", rhsReorderPoint), lhsReorderPoint, rhsReorderPoint)) {
                return false;
            }
        }
        {
            String lhsManPartNum;
            lhsManPartNum = this.getManPartNum();
            String rhsManPartNum;
            rhsManPartNum = that.getManPartNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manPartNum", lhsManPartNum), LocatorUtils.property(thatLocator, "manPartNum", rhsManPartNum), lhsManPartNum, rhsManPartNum)) {
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
            IdType theItemParentId;
            theItemParentId = this.getItemParentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemParentId", theItemParentId), currentHashCode, theItemParentId);
        }
        {
            String theItemParentName;
            theItemParentName = this.getItemParentName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemParentName", theItemParentName), currentHashCode, theItemParentName);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theDesc;
            theDesc = this.getDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "desc", theDesc), currentHashCode, theDesc);
        }
        {
            Boolean theTaxable;
            theTaxable = this.isTaxable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxable", theTaxable), currentHashCode, theTaxable);
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive);
        }
        {
            Money theUnitPrice;
            theUnitPrice = this.getUnitPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitPrice", theUnitPrice), currentHashCode, theUnitPrice);
        }
        {
            ItemTypeEnum theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            IdType theUOMId;
            theUOMId = this.getUOMId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomId", theUOMId), currentHashCode, theUOMId);
        }
        {
            String theUOMAbbrv;
            theUOMAbbrv = this.getUOMAbbrv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uomAbbrv", theUOMAbbrv), currentHashCode, theUOMAbbrv);
        }
        {
            AccountRef theIncomeAccountRef;
            theIncomeAccountRef = this.getIncomeAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incomeAccountRef", theIncomeAccountRef), currentHashCode, theIncomeAccountRef);
        }
        {
            String thePurchaseDesc;
            thePurchaseDesc = this.getPurchaseDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseDesc", thePurchaseDesc), currentHashCode, thePurchaseDesc);
        }
        {
            Money thePurchaseCost;
            thePurchaseCost = this.getPurchaseCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purchaseCost", thePurchaseCost), currentHashCode, thePurchaseCost);
        }
        {
            AccountRef theExpenseAccountRef;
            theExpenseAccountRef = this.getExpenseAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expenseAccountRef", theExpenseAccountRef), currentHashCode, theExpenseAccountRef);
        }
        {
            AccountRef theCOGSAccountRef;
            theCOGSAccountRef = this.getCOGSAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cogsAccountRef", theCOGSAccountRef), currentHashCode, theCOGSAccountRef);
        }
        {
            AccountRef theAssetAccountRef;
            theAssetAccountRef = this.getAssetAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assetAccountRef", theAssetAccountRef), currentHashCode, theAssetAccountRef);
        }
        {
            VendorRef thePrefVendorRef;
            thePrefVendorRef = this.getPrefVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prefVendorRef", thePrefVendorRef), currentHashCode, thePrefVendorRef);
        }
        {
            Money theAvgCost;
            theAvgCost = this.getAvgCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avgCost", theAvgCost), currentHashCode, theAvgCost);
        }
        {
            BigDecimal theQtyOnHand;
            theQtyOnHand = this.getQtyOnHand();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qtyOnHand", theQtyOnHand), currentHashCode, theQtyOnHand);
        }
        {
            BigDecimal theQtyOnPurchaseOrder;
            theQtyOnPurchaseOrder = this.getQtyOnPurchaseOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qtyOnPurchaseOrder", theQtyOnPurchaseOrder), currentHashCode, theQtyOnPurchaseOrder);
        }
        {
            BigDecimal theQtyOnSalesOrder;
            theQtyOnSalesOrder = this.getQtyOnSalesOrder();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qtyOnSalesOrder", theQtyOnSalesOrder), currentHashCode, theQtyOnSalesOrder);
        }
        {
            BigDecimal theReorderPoint;
            theReorderPoint = this.getReorderPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reorderPoint", theReorderPoint), currentHashCode, theReorderPoint);
        }
        {
            String theManPartNum;
            theManPartNum = this.getManPartNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manPartNum", theManPartNum), currentHashCode, theManPartNum);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}