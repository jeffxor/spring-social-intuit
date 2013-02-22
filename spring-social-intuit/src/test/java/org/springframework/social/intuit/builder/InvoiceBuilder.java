package org.springframework.social.intuit.builder;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.intuit.sb.cdm.v2.IdDomainEnum;
import com.intuit.sb.cdm.v2.IdType;
import com.intuit.sb.cdm.v2.Invoice;
import com.intuit.sb.cdm.v2.InvoiceHeader;
import com.intuit.sb.cdm.v2.InvoiceLine;
import com.intuit.sb.cdm.v2.ModificationMetaData;

public class InvoiceBuilder {

	private Invoice invoice;
	
	public InvoiceBuilder(){
		this.invoice = new Invoice();
		InvoiceHeader invoiceHeader = new InvoiceHeader();
		
		invoiceHeader.setDocNumber("000101");
		invoiceHeader.setMsg("No Black Ink Pens");
		invoiceHeader.setNote("Blue Ink pens only");
		IdType customerId = new IdType();
		customerId.setValue("5");
		invoiceHeader.setCustomerId(customerId);
		invoiceHeader.setSubTotalAmt(new BigDecimal("200.00"));
		invoiceHeader.setTotalAmt(new BigDecimal("298.75"));
		invoiceHeader.setBillEmail("john_doe@digitalinsight.com");
		invoiceHeader.setDiscountAmt(new BigDecimal("-1.25"));
		
		XMLGregorianCalendar txnDate = null;
		XMLGregorianCalendar dueDate = null;
		try {
			txnDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2010-08-07");
			dueDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2010-08-16");
		} catch (DatatypeConfigurationException e) {
		}
		invoiceHeader.setTxnDate(txnDate);
		invoiceHeader.setDueDate(dueDate);
		
		invoice.setHeader(invoiceHeader);
		
		InvoiceLine invoiceLine = new InvoiceLine();
		invoiceLine.setDesc("Pens");
		invoiceLine.setAmount(new BigDecimal("200.00"));
		invoiceLine.setTaxable(true);
		IdType itemId = new IdType();
		itemId.setValue("4");
		invoiceLine.setItemId(itemId);
		invoiceLine.setUnitPrice(new BigDecimal("100"));
		invoiceLine.setQty(new BigDecimal("4"));
		
		invoice.getLines().add(invoiceLine);
		
	}
	public static InvoiceBuilder DefaultInvoice() {
		return new InvoiceBuilder();
	}
	
	public InvoiceBuilder withId(Long id){
		IdType idType = new IdType();
		idType.setValue(id.toString());
		this.invoice.setId(idType);
		return this;
	}

	public InvoiceBuilder withSyncToken(String syncToken){
		this.invoice.setSyncToken(syncToken);
		return this;		
	}

	public InvoiceBuilder withMetaData(String createTimeString, String lastUpdatedTimeString){
		XMLGregorianCalendar createTime = null;
		XMLGregorianCalendar lastUpdatedTime = null;
		try {
			createTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(createTimeString);
			lastUpdatedTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(lastUpdatedTimeString);
		} catch (DatatypeConfigurationException e) {
		}
		ModificationMetaData metaData = new ModificationMetaData();
		metaData.setCreateTime(createTime);
		metaData.setLastUpdatedTime(lastUpdatedTime);
		this.invoice.setMetaData(metaData);
		return this;		
	}

	public InvoiceBuilder withSalesTaxCodeId(String salesTaxCodeId){
		InvoiceHeader invoiceHeader = this.invoice.getHeader();
		IdType salesTaxCodeIdType = new IdType();
		salesTaxCodeIdType.setValue(salesTaxCodeId);		
		salesTaxCodeIdType.setIdDomain(IdDomainEnum.QBO);
		invoiceHeader.setSalesTaxCodeId(salesTaxCodeIdType);
		return this;		
	}

	public InvoiceBuilder withSalesTaxCodeName(String salesTaxCodeId){
		InvoiceHeader invoiceHeader = this.invoice.getHeader();
		invoiceHeader.setSalesTaxCodeName(salesTaxCodeId);
		return this;		
	}
	
	public InvoiceBuilder withTaxRate(BigDecimal taxRate){
		InvoiceHeader invoiceHeader = this.invoice.getHeader();
		invoiceHeader.setTaxRate(taxRate);
		return this;		
	}

	public InvoiceBuilder withTaxAmount(BigDecimal taxAmount){
		InvoiceHeader invoiceHeader = this.invoice.getHeader();
		invoiceHeader.setTaxAmt(taxAmount);
		return this;		
	}

	public Invoice build() {
		return this.invoice;
	}
	
}
