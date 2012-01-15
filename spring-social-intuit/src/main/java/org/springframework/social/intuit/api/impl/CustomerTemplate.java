package org.springframework.social.intuit.api.impl;

import java.util.List;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.CustomerOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.qbo.v2.Customer;
import com.intuit.sb.cdm.qbo.v2.Customers;
import com.intuit.sb.cdm.qbo.v2.SearchResults;

public class CustomerTemplate implements CustomerOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public CustomerTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl;
	}

	public Customer getCustomer(Long customerId) {
		requireAuthorization();
		return restTemplate.getForObject("{baseURL}/resource/customer/v2/{companyId}/{customerID}", Customer.class, baseUrl, companyId, customerId);
	}

	public List<Customer> getCustomers() {
		requireAuthorization();		
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/customers/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((Customers)response.getCdmCollections()).getCustomer();
		}
		return null;
	}

	public Customer update(Customer customer) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/customer/v2/{companyId}/{customerID}", customer, Customer.class, baseUrl, companyId, customer.getId().getValue());
	}

	public Customer create(Customer customer) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/customer/v2/{companyId}/", customer, Customer.class, baseUrl, companyId);
	}

	public boolean delete(Customer customer) {
		requireAuthorization();
		Customer response = restTemplate.postForObject("{baseURL}/resource/customer/v2/{companyId}/{customerID}?methodx=delete", customer, Customer.class, baseUrl, companyId, customer.getId().getValue());
		return (response.getId() != null);
	}
	
	private Customer buildDelete(Customer customer){
		Customer delete = new Customer();
		delete.setSyncToken(customer.getSyncToken());
		delete.setId(customer.getId());
		
		return delete;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}

}
