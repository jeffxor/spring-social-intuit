package org.springframework.social.intuit.api.impl;

import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.intuit.api.IntuitProfile;
import org.springframework.social.intuit.api.UserOperations;
import org.springframework.web.client.RestTemplate;

import com.intuit.platform.api.v1.UserResponse;


public class UserTemplate implements UserOperations {
	
	private final boolean isAuthorized;
	private final RestTemplate restTemplate;

	public UserTemplate(boolean isAuthorized, RestTemplate restTemplate) {
		super();
		this.isAuthorized = isAuthorized;
		this.restTemplate = restTemplate;
	}

	public IntuitProfile getUserProfile() {
		UserResponse userResponse = restTemplate.getForObject("https://appcenter.intuit.com/api/v1/user/current", UserResponse.class);
		return new IntuitProfile(userResponse.getUser());
	}

	public String getName() {
		return getUserProfile().getName();
	}
	
	public String getFirstName() {
		return getUserProfile().getFirstName();
	}

	public String getLastName() {
		return getUserProfile().getLastName();
	}

	public String getEmailAddress() {
		return getUserProfile().getEmailAddress();
	}

	protected void requireAuthorization() {
		if (!isAuthorized) {
			throw new MissingAuthorizationException("intuit");
		}
	}

}
