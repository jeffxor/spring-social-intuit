package org.springframework.social.intuit.api.impl;

import java.util.List;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.PaymentOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.qbo.v2.Customer;
import com.intuit.sb.cdm.qbo.v2.Payment;
import com.intuit.sb.cdm.qbo.v2.Payments;
import com.intuit.sb.cdm.qbo.v2.SearchResults;

public class PaymentTemplate implements PaymentOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public PaymentTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl;
	}

	public Payment getPayment(Long id) {
		requireAuthorization();
		return restTemplate.getForObject("{baseURL}/resource/payment/v2/{companyId}/{paymentId}", Payment.class, baseUrl, companyId, id);
	}

	public List<Payment> getPayments() {
		requireAuthorization();		
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/payments/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((Payments)response.getCdmCollections()).getPayment();
		}
		return null;
	}

	public List<Payment> getPayments(Customer customer) {
		requireAuthorization();
		MultiValueMap<String, String> criteria = new LinkedMultiValueMap<String, String>();
		criteria.add("Filter", "CustomerId :EQUALS: " + customer.getId().getValue());
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/payments/v2/{companyId}", criteria, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((Payments)response.getCdmCollections()).getPayment();
		}
		return null;
	}

	public Payment update(Payment payment) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/payment/v2/{companyId}/{customerID}", payment, Payment.class, baseUrl, companyId, payment.getId().getValue());
	}

	public Payment create(Payment payment) {
		requireAuthorization();
		return restTemplate.postForObject("{baseURL}/resource/payment/v2/{companyId}/", payment, Payment.class, baseUrl, companyId);
	}

	public boolean delete(Payment payment) {
		requireAuthorization();
		Payment response = restTemplate.postForObject("{baseURL}/resource/customer/v2/{companyId}/{customerID}?methodx=delete", payment, Payment.class, baseUrl, companyId, payment.getId().getValue());
		return (response.getId() != null);
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}

}