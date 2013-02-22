package org.springframework.social.intuit.builder;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.intuit.sb.cdm.v2.Customer;
import com.intuit.sb.cdm.v2.EmailAddress;
import com.intuit.sb.cdm.v2.IdType;
import com.intuit.sb.cdm.v2.ModificationMetaData;
import com.intuit.sb.cdm.v2.PartyType;
import com.intuit.sb.cdm.v2.PhysicalAddress;
import com.intuit.sb.cdm.v2.TelephoneNumber;
import com.intuit.sb.cdm.v2.WebSiteAddress;

public class CustomerBuilder {

	private Customer customer;
	
	public CustomerBuilder(){
		this.customer = new Customer();
		
		this.customer.setTypeOf(PartyType.PERSON);
		this.customer.setName("John Doe");
		this.customer.setFamilyName("Doe");
		this.customer.setGivenName("John");
		this.customer.setMiddleName("J");
						
		WebSiteAddress webSiteAddress = new WebSiteAddress();
		webSiteAddress.setURI("http://www.digitalinsight.mint.com/");
		this.customer.getWebSites().add(webSiteAddress);
		
		this.customer.setDBAName("Mint");
		IdType salesTermId = new IdType();
		salesTermId.setValue("5");
		this.customer.setSalesTermId(salesTermId);
		
		
		EmailAddress emailAddress = new EmailAddress();
		emailAddress.setAddress("john_doe@digitalinsight.mint.com");
		this.customer.getEmails().add(emailAddress);
		
		PhysicalAddress address = new PhysicalAddress();
		address.setLine1("Park Avenue");
		address.setCity("Woodland Hills");
		address.setCountrySubDivisionCode("CA");
		address.setPostalCode("91367");
		this.customer.getAddresses().add(address);
	}
		
	public static CustomerBuilder DefaultCustomer() {
		return new CustomerBuilder();
	}
	
	public CustomerBuilder withId(Long id){
		IdType idType = new IdType();
		idType.setValue(id.toString());
		this.customer.setId(idType);
		return this;
	}
	
	public CustomerBuilder withMobileNumber(String mobileNumber){
		TelephoneNumber mobile = new TelephoneNumber();
		mobile.setDeviceType("Mobile");
		mobile.setFreeFormNumber(mobileNumber);
		this.customer.getPhones().add(mobile);
		return this;
	}

	public CustomerBuilder withFaxNumber(String faxNumber){
		TelephoneNumber fax = new TelephoneNumber();
		fax.setDeviceType("Fax");
		fax.setFreeFormNumber(faxNumber);
		this.customer.getPhones().add(fax);
		return this;
	}

	public CustomerBuilder withSyncToken(String syncToken){
		this.customer.setSyncToken(syncToken);
		return this;		
	}

	public CustomerBuilder withAddressLine2(String addressLine2){
		PhysicalAddress physicalAddress = this.customer.getAddresses().get(0);
		physicalAddress.setLine2(addressLine2);
		return this;		
	}

	public CustomerBuilder withMetaData(String createTimeString, String lastUpdatedTimeString){
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
		this.customer.setMetaData(metaData);
		return this;		
	}

	public Customer build() {
		return this.customer;
	}
	
}
