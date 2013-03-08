package org.springframework.social.intuit.api.impl;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.CompanyMetaData;
import org.springframework.social.intuit.api.CompanyMetaDataOperations;
import org.springframework.social.intuit.api.RestResponse;
import org.springframework.web.client.RestTemplate;

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
		String response = restTemplate.getForObject(url, String.class);
		RestResponse restResponse = CompanyMetaDataTemplate.serializeForObject(RestResponse.class, response);
		if(restResponse != null){
			return restResponse.getCompaniesMetaData().get(1);
		}
		return null;
	}
	
	public static <T> T serializeForObject(Class<? extends T> type, String source){
		Serializer serializer = new Persister(new AnnotationStrategy());
		try {
			return serializer.read(type, source);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return null;
	}
	
	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException();
		}
	}

}
