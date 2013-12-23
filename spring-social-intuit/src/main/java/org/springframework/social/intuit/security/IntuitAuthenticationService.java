package org.springframework.social.intuit.security;

import org.springframework.social.connect.support.OAuth1ConnectionFactory;
import org.springframework.social.intuit.api.Intuit;
import org.springframework.social.intuit.connect.IntuitConnectionFactory;
import org.springframework.social.security.provider.OAuth1AuthenticationService;

public class IntuitAuthenticationService extends OAuth1AuthenticationService<Intuit> {

	public IntuitAuthenticationService(String consumerKey, String consumerSecret) {
		super(new IntuitConnectionFactory(consumerKey, consumerSecret));
	}
}
