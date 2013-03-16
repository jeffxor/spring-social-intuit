package org.springframework.social.intuit.builder;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.intuit.sb.cdm.v2.Account;
import com.intuit.sb.cdm.v2.IdType;
import com.intuit.sb.cdm.v2.ModificationMetaData;
import com.intuit.sb.cdm.v2.QboAccountDetailTypeEnum;

public class AccountBuilder {

	private Account account;
	
	public AccountBuilder(){
		this.account = new Account();
		this.account.setName("Loan Account");
		this.account.setDesc("Loan Account");
		this.account.setSubtype(QboAccountDetailTypeEnum.SAVINGS.value());
		this.account.setAcctNum("5001");
	}
	
	public static AccountBuilder DefaultAccount() {
		return new AccountBuilder();
	}
	
	public AccountBuilder withId(Long id){
		IdType idType = new IdType();
		idType.setValue(id.toString());
		this.account.setId(idType);
		return this;
	}

	public AccountBuilder withSyncToken(String syncToken){
		this.account.setSyncToken(syncToken);
		return this;		
	}

	public AccountBuilder withOpeningBalanceDate(String openingBalanceDateString){
		
		XMLGregorianCalendar openingBalanceDate = null;
		try {
			openingBalanceDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(openingBalanceDateString);
		} catch (DatatypeConfigurationException e) {
		}
		this.account.setOpeningBalanceDate(openingBalanceDate.toGregorianCalendar());
		return this;		
	}

	public AccountBuilder withDescription(String description){
		this.account.setDesc(description);
		return this;		
	}

	public AccountBuilder withMetaData(String createTimeString, String lastUpdatedTimeString){
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
		this.account.setMetaData(metaData);
		return this;		
	}

	public Account build() {
		return this.account;
	}
	
}
