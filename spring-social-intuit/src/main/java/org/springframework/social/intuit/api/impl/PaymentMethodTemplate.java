package org.springframework.social.intuit.api.impl;

import java.util.List;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.PaymentMethodOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.v2.PaymentMethod;
import com.intuit.sb.cdm.v2.PaymentMethods;
import com.intuit.sb.cdm.qbo.SearchResults;

public class PaymentMethodTemplate implements PaymentMethodOperations {

	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;
	private final String baseUrl;

	public PaymentMethodTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId, String baseUrl) {
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
		this.baseUrl = baseUrl;
	}

	public PaymentMethod getPaymentMethod(Long id) {
		requireAuthorization();
		return restTemplate.getForObject("{baseURL}/resource/payment-method/v2/{companyId}/{paymentMethodId}", PaymentMethod.class, baseUrl, companyId, id);
	}

	public List<PaymentMethod> getPaymentMethods() {
		requireAuthorization();		
		SearchResults response = restTemplate.postForObject("{baseURL}/resource/payment-methods/v2/{companyId}", null, SearchResults.class, baseUrl, companyId);
		if(response != null){
			return ((PaymentMethods)response.getCdmCollections()).getPaymentMethods();
		}
		return null;
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}
}
