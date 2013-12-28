package org.springframework.social.intuit.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.CompanyMetaDataOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.sb.cdm.v2.CompanyMetaData;
import com.intuit.sb.cdm.v2.RestResponse;

public class CompanyMetaDataTemplate implements CompanyMetaDataOperations {
	
	private static final String url = "https://services.intuit.com/sb/company/v2/availableList";
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;
	
	public CompanyMetaDataTemplate(boolean isAuthorized, RestTemplate restTemplate) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
	}

	public CompanyMetaData getCompanyMetaData() {
		requireAuthorization();
		RestResponse restResponse = restTemplate.getForObject(url, RestResponse.class);
		if(restResponse != null){
			return restResponse.getCompaniesMetaData().getCompanyMetaDatas().get(1);
		}
		return null;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

}
