package org.springframework.social.intuit.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.social.intuit.api.AccountOperations;
import org.springframework.social.intuit.api.CompanyMetaDataOperations;
import org.springframework.social.intuit.api.CustomerOperations;
import org.springframework.social.intuit.api.Intuit;
import org.springframework.social.intuit.api.InvoiceOperations;
import org.springframework.social.intuit.api.ItemOperations;
import org.springframework.social.intuit.api.PaymentMethodOperations;
import org.springframework.social.intuit.api.PaymentOperations;
import org.springframework.social.intuit.api.UserOperations;
import org.springframework.social.oauth1.AbstractOAuth1ApiBinding;

public class IntuitTemplate extends AbstractOAuth1ApiBinding implements Intuit {
	
	private AccountOperations accountOperations;
	private CompanyMetaDataOperations companyMetaDataOperations;
	private CustomerOperations customerOperations;
	private UserOperations userOperations;
	private PaymentOperations paymentOperations;
	private PaymentMethodOperations paymentMethodOperations;
	private InvoiceOperations invoiceOperations;
	private ItemOperations itemOperations;
	
	private String companyId;
	private String baseUrl;

	public IntuitTemplate(String consumerKey, String consumerSecret, String accessToken, String accessTokenSecret) {
		super(consumerKey, consumerSecret, accessToken, accessTokenSecret);		
	}
	
	@Override
	protected List<HttpMessageConverter<?>> getMessageConverters() {		
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(getFormMessageConverter());
		converters.add(new StringHttpMessageConverter());
		converters.add(new Jaxb2RootElementHttpMessageConverter());
		return converters;
	}

	private void initSubApis() {
		if(!isInitialized()){
			companyMetaDataOperations = new CompanyMetaDataTemplate(isAuthorized(), getRestTemplate());
			String companyId = companyMetaDataOperations.getCompanyMetaData().getCompanyId();
			userOperations = new UserTemplate(isAuthorized(), getRestTemplate(), companyId);
			String baseUrl = userOperations.getBaseUrl();
			accountOperations = new AccountTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
			customerOperations = new CustomerTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
			paymentOperations = new PaymentTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
			paymentMethodOperations = new PaymentMethodTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
			invoiceOperations = new InvoiceTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
			itemOperations = new ItemTemplate(isAuthorized(), getRestTemplate(), companyId, baseUrl);
		}
	}

	public CompanyMetaDataOperations companyMetaDataOperations() {
		initSubApis();
		return companyMetaDataOperations;
	}

	public AccountOperations accountOperations() {
		initSubApis();
		return accountOperations;
	}

	public CustomerOperations customerOperations() {
		initSubApis();
		return customerOperations;
	}	

	public UserOperations userOperations() {
		initSubApis();
		return userOperations;
	}
	
	public PaymentOperations paymentOperations() {
		initSubApis();
		return paymentOperations;
	}

	public PaymentMethodOperations paymentMethodOperations() {
		initSubApis();
		return paymentMethodOperations;
	}
	
	public InvoiceOperations invoiceOperations(){
		initSubApis();
		return invoiceOperations;
	}
	
	public ItemOperations itemOperations() {
		initSubApis();
		return itemOperations;
	}

	private boolean isInitialized(){
		if(baseUrl != null && companyId != null){
			return true;
		}
		return false;
	}
}
