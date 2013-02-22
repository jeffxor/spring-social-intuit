package org.springframework.social.intuit.builder;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.intuit.sb.cdm.v2.AccountRef;
import com.intuit.sb.cdm.v2.IdType;
import com.intuit.sb.cdm.v2.Item;
import com.intuit.sb.cdm.v2.ModificationMetaData;
import com.intuit.sb.cdm.v2.Money;

public class ItemBuilder {

	private Item item;
	
	public ItemBuilder(){
		this.item = new Item();
		this.item.setName("Pencils");
		this.item.setDesc("Pencils HB");
		this.item.setTaxable(true);
		Money unitPrice = new Money();
		unitPrice.setAmount(new BigDecimal("2"));
		this.item.setUnitPrice(unitPrice);
		
		AccountRef incomeAccountRef = new AccountRef();
		IdType accountId = new IdType();
		accountId.setValue("30");
		incomeAccountRef.setAccountId(accountId);
		this.item.setIncomeAccountRef(incomeAccountRef);
		
		this.item.setPurchaseDesc("500 pencils purchased");

		Money purchaseCost = new Money();
		purchaseCost.setAmount(new BigDecimal("1"));
		this.item.setPurchaseCost(purchaseCost);

		AccountRef expenseAccountRef = new AccountRef();
		IdType expenseAccountId = new IdType();
		expenseAccountId.setValue("30");
		expenseAccountRef.setAccountId(expenseAccountId);
		this.item.setExpenseAccountRef(expenseAccountRef);		
	}

	
	public static ItemBuilder DefaultItem() {
		return new ItemBuilder();
	}
	
	public ItemBuilder withId(Long id){
		IdType idType = new IdType();
		idType.setValue(id.toString());
		this.item.setId(idType);
		return this;
	}

	public ItemBuilder withSyncToken(String syncToken){
		this.item.setSyncToken(syncToken);
		return this;		
	}

	public ItemBuilder withDescription(String description){
		this.item.setDesc(description);
		return this;		
	}

	public ItemBuilder withMetaData(String createTimeString, String lastUpdatedTimeString){
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
		this.item.setMetaData(metaData);
		return this;		
	}

	public Item build() {
		return this.item;
	}

	public ItemBuilder withUnitPrice(BigDecimal unitPriceValue) {
		Money unitPrice = new Money();
		unitPrice.setAmount(unitPriceValue);
		this.item.setUnitPrice(unitPrice);
		return this;
	}
	
}
