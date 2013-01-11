package org.springframework.social.intuit.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.IntuitProfile;
import org.springframework.social.intuit.api.UserOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.qbo.QboUser;

public class UserTemplate implements UserOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	private final String companyId;

	public UserTemplate(boolean isAuthorized, RestTemplate restTemplate, String companyId) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
		this.companyId = companyId;
	}

	public IntuitProfile getUserProfile() {
		QboUser response = restTemplate.getForObject("https://qbo.intuit.com/qbo1/rest/user/v2/{companyId}", QboUser.class, companyId);		
		return new IntuitProfile(response);
	}

	public String getName() {
		return getUserProfile().getName();
	}

	public String getTicket() {
		return getUserProfile().getTicket();
	}

	public String getAgentId() {
		return getUserProfile().getAgentId();
	}

	public String getCompanyId() {
		return getUserProfile().getCompanyId();
	}

	public String getBaseUrl() {
		return "https://qbo.sbfinance.intuit.com";	
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}

}
